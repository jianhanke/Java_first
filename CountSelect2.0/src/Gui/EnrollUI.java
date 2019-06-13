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
		this.setTitle("学生选课界面");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		JLabel jl0=new JLabel("-----欢迎来到注册页面------");
		JLabel jl1=new JLabel("请输入学号");
		JLabel jl2=new JLabel("请输入密码");
		JLabel jl3=new JLabel("请输入姓名");
		JLabel jl4=new JLabel("请输入性别");
		JLabel jl5=new JLabel("请输入年龄");
		JLabel jl6=new JLabel("请输入学院");
		
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
		
		JButton jbut1=new JButton("确定");
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
					JOptionPane.showMessageDialog(null,"注册成功,请登录","提示消息",JOptionPane.WARNING_MESSAGE);
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
