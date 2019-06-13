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
		this.setTitle("学生选课界面");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		VisitStudent visitstudent=VisitStudent.getinstance();
	Student stu=visitstudent.getStudent(id);
		JLabel jl0=new JLabel("----------个人信息------------");
		JLabel jl1=new JLabel("你的学号为:"+stu.getId());
		JLabel jl2=new JLabel("你的姓名为:"+stu.getName());
		JLabel jl3=new JLabel("你的性别为:"+stu.getGender());
		JLabel jl4=new JLabel("你的年龄为:"+stu.getAge());
		JLabel jl5=new JLabel("你的院系为"+stu.getDepartment());
		JLabel jl6=new JLabel("----------选课信息------------");
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
		
		   JLabel jl11=new JLabel("你选定第一门课课:"+  course1 );
		   JLabel jl12=new JLabel("你选定第二门课课:"+  course2 );
		   JLabel jl13=new JLabel("你选定第三门课课:"+  course3 );
		   
		   
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
		   JButton jbut1=new JButton("返回");
		   jbut1.addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
				   PersonUI person=new PersonUI();
				   person.guisystem(id);
			   }
		   });
		   this.add(jbut1);
	}
	
  
}
