package DateVisit;

import java.util.*;

import Entiy.Student;

public class VisitStudent {
	private static VisitStudent instance;
	private Student stu;
	private HashMap<String,Student> students;
	
	//���췽��ʱ,ֱ�����ɺ�ѧ����Ϣ
	private  VisitStudent() {
	students =new HashMap<String,Student >();
	 stu =new Student();
	stu.setId("174804054");
	stu.setPwd("123456");
	stu.setName("����");
	stu.setGender("��");
	stu.setDepatment("���ѧԺ");
	stu.setAge("20");
	students.put(stu.getId(),stu);
	}
	
	public static VisitStudent getinstance(){
		if(instance==null){
			synchronized(VisitStudent.class){
				if(instance==null){
					instance=new VisitStudent();
				}
			}
		}
		return instance;
	}
	//��ȡһ��ѧ����Ϣ
	public Student getStudent(String id){
		Student stu=(Student) students.get(id);
		return stu;
	}
	//����һ����Student
	public HashMap<String,Student> getAllStudent(){
		return students;
	}
	//students�������
	public void setStudent(String key,Student stu){
		students.put(key,stu);
	}
	
	
	
	
}
