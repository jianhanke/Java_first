package Ui;


import DateVisit.*;

public class Select {
	static VisitCourse visitcourse=VisitCourse.getinstance();
	public static void Select(String id){
		visitcourse.course(id);

	}
	
}
