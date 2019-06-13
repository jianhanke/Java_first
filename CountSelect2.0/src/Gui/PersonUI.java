package Gui;

import javax.swing.*;

import DateVisit.VisitInofrmation;
import Ui.Cancel;
import Ui.Modify;
import Ui.Select;

import java.awt.*;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;

public class PersonUI extends JFrame{
	JTextField jtf=new JTextField(10);
	
	public void guisystem(String id) {
		JLabel jl=new JLabel("--------欢迎来到个人系统中心--------",JLabel.CENTER);
		JLabel jl1=new JLabel("1---选课---");
		JLabel jl2=new JLabel("2---退课---");
		JLabel jl3=new JLabel("3---修改密码---");
		JLabel jl4=new JLabel("4---修改个人信息----");
		JLabel jl5=new JLabel("5---注销账号----");
		JLabel jl6=new JLabel("6---查看选课结果----");
		JLabel jl0=new JLabel("0---推出系统---");
		JLabel jl11=new JLabel("请输入指令:");
		JButton jbut1=new JButton("确认");
		
		jbut1.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					confirm(id);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		JPanel jp1=new JPanel();
		jp1.add(jl11);
		jp1.add(jtf);
		jp1.add(jbut1);
		
		this.add(jl);
		this.add(jl1);
		this.add(jl2);
		this.add(jl3);
		this.add(jl4);
		this.add(jl5);
		this.add(jl6);
		this.add(jl0);
		
		this.add(jp1);
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER,300,20) );
		this.setSize(600,600);
		this.setLocation(600,260);
		this.setTitle("个人系统界面");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public void confirm(String id) throws Exception {
		String number=jtf.getText();
		 if(number.equals("1")) {	
			 //选课
    	SelectUI perui=new SelectUI();
    	perui.select (id);
    	 }else if(number.equals("2")) {		//退课
    		 ModifyCourse course=new ModifyCourse();
    		 	course.modifycourse(id);
    		 	 
    	 }else if(number.equals("3")) {		//修改密码
    		 	ModifyPwd mo=new ModifyPwd();
    		 	mo.modifypwd(id);
    		 	
    	 }else if(number.equals("5")) {			//注销账号
    		 Cancel can=new Cancel();
    		 can.cancel(id);
    		 JOptionPane.showMessageDialog(null,"注销成功！","提示消息",JOptionPane.WARNING_MESSAGE);
    		 MainUI mainui=new MainUI();
    		 mainui.ui();
    		 
    	 }else if(number.equals("4")) {				//修改个人信息
    		 	ModifyPerson mo=new ModifyPerson();
    		 	mo.modifyperson(id);
    		 	
    	 }else if(number.equals("0")) {				//退出系统
    		MainUI mainui=new MainUI();
    		mainui.ui();
    	 }else if(number.equals("6")) {				//查看选课结果
    		Information inf=new Information();
    		inf.information(id);
    	 }else {									//0以外数字，提醒
    		 JOptionPane.showMessageDialog(null,"请输入有效数字！","提示消息",JOptionPane.WARNING_MESSAGE);       
    	 }
		
	}
	
}
