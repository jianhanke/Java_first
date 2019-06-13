package Gui;

import java.awt.*;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import DateVisit.VisitCourse;

public class SelectUI extends JFrame{
	
	JTextField tf1=new JTextField(6);
	JTextField tf2=new JTextField(6);
	JTextField tf3=new JTextField(6);
	
	public void select(String id) {
		JLabel jl1=new JLabel("-----��ӭ����ѡ��ϵͳ---");
		JLabel jl2=new JLabel("����Ϊ��ѡ��γ�---����ѡ������ѧ��");
		JLabel jl3=new JLabel("1--��ѧ");
		JLabel jl4=new JLabel("2--Ӣ��");
		JLabel jl5=new JLabel("3--����");
		JLabel jl6=new JLabel("4--����");
		JLabel jl7=new JLabel("5--����");
		JLabel jl8=new JLabel("6--��ʷ");
		
		this.add(jl1);
		this.add(jl2);
		this.add(jl3);
		this.add(jl4);
		this.add(jl5);
		this.add(jl6);
		this.add(jl7);
		this.add(jl8);
		
		JLabel jl11=new JLabel(",�������ּ���");
		JLabel jl12=new JLabel("������ڶ���ѧ��,�������ּ���");
		JLabel jl13=new JLabel("�����������ѧ��,�������ּ���");
		
	
		
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		JPanel jp3=new JPanel();
		
		jp1.add(jl11);
		jp1.add(tf1);
		
		jp2.add(jl12);
		jp2.add(tf2);
		
		jp3.add(jl13);
		jp3.add(tf3);
		
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		JButton jbut1=new JButton("ȷ��");
		this.add(jbut1);
		
		jbut1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						queding(id);
						
					} catch (Exception e1) {
						
						e1.printStackTrace();
					}
				}		
		});
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER,300,20) );
		this.setSize(600,600);
		this.setLocation(600,260);
		this.setTitle("ѧ��ѡ�ν���");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	public void queding(String id) throws Exception {
		VisitCourse visitcourse=VisitCourse.getinstance();
		HashMap<String, String> idcourse=visitcourse.getIdcourse();

		StringBuffer strbufer=new StringBuffer();
		String number1=tf1.getText();
		String number2=tf2.getText();
		String number3=tf3.getText();
		
		strbufer.append(id+",");
		strbufer.append(number1+",");
		strbufer.append(number2+",");
		strbufer.append(number3+","+'\n');
		
		String str=strbufer.toString();
		idcourse.put(id,str);
		visitcourse.update();	
		JOptionPane.showMessageDialog(null,"��ϲ��,ѡ�γɹ�","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE); 
		PersonUI personui=new PersonUI();
		personui.guisystem(id);
	}		
	
}


