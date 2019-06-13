package Gui;

import javax.swing.*;

import DateVisit.VisitCourse;

import Entiy.Course;

import Ui.Modify;


import java.awt.*;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;


public class ModifyCourse extends JFrame{
	
	public void modifycourse(String id) throws Exception {
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER,300,20) );
		this.setSize(600,600);
		this.setLocation(600,260);
		this.setTitle("修改密码界面");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		JLabel jl0=new JLabel("--------请输入退选课程-----");
		JButton jbut1=new JButton("退选");
		JButton jbut2=new JButton("退选");
		JButton jbut3=new JButton("退选");
		
		jbut1.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try {
					Modify.modify(id,"1" );
				} catch (Exception e1) {
					e1.printStackTrace();
				}
					JOptionPane.showMessageDialog(null,"退课成功！","提示消息",JOptionPane.WARNING_MESSAGE);
					PersonUI perui=new PersonUI();
					perui.guisystem(id);
				
			}
		});
		jbut2.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
						Modify.modify(id,"2" );
					JOptionPane.showMessageDialog(null,"退课成功！","提示消息",JOptionPane.WARNING_MESSAGE);
					PersonUI perui=new PersonUI();
					perui.guisystem(id);
					
				} catch (Exception e1) {
					// 
					e1.printStackTrace();
				}
			}
		});
		jbut3.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Modify.modify(id,"3" );
				JOptionPane.showMessageDialog(null,"退课成功！","提示消息",JOptionPane.WARNING_MESSAGE);
				PersonUI perui=new PersonUI();
				perui.guisystem(id);
				
			} catch (Exception e1) {
				// 
				e1.printStackTrace();
			}
			}
		});
		VisitCourse visitcourse=VisitCourse.getinstance();
		   String str=(String) visitcourse.getCourse(id);
		  String[] course=str.split(",");
		  
		 String course1= Course.getinstance().getAllcourse().get(course[1]); 
		 String course2= Course.getinstance().getAllcourse().get(course[2]);
		 String course3= Course.getinstance().getAllcourse().get(course[3]);
		 JLabel jl1=new JLabel(course1);
		 JLabel jl2=new JLabel(course2);
		 JLabel jl3=new JLabel(course3);
		 
		 JPanel jp1=new JPanel();
		 JPanel jp2=new JPanel();
		 JPanel jp3=new JPanel();
		 
		 jp1.add(jl1);
		 jp1.add(jbut1);
		 jp2.add(jl2);
		 jp2.add(jbut2);
		 jp3.add(jl3);
		 jp3.add(jbut3);
		
		 this.add(jl0);
		 this.add(jp1);
		 this.add(jp2);
		 this.add(jp3);
		
	}
	
}
