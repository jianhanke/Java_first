package Ui;


import DateVisit.*;

public class Select {
	
	public static void select(String id) throws Exception{
		
		 VisitCourse visitcourse=VisitCourse.getinstance();
		
		visitcourse.course(id);
	}
	
}
