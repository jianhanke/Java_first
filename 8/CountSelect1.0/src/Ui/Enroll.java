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
		System.out.println("������ѧ��");
		String id=in.nextLine();
		stu.setId(id);
		
		System.out.println("����������");
		String pwd=in.nextLine();
		stu.setPwd(pwd);

		System.out.println("����������");
		String name=in.nextLine();
		stu.setName(name);
		
		System.out.println("����������");
		String age=in.nextLine();
		stu.setAge(age);
		
		System.out.println("�������Ա�");
		String gender=in.nextLine();
		stu.setGender(gender);
		
		System.out.println("������Ժϵ");
		String department=in.nextLine();
		stu.setDepatment(department);	
		
		visitstudent.setStudents(stu.getId(), stu);
		
		
		//���ܴ�����
	}
}

