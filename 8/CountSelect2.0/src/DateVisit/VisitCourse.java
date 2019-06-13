package DateVisit;

import java.io.*;
import java.util.*;

public class VisitCourse {
	
	private static VisitCourse instance=null;
	private static Scanner in;
	private static String course1;
	private static String course2;
	private static String course3;
	private static HashMap<String,String> idcourse =new HashMap<String,String>();
	private static LineNumberReader lr;
	private static FileReader fr;
	private static FileWriter fw;
	
	private VisitCourse() throws Exception {
		getAllcourse();
	}
	public  void getAllcourse() throws Exception {
		 fr=new FileReader("course.dat");
		lr=new LineNumberReader(fr);
		String str;
		while((str=lr.readLine())!=null) {
			setAllcourse(str);
		}
	}
	public static void setAllcourse(String line) {
		String[] str=line.split(",");
		idcourse = new HashMap<String,String>();
		idcourse.put(str[0],line);	
	}	
	
	public static VisitCourse getinstance() throws Exception{
		if(instance==null){
			synchronized(VisitCourse.class){
				if(instance==null){
					instance=new VisitCourse();
				}
			}
		}
		return instance;
	}
	public   void  course(String  id) throws Exception{
		 
		StringBuffer strbufer=new StringBuffer();
		strbufer.append(id+",");
		System.out.println("��ӭ����ѡ��ϵͳ");
		System.out.println("����Ϊ��ѡ��γ�---����ѡ������ѧ��");
		System.out.println("1--��ѧ");
		System.out.println("2--Ӣ��");
		System.out.println("3--����");
		System.out.println("4--����");
		System.out.println("5--����");
		System.out.println("6--��ʷ");
		
		
		in = new Scanner(System.in);
		System.out.println("�������һ��ѧ��,�������ּ���");
		course1 = in.nextLine();
		strbufer.append(course1+",");
		System.out.println("������ڶ���ѧ��,�������ּ���");
		course2 = in.nextLine();
		strbufer.append(course2+",");
		System.out.println("�����������ѧ��,�������ּ���");
		course3 = in.nextLine();
		strbufer.append(course3+","+'\n');
		
		String str=strbufer.toString();
		idcourse.put(id,str);
		update();
	}
	public  void update() throws Exception {
		StringBuffer strbufer=new StringBuffer();
		fw=new FileWriter("course.dat");
		Set<String> keys=idcourse.keySet();
		for(String key:keys) {
			String courses=idcourse.get(key);
			String[] course=courses.split(",");
			strbufer.append(course[0]+","+
							course[1]+","+
							course[2]+","+
							course[3]+","+'\n'
					);
		}
			 
			fw.write(strbufer.toString() );
			fw.close();
		}
		
	//����һ���γ���Ϣ,string
	public  String  getCourse(String id){
		String str=idcourse.get(id);
		return str;
	}
	//����һ����HashMap<> idcourse  ,������������Ϣ
	public  HashMap<String, String> getIdcourse() {
		return idcourse;
	}
	
	
}
