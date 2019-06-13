package DateVisit;

import java.io.*;
import java.util.*;

import Entiy.Student;

public class VisitStudent {
	private static VisitStudent instance=null;
	private HashMap<String,Student> students=new HashMap<String,Student> ();
	private LineNumberReader lr;
	private FileReader fr;
	private FileWriter fiw;
	
	
	private VisitStudent() {      //构造方法时,直接生成所有学生信息
		try {
			getallStudent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void getallStudent() throws Exception {  //获取所有学生信息(字符串)
		fr=new FileReader("student.dat");
		lr = new LineNumberReader(fr);
		String line;
		while((line=lr.readLine())!=null){
			setStudent(line);					//将字符串转换一下
		}
	}
	public  void setStudent(String line) { //字符串分离一下,将信息存入 HashMap<String,Student> students
		String[] strs=line.split(",");
		Student stu=new Student();
		stu.setId(strs[0]);
		stu.setPwd(strs[1]);
		stu.setName(strs[2]);
		stu.setGender(strs[3]);
		stu.setAge(strs[4]);
		stu.setDepatment(strs[5]);	
		students.put(stu.getId(),stu);
	}

	public static VisitStudent getinstance() throws Exception{
		if(instance==null){
			synchronized(VisitStudent.class){
				if(instance==null){
					instance=new VisitStudent();
				}
			}
		}
		return instance;
	}
	//获取一个学生的个人信息
	public Student getStudent(String id){
		Student stu=(Student) students.get(id);
		return stu;
	}
	//返回一整个HashMap<String,Student> students 
	public HashMap<String,Student> getAllStudent(){
		return students;
	}
	//students添加数据              
	public void setStudents(String key,Student stu) throws Exception{
		students.put(key,stu);
		this.update();
		System.out.println("注册成功");
	}
	//students 存盘
	public void update() throws Exception {
		
		  fiw = new FileWriter("student.dat");
		Set<String>	 keys=students.keySet();
		StringBuffer strbufer=new StringBuffer();
		for(String key:keys) {
			Student stu=students.get(key);
			strbufer.append(stu.getId()+","+
						stu.getPwd()+","+
						stu.getName()+","+
						stu.getGender()+","+
						stu.getAge()+","+
						stu.getDepartment()+","+'\n'
					);
		}
			String str=strbufer.toString();	
			fiw.write(str);
			fiw.close();
}
	
	
	
	
	
	
}
