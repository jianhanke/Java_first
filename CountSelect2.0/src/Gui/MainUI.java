package Gui;

import javax.swing.*;

import DateVisit.VisitStudent;
import Entiy.Student;


import java.awt.*;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;
import java.util.HashMap;

	public  class MainUI extends JFrame  {  

	private JLabel jl1;
	private JLabel jl2;
	JTextField jtf=new JTextField(15);
	JPasswordField jpf=new JPasswordField(15);

	public void ui() {
		JButton jbut1=new JButton("登陆");
		JButton jbut2=new JButton("退出");
		JButton jbut3=new JButton("注册");
		
		jbut1.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				login();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		jbut2.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		jbut3.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnrollUI enrollui=new EnrollUI();
				enrollui.enroll();
			}
		});
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		JPanel jp3=new JPanel();
		
		  
		jl1 = new JLabel("用户名");
		jl2 = new JLabel("密...码");
		
		jp1.add(jl1);
		jp1.add(jtf);
		
		jp2.add(jl2);
		jp2.add(jpf);
		
		jp3.add(jbut1);
		jp3.add(jbut2);
		jp3.add(jbut3);
		
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER,300,20) );
		this.setSize(600,600);
		this.setLocation(600,260);
		this.setTitle("登陆界面");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}    
	public void login() throws Exception {
		String stu_id=jtf.getText();
		String stu_pwd=jpf.getText();
		
		 VisitStudent visitstudent=VisitStudent.getinstance();
	     HashMap<String, Student> stu=visitstudent.getAllStudent();
	     if(stu.containsKey(stu_id) && stu.get(stu_id).getPwd().equals(stu_pwd)) {
	    	 JOptionPane.showMessageDialog(null,"登录成功！","提示消息",JOptionPane.WARNING_MESSAGE);           
	            dispose();        													
	            this.setVisible(false); 
	            PersonUI pui=new PersonUI();
	           pui.guisystem(stu_id); 	     	 
	       }else{
	    	   JOptionPane.showMessageDialog(null,"登录错误,请重新登录！","提示消息",JOptionPane.WARNING_MESSAGE); 
	       }
		
	}
	
}
