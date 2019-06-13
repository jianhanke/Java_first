package Gui;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui_login extends Gui_module{
	
	JTextField user_account;
	JTextField user_pwd ;
	JPanel jp_account;
	JPanel jp_pwd;
	JLabel jl_account;
	JLabel jl_pwd;
	JButton jb1;
	JButton jb2;
	JPanel jpb;
	
	public Gui_login() {
		
		super();
		 user_account = new JTextField(20);
		 user_pwd  =    new JTextField(20);
		 
		 jp_account = new JPanel();
		 jp_pwd = new JPanel();
		  jpb=new JPanel();
		  jl_account=  new JLabel (" 账号 ");
		  jl_pwd=  new JLabel ("密码");
		 
		 jp_account.add(jl_account);
		 jp_account.add(user_account);
		 jp_pwd.add(jl_pwd);
		 jp_pwd.add(user_pwd);
		 
		 
		 jb1 = new JButton("学生登录");
		  jb2=new JButton("管理员登录");
		 jpb.add(jb1);
		 jpb.add(jb2);
		 
		 this.add(jpb);
		 this.add(jp_account);
		 this.add(jp_pwd);
		 this.add(jb1);
		 this.add(jb2);
		 this.setVisible(true);
		 jb1.addActionListener ( new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String account=user_account.getText();
					String pwd=user_pwd.getText();
				}
		 });
		 jb2.addActionListener(  new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 String account=user_account.getText();
				String pwd=user_pwd.getText();
			 }
		 });
		 
	}
}
