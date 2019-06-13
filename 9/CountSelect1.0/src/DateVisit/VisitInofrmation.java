package DateVisit;

import Entiy.*;

public class VisitInofrmation {
	
	public static void show(String id) throws Exception{
			System.out.println("------个人信息------");
			VisitStudent visitstudent=VisitStudent.getinstance();
			Student stu=visitstudent.getStudent(id);
			System.out.println("你的学号为:"+stu.getId());
			System.out.println("你的姓名为:"+stu.getName());
			System.out.println("你的性别为:"+stu.getGender());
			System.out.println("你的年龄为:"+stu.getAge());
			System.out.println("你的院系为："+stu.getDepartment());
			System.out.println("------选课信息------");
			VisitCourse visitcourse=VisitCourse.getinstance();
		   String str=(String) visitcourse.getCourse(id);
		  String[] course=str.split(",");
		  
		  System.out.println("你选定第一门课课:"+  Course.getinstance().getAllcourse().get(course[1]) );
		  System.out.println("你选定第二门课课:"+  Course.getinstance().getAllcourse().get(course[2]) );
		  System.out.println("你选定第三门课课:"+  Course.getinstance().getAllcourse().get(course[3]) );
		  
	}

	
}
