package DateVisit;

import Entiy.*;

public class VisitInofrmation {
	
	public static void show(String id){
			System.out.println("------������Ϣ------");
			VisitStudent visitstudent=VisitStudent.getinstance();
			Student stu=visitstudent.getStudent(id);
			System.out.println("���ѧ��Ϊ:"+stu.getId());
			System.out.println("�������Ϊ:"+stu.getName());
			System.out.println("����Ա�Ϊ:"+stu.getGender());
			System.out.println("�������Ϊ:"+stu.getAge());
			System.out.println("���ԺϵΪ��"+stu.getDepartment());
			System.out.println("------ѡ����Ϣ------");
			VisitCourse visitcourse=VisitCourse.getinstance();
		   String str=(String) visitcourse.getCourse(id);
		  String[] course=str.split(",");
		   System.out.println("��ѡ����һ�ſο�:"+course[0]);
		   System.out.println("��ѡ����һ�ſο�:"+course[1]);
		   System.out.println("��ѡ����һ�ſο�:"+course[2]);
			
			
			
			
	}

	
}