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
		JLabel jl=new JLabel("--------��ӭ��������ϵͳ����--------",JLabel.CENTER);
		JLabel jl1=new JLabel("1---ѡ��---");
		JLabel jl2=new JLabel("2---�˿�---");
		JLabel jl3=new JLabel("3---�޸�����---");
		JLabel jl4=new JLabel("4---�޸ĸ�����Ϣ----");
		JLabel jl5=new JLabel("5---ע���˺�----");
		JLabel jl6=new JLabel("6---�鿴ѡ�ν��----");
		JLabel jl0=new JLabel("0---�Ƴ�ϵͳ---");
		JLabel jl11=new JLabel("������ָ��:");
		JButton jbut1=new JButton("ȷ��");
		
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
		this.setTitle("����ϵͳ����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public void confirm(String id) throws Exception {
		String number=jtf.getText();
		 if(number.equals("1")) {	
			 //ѡ��
    	SelectUI perui=new SelectUI();
    	perui.select (id);
    	 }else if(number.equals("2")) {		//�˿�
    		 ModifyCourse course=new ModifyCourse();
    		 	course.modifycourse(id);
    		 	 
    	 }else if(number.equals("3")) {		//�޸�����
    		 	ModifyPwd mo=new ModifyPwd();
    		 	mo.modifypwd(id);
    		 	
    	 }else if(number.equals("5")) {			//ע���˺�
    		 Cancel can=new Cancel();
    		 can.cancel(id);
    		 JOptionPane.showMessageDialog(null,"ע���ɹ���","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);
    		 MainUI mainui=new MainUI();
    		 mainui.ui();
    		 
    	 }else if(number.equals("4")) {				//�޸ĸ�����Ϣ
    		 	ModifyPerson mo=new ModifyPerson();
    		 	mo.modifyperson(id);
    		 	
    	 }else if(number.equals("0")) {				//�˳�ϵͳ
    		MainUI mainui=new MainUI();
    		mainui.ui();
    	 }else if(number.equals("6")) {				//�鿴ѡ�ν��
    		Information inf=new Information();
    		inf.information(id);
    	 }else {									//0�������֣�����
    		 JOptionPane.showMessageDialog(null,"��������Ч���֣�","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);       
    	 }
		
	}
	
}
