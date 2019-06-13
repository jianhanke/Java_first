package Gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Ui.Enroll;

public class EnrollUI extends JFrame{
	JTextField jtf1=new JTextField(10);
	JTextField jtf2=new JTextField(10);
	JTextField jtf3=new JTextField(10);
	JTextField jtf4=new JTextField(10);
	JTextField jtf5=new JTextField(10);
	JTextField jtf6=new JTextField(10);
	
	public void enroll() {
		this.setLayout(new FlowLayout(FlowLayout.CENTER,300,20) );
		this.setSize(600,600);
		this.setLocation(600,260);
		this.setTitle("ѧ��ѡ�ν���");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		JLabel jl0=new JLabel("-----��ӭ����ע��ҳ��------");
		JLabel jl1=new JLabel("������ѧ��");
		JLabel jl2=new JLabel("����������");
		JLabel jl3=new JLabel("����������");
		JLabel jl4=new JLabel("�������Ա�");
		JLabel jl5=new JLabel("����������");
		JLabel jl6=new JLabel("������ѧԺ");
		
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		JPanel jp3=new JPanel();
		JPanel jp4=new JPanel();
		JPanel jp5=new JPanel();
		JPanel jp6=new JPanel();
		
		jp1.add(jl1);
		jp1.add(jtf1);
		jp2.add(jl2);
		jp2.add(jtf2);
		jp3.add(jl3);
		jp3.add(jtf3);
		jp4.add(jl4);
		jp4.add(jtf4);
		jp5.add(jl5);
		jp5.add(jtf5);
		jp6.add(jl6);
		jp6.add(jtf6);
		
		JButton jbut1=new JButton("ȷ��");
		jbut1.addActionListener ( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=jtf1.getText();
				String pwd=jtf2.getText();
				String name=jtf3.getText();
				String gender=jtf4.getText();
				String age=jtf5.getText();
				String department=jtf6.getText();
				try {
					Enroll.enroll(id, pwd, name, age, gender, department);
					JOptionPane.showMessageDialog(null,"ע��ɹ�,���¼","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);
					MainUI mainui=new MainUI();
					mainui.ui();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		this.add(jp4);
		this.add(jp5);
		this.add(jp6);
		this.add(jbut1);
	}

}
