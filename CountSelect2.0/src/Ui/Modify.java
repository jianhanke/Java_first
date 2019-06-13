package Ui;

import java.util.HashMap;

import java.util.Scanner;

import DateVisit.VisitCourse;
import DateVisit.VisitStudent;
import Entiy.Student;

public class Modify {
	private static Scanner in;
	private static Scanner in2;
	
	//退选课程

	public static void modify(String id,String number) throws Exception {
		VisitCourse visitcourse=VisitCourse.getinstance();
		
		int number2=Integer.parseInt(number);
		 HashMap<String, String>  idcourse= visitcourse.getIdcourse();
		 String str=idcourse.get(id);
		 
		 String[] course=str.split(",");
		 StringBuffer strbufer=new StringBuffer();
		 
		 for(int i=0; i<course.length;i++) {
			 if(  i == number2) {
				course[i]="0"+",";
				strbufer.append(course[i]);
			 }else {
				 course[i]=course[i]+",";
				 strbufer.append(course[i]);
			 }
		 }
		 String str3=strbufer.toString();
		 idcourse.put(id,str3);	
		 visitcourse.update();
	}
	//修改个人信息
	public static void information(String id,String number,String information) throws Exception {
	
		
		 HashMap<String,Student > stu=VisitStudent.getinstance().getAllStudent();
		Student stu2=stu.get(id);
			
			if(number.equals("1")) {
				stu2.setAge(information);
				stu.put(id, stu2);
			}else if(number.equals("2")) {
				stu2.setGender(information);
				stu.put(id, stu2);
			}else if(number.equals("3")) {
				stu2.setDepatment(information);
				stu.put(id, stu2);
			}
			VisitStudent.getinstance().update();
			
	}
	//修改个人密码
	public static void pwd(String id,String pwd) throws Exception {
		
		 HashMap<String,Student > stu=VisitStudent.getinstance().getAllStudent();
		Student stu2=stu.get(id);
		stu2.setPwd(pwd);
		stu.put(id, stu2);
		VisitStudent.getinstance().update();
	}
	
	
	
	
}
