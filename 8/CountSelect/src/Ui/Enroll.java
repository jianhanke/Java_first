package Ui;

import java.util.*;
import Entiy.*;
import DateVisit.*;

public class Enroll {
	
	public static void enroll(){
		VisitStudent visitstudent=VisitStudent.getinstance();
		
		Student stu=new Student();
		Scanner in=new Scanner(System.in);
		System.out.println("������ѧ��");
		String id=in.nextLine();
		stu.setId(id);
		System.out.println("����������");
		String pwd=in.nextLine();
		stu.setPwd(pwd);

		System.out.println("����������");
		String name=in.nextLine();
		stu.setAge(name);
		
		System.out.println("����������");
		String age=in.nextLine();
		stu.setAge(age);
		
		System.out.println("�������Ա�");
		String gender=in.nextLine();
		stu.setAge(gender);
		

		System.out.println("������Ժϵ");
		String department=in.nextLine();
		stu.setAge(department);	
		visitstudent.setStudent(stu.getId(), stu);
		System.out.println("ע��ɹ�");
		Login.login();
		
		//���ܴ�����
	}
}
