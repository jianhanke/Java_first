package Ui;

import java.util.HashMap;

import DateVisit.VisitStudent;
import Entiy.Student;

public class Cancel {
	public static void cancel(String id) {
		System.out.println("---����ע���˺�----");
		 HashMap<String,Student > stu=VisitStudent.getinstance().getAllStudent();
		stu.remove(id);
		System.out.println("---ע���ɹ�");
		
	}
}
