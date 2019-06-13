package Ui;

import java.util.*;
import Entiy.*;
import DateVisit.*;

public class Enroll {
	
	private static Scanner in;

	public static void enroll() throws Exception{
		VisitStudent visitstudent=VisitStudent.getinstance();
		
		Student stu=new Student();
		in = new Scanner(System.in);
		System.out.println("请输入学号");
		String id=in.nextLine();
		stu.setId(id);
		
		System.out.println("请输入密码");
		String pwd=in.nextLine();
		stu.setPwd(pwd);

		System.out.println("请输入姓名");
		String name=in.nextLine();
		stu.setName(name);
		
		System.out.println("请输入年龄");
		String age=in.nextLine();
		stu.setAge(age);
		
		System.out.println("请输入性别");
		String gender=in.nextLine();
		stu.setGender(gender);
		
		System.out.println("请输入院系");
		String department=in.nextLine();
		stu.setDepatment(department);	
		
		visitstudent.setStudents(stu.getId(), stu);
		
		
		//功能待开发
	}
}

