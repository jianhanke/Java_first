package Ui;

import java.util.HashMap;

import DateVisit.VisitCourse;
import DateVisit.VisitStudent;
import Entiy.Student;

public class Cancel {
	public  void cancel(String id) throws Exception {
	
		 HashMap<String,Student > stu=VisitStudent.getinstance().getAllStudent();
		stu.remove(id);
		VisitStudent.getinstance().update();  //student存盘内容，更新一下
		
		HashMap<String,String> idcourse=VisitCourse.getinstance().getIdcourse();
		idcourse.remove(id);
		VisitCourse.getinstance().update();    //course存盘内容,更新一下
		
	}
}
