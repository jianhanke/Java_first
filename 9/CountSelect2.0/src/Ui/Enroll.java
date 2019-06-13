package Ui;

import java.util.*;
import Entiy.*;
import DateVisit.*;

public class Enroll {
	
	public static void enroll(String id,String pwd,String name,String age,String gender,String department) throws Exception{
		VisitStudent visitstudent=VisitStudent.getinstance();
		
		Student stu=new Student();
		
		stu.setId(id);
		stu.setPwd(pwd);
		stu.setName(name);
		stu.setAge(age);
		stu.setGender(gender);
		stu.setDepatment(department);	
		visitstudent.setStudents(id, stu);

	}
}
