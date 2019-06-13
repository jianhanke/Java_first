import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuiChat extends JFrame{
	private static final int DEFAULT_PORT=8899;
	private JLabel stateLB;
	private JTextArea centerTextArea;
	private JPanel southPanel;
	private JTextArea inputTextArea;
	private JPanel bottomPanel;
	private JTextField ipTextField;
	private JTextField remotePortTF;
	private JButton sendBT;
	private JButton clearBT;
	private DatagramSocket datagramSocket;
	
	private void setUpUI() {               // 初始化Swing窗口
		// 初始化窗口
		setTitle("GUI聊天");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);             // 设置窗口的大小
		setResizable(false);           // 窗口大小不可调整
		setLocationRelativeTo(null); // 窗口居中
		// 窗口的NORTH部分
		stateLB = new JLabel("当前还未启动监听22");
		stateLB.setHorizontalAlignment(JLabel.RIGHT);
		// 窗口的CENTER部分
		centerTextArea = new JTextArea();     // 聊天记录显示区域
		centerTextArea.setEditable(false);
		centerTextArea.setBackground(new Color(211, 211, 211));
		// 窗口的SOUTH部分
		southPanel = new JPanel(new BorderLayout());
		inputTextArea = new JTextArea(5, 20);// 内容输入区域
		bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,5,5));
		ipTextField = new JTextField("127.0.0.1", 8);
		remotePortTF = new JTextField(String.valueOf(DEFAULT_PORT), 3);
		sendBT = new JButton("发送");
		clearBT = new JButton("清屏");
		bottomPanel.add(ipTextField);
		bottomPanel.add(remotePortTF);
		bottomPanel.add(sendBT);
		bottomPanel.add(clearBT);
		southPanel.add(new JScrollPane(inputTextArea), BorderLayout.CENTER);
		southPanel.add(bottomPanel, BorderLayout.SOUTH);
		// 添加窗口NORTH、CENTER、SOUTH部分的组件
		add(stateLB, BorderLayout.NORTH);
		add(new JScrollPane(centerTextArea), BorderLayout.CENTER);
		add(southPanel, BorderLayout.SOUTH);
		setVisible(true);
	}
	
	private void setListener() {
		sendBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final String ipAddress=ipTextField.getText();
				final String remotePort=remotePortTF.getText();
				if(ipAddress==null || ipAddress.trim().equals("") || remotePort==null || remotePort.trim().equals("")) {
					JOptionPane.showMessageDialog(GuiChat.this,"请输入IP地址和端口号");
					return ;
				}
				if(datagramSocket==null || datagramSocket.isClosed()) {
					JOptionPane.showMessageDialog(GuiChat.this,"监听不成功");
				}
				String sendContent=inputTextArea.getText();
				byte[] buf=sendContent.getBytes();
				try {
					centerTextArea.append("我对"+ipAddress+":"+remotePort+"说:\n"+inputTextArea.getText()+"\n\n");
					centerTextArea.setCaretPosition(centerTextArea.getText().length());
					datagramSocket.send(new DatagramPacket(buf,buf.length,InetAddress.getByName(ipAddress),Integer.parseInt(remotePort)));
					inputTextArea.setText("");
				}catch (IOException e1){
					JOptionPane.showMessageDialog(GuiChat.this,"出错了,发送不成功");
					e1.printStackTrace();
				}
			};
		});
		clearBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				centerTextArea.setText("");
			}
		});
		
		
	}
	
	private void initSocket() {
		int port=DEFAULT_PORT;
		while(true) {
			try {
			if(datagramSocket!=null && !datagramSocket.isClosed()) {
				datagramSocket.close();
			}
			try {
				port=Integer.parseInt(JOptionPane.showInputDialog(this,"请输入端口号","端口号",JOptionPane.QUESTION_MESSAGE));
				if(port<1 || port>65535) {
					throw new RuntimeException("端口号超出范围");
				}
				}catch (Exception e) {
				JOptionPane.showMessageDialog(null,"你输入的端口号不正确,请输入1~65535之间的数");
				continue;
				}
				datagramSocket=new DatagramSocket(port);
				startListen();
				stateLB.setText("已在"+port+"端口监听");
				break;
			}catch(SocketException e) {
				JOptionPane.showMessageDialog(this,"端口已被占用,请重新设置端口");
				stateLB.setText("当前还未启动监听");
			}
		}
	}
	private void startListen() {
		new Thread() {
			private DatagramPacket p;
			public void run() {
				byte[] buf=new byte [1024];
				p=new DatagramPacket(buf,buf.length);
				while(!datagramSocket.isClosed()) {
					try {
						datagramSocket.receive(p);
						centerTextArea.append(p.getAddress().getHostAddress()+":"
								+((InetSocketAddress)p.getSocketAddress()).getPort()+"对我说:\n"+new String(p.getData(),0,p.getLength())+"\n\n");
						centerTextArea.setCaretPosition(centerTextArea.getText().length());
					}catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
	}
		public GuiChat() {
			setUpUI();
			initSocket();
			setListener();
		}
		public static void main(String[] args) {
			new GuiChat();
		}
	

}
