package Gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


import DateVisit.VisitCourse;
import DateVisit.VisitStudent;
import Entiy.Course;
import Entiy.Student;

public class Information extends JFrame{
	String course1;
	String course2;
	String course3;
	
	public void information(String id) throws Exception {
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER,300,20) );
		this.setSize(600,600);
		this.setLocation(600,260);
		this.setTitle("ѧ��ѡ�ν���");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		VisitStudent visitstudent=VisitStudent.getinstance();
	Student stu=visitstudent.getStudent(id);
		JLabel jl0=new JLabel("----------������Ϣ------------");
		JLabel jl1=new JLabel("���ѧ��Ϊ:"+stu.getId());
		JLabel jl2=new JLabel("�������Ϊ:"+stu.getName());
		JLabel jl3=new JLabel("����Ա�Ϊ:"+stu.getGender());
		JLabel jl4=new JLabel("�������Ϊ:"+stu.getAge());
		JLabel jl5=new JLabel("���ԺϵΪ"+stu.getDepartment());
		JLabel jl6=new JLabel("----------ѡ����Ϣ------------");
		VisitCourse visitcourse=VisitCourse.getinstance();
		   String str=(String) visitcourse.getCourse(id);
		   if(str!=null) {
		   String[] course=str.split(",");
		    course1=(String ) Course.getinstance().getAllcourse().get(course[1]);  
		    course2=(String ) Course.getinstance().getAllcourse().get(course[2]);
		    course3=(String )  Course.getinstance().getAllcourse().get(course[3]);
		   }else {
			   course1=(String ) Course.getinstance().getAllcourse().get("0");  
			    course2=(String ) Course.getinstance().getAllcourse().get("0");
			    course3=(String )  Course.getinstance().getAllcourse().get("0");
		   }
		
		   JLabel jl11=new JLabel("��ѡ����һ�ſο�:"+  course1 );
		   JLabel jl12=new JLabel("��ѡ���ڶ��ſο�:"+  course2 );
		   JLabel jl13=new JLabel("��ѡ�������ſο�:"+  course3 );
		   
		   
		   this.add(jl0);
		   this.add(jl1);
		   this.add(jl2);
		   this.add(jl3);
		   this.add(jl4);
		   this.add(jl5);
		   this.add(jl6);
		 
		   this.add(jl11);
		   this.add(jl13);
		   this.add(jl12);
		   JButton jbut1=new JButton("����");
		   jbut1.addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
				   PersonUI person=new PersonUI();
				   person.guisystem(id);
			   }
		   });
		   this.add(jbut1);
	}
	
  
}
