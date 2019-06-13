package Ui;

import java.util.HashMap;
import java.util.Scanner;

import DateVisit.VisitCourse;
import DateVisit.VisitStudent;
import Entiy.Student;

public class Modify {
	private static Scanner in;
	private static Scanner in2;
	private static Scanner in3;
	public static void modify(String id) {
		System.out.println("---退选课程---");
		System.out.println("请输入退选第几门科目");
		in3 = new Scanner(System.in);
		String number1=in3.nextLine();
		int number2=Integer.parseInt(number1);
		
		 HashMap<String, String>  idcourse=VisitCourse.getinstance().getIdcourse();
		 String str=idcourse.get(id);
		 
		 String[] course=str.split(",");
		 StringBuffer strbufer=new StringBuffer();
		 
		 for(int i=0;i<course.length;i++) {
			 if(  i ==number2-1) {
				course[i]="0"+",";
				strbufer.append(course[i]);
			 }else {
				 course[i]=course[i]+",";
				 strbufer.append(course[i]);
			 }
		 }
		 String str3=strbufer.toString();
		
		 idcourse.put(id,str3);	
	}
	public static void information(String id) {
		System.out.println("---修改个人信息----");
		 HashMap<String,Student > stu=VisitStudent.getinstance().getAllStudent();
		Student stu2=stu.get(id);
		
		while(true) {
			System.out.println("请选择更改信息选项");
			System.out.println("---更改年龄,选择1----");
			System.out.println("---更改性别,选择2----");
			System.out.println("---更改院系,选择3----");
			System.out.println("---选择0,退出修改系统-----");
			in = new Scanner(System.in);
			String number=in.nextLine();
			if(number.equals("1")) {
				System.out.println("请输入年龄");
				String age=in.nextLine();
				stu2.setAge(age);
				stu.put(id, stu2);
			}else if(number.equals("2")) {
				System.out.println("请输入性别");
				String agender=in.nextLine();
				stu2.setGender(agender);
				stu.put(id, stu2);
			}else if(number.equals("2")) {
				System.out.println("请输入院系");
				String department=in.nextLine();
				stu2.setDepatment(department);
				stu.put(id, stu2);
			}else {
				break;
			}
		}
		SystemUi.Systemui(id);
		
	}
	public static void pwd(String id) {
		System.out.println("---修改个人密码----");
		 HashMap<String,Student > stu=VisitStudent.getinstance().getAllStudent();
		Student stu2=stu.get(id);
		
		System.out.println("请输入新密码");
		in2 = new Scanner(System.in);
		String number=in2.nextLine();
		stu2.setPwd(number);
		stu.put(id, stu2);
		
		
		
		
	}
	
	
	
	
}
