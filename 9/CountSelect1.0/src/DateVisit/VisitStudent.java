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
	
	
	private VisitStudent() {      //���췽��ʱ,ֱ����������ѧ����Ϣ
		try {
			getallStudent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void getallStudent() throws Exception {  //��ȡ����ѧ����Ϣ(�ַ���)
		fr=new FileReader("student.dat");
		lr = new LineNumberReader(fr);
		String line;
		while((line=lr.readLine())!=null){
			setStudent(line);					//���ַ���ת��һ��
		}
	}
	public  void setStudent(String line) { //�ַ�������һ��,����Ϣ���� HashMap<String,Student> students
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
	//��ȡһ��ѧ���ĸ�����Ϣ
	public Student getStudent(String id){
		Student stu=(Student) students.get(id);
		return stu;
	}
	//����һ����HashMap<String,Student> students 
	public HashMap<String,Student> getAllStudent(){
		return students;
	}
	//students�������              
	public void setStudents(String key,Student stu) throws Exception{
		students.put(key,stu);
		this.update();
		System.out.println("ע��ɹ�");
	}
	//students ����
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
