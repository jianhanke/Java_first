package Ui;

import java.util.HashMap;
import java.util.Scanner;

import DateVisit.VisitStudent;
import Entiy.Student;

public class Login {
	
	private static Scanner in;

	public static void login() throws Exception {
	in = new Scanner(System.in);
	 System.out.println("������ѧ��");
	 String id=in.nextLine();
	 System.out.println("����������");
     String  pwd=in.nextLine();
     
        VisitStudent visitstudent=VisitStudent.getinstance();

        HashMap<String, Student> stu=visitstudent.getAllStudent();  
          if(stu.containsKey(id) && stu.get(id).getPwd().equals(pwd)) {
        	  System.out.println("��½�ɹ�");
        	  SystemUi.Systemui(id);
        	 
          }else{
        	  System.out.println("�������,�����µ�¼");
          }

	}
}
 