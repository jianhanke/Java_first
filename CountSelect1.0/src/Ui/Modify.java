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
	
	
	//��ѡ�γ�

	public static void modify(String id) throws Exception {
		VisitCourse visitcourse=VisitCourse.getinstance();
		System.out.println("---��ѡ�γ�---");
		System.out.println("��������ѡ�ڼ��ſ�Ŀ");
		in3 = new Scanner(System.in);
		String number1=in3.nextLine();
		int number2=Integer.parseInt(number1);
		
		 HashMap<String, String>  idcourse= visitcourse.getIdcourse();
		 
		 String str=idcourse.get(id);
		 
		 String[] course=str.split(",");
		 StringBuffer strbufer=new StringBuffer();
		 strbufer.append(str+",");
		 for(int i=1;i<=course.length;i++) {
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
	//�޸ĸ�����Ϣ
	public static void information(String id) throws Exception {
		System.out.println("---�޸ĸ�����Ϣ----");
		
		 HashMap<String,Student > stu=VisitStudent.getinstance().getAllStudent();
		Student stu2=stu.get(id);
		
		while(true) {
			System.out.println("��ѡ�������Ϣѡ��");
			System.out.println("---��������,ѡ��1----");
			System.out.println("---�����Ա�,ѡ��2----");
			System.out.println("---����Ժϵ,ѡ��3----");
			System.out.println("---ѡ��0,�˳��޸�ϵͳ-----");
			in = new Scanner(System.in);
			String number=in.nextLine();
			if(number.equals("1")) {
				System.out.println("����������");
				String age=in.nextLine();
				stu2.setAge(age);
				stu.put(id, stu2);
			}else if(number.equals("2")) {
				System.out.println("�������Ա�");
				String agender=in.nextLine();
				stu2.setGender(agender);
				stu.put(id, stu2);
			}else if(number.equals("2")) {
				System.out.println("������Ժϵ");
				String department=in.nextLine();
				stu2.setDepatment(department);
				stu.put(id, stu2);
			}else {
				break;
			}
			VisitStudent.getinstance().update();
		}
		SystemUi.Systemui(id);
	}
	//�޸ĸ�������
	public static void pwd(String id) throws Exception {
		System.out.println("---�޸ĸ�������----");
		 HashMap<String,Student > stu=VisitStudent.getinstance().getAllStudent();
		Student stu2=stu.get(id);
		
		System.out.println("������������");
		in2 = new Scanner(System.in);
		String number=in2.nextLine();
		stu2.setPwd(number);
		stu.put(id, stu2);
		VisitStudent.getinstance().update();
	}
	
	
	
	
}
