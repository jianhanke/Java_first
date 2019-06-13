package Ui;

import java.util.*;
import Entiy.*;
import DateVisit.*;

public class Enroll {
	
	public static void enroll(){
		VisitStudent visitstudent=VisitStudent.getinstance();
		
		Student stu=new Student();
		Scanner in=new Scanner(System.in);
		System.out.println("请输入学号");
		String id=in.nextLine();
		stu.setId(id);
		System.out.println("请输入密码");
		String pwd=in.nextLine();
		stu.setPwd(pwd);

		System.out.println("请输入姓名");
		String name=in.nextLine();
		stu.setAge(name);
		
		System.out.println("请输入年龄");
		String age=in.nextLine();
		stu.setAge(age);
		
		System.out.println("请输入性别");
		String gender=in.nextLine();
		stu.setAge(gender);
		

		System.out.println("请输入院系");
		String department=in.nextLine();
		stu.setAge(department);	
		visitstudent.setStudent(stu.getId(), stu);
		System.out.println("注册成功");
		Login.login();
		
		//功能待开发
	}
}
