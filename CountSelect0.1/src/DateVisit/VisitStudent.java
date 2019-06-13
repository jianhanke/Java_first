package DateVisit;

import java.util.*;

import Entiy.Student;

public class VisitStudent {
	private static VisitStudent instance;
	private Student stu;
	private HashMap<String,Student> students;
	
	//构造方法时,直接生成好学生信息
	private  VisitStudent() {
	students =new HashMap<String,Student >();
	 stu =new Student();
	stu.setId("174804054");
	stu.setPwd("123456");
	stu.setName("张三");
	stu.setGender("男");
	stu.setDepatment("软件学院");
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
	//获取一个学生信息
	public Student getStudent(String id){
		Student stu=(Student) students.get(id);
		return stu;
	}
	//返回一整个Student
	public HashMap<String,Student> getAllStudent(){
		return students;
	}
	//students添加数据
	public void setStudent(String key,Student stu){
		students.put(key,stu);
	}
	
	
	
	
}
