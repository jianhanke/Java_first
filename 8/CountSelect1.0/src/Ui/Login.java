package Ui;

import java.util.HashMap;
import java.util.Scanner;

import DateVisit.VisitStudent;
import Entiy.Student;

public class Login {
	
	private static Scanner in;

	public static void login() throws Exception {
	in = new Scanner(System.in);
	 System.out.println("ÇëÊäÈëÑ§ºÅ");
	 String id=in.nextLine();
	 System.out.println("ÇëÊäÈëÃÜÂë");
     String  pwd=in.nextLine();
     
        VisitStudent visitstudent=VisitStudent.getinstance();

        HashMap<String, Student> stu=visitstudent.getAllStudent();  
          if(stu.containsKey(id) && stu.get(id).getPwd().equals(pwd)) {
        	  System.out.println("µÇÂ½³É¹¦");
        	  SystemUi.Systemui(id);
        	 
          }else{
        	  System.out.println("ÃÜÂë´íÎó,ÇëÖØĞÂµÇÂ¼");
          }

	}
}
 