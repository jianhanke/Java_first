package Ui;

import java.util.HashMap;

import DateVisit.VisitCourse;
import DateVisit.VisitStudent;
import Entiy.Student;

public class Cancel {
	public static void cancel(String id) throws Exception {
		System.out.println("---����ע���˺�----");
		 HashMap<String,Student > stu=VisitStudent.getinstance().getAllStudent();
		stu.remove(id);
		VisitStudent.getinstance().update();  //student�������ݣ�����һ��
		
		HashMap<String,String> idcourse=VisitCourse.getinstance().getIdcourse();
		idcourse.remove(id);
		VisitCourse.getinstance().update();    //course��������,����һ��
		System.out.println("---ע���ɹ�");
	}
}
