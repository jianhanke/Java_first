package DateVisit;

import Entiy.*;
import Ui.*;
import DateVisit.*;
import java.util.*;

public class VisitCourse {
	
	private static HashMap<String, Course> allcourse;
	private static VisitCourse instance;
	private static Scanner in;
	private static String course1;
	private static String course2;
	private static String course3;
	private static HashMap<String,String> idcourse;
	
	public static VisitCourse getinstance(){
		if(instance==null){
			synchronized(VisitCourse.class){
				if(instance==null){
					instance=new VisitCourse();
				}
			}
		}
		return instance;
	}
	

	public static void  course(String  id){
		 idcourse = new HashMap<String,String>();
		StringBuffer strbufer=new StringBuffer();
		
		System.out.println("��ӭ����ѡ��ϵͳ");
		System.out.println("����Ϊ��ѡ��γ�---����ѡ������ѧ��");
		System.out.println("1--��ѧ");
		System.out.println("2--Ӣ��");
		System.out.println("3--����");
		System.out.println("4--����");
		System.out.println("5--����");
		System.out.println("6--��ʷ");
		
		allcourse = new HashMap<String,Course>();
		in = new Scanner(System.in);
		System.out.println("�������һ��ѧ��,�������ּ���");
		course1 = in.nextLine();
		strbufer.append(course1+",");
		System.out.println("������ڶ���ѧ��,�������ּ���");
		course2 = in.nextLine();
		strbufer.append(course2+",");
		System.out.println("�����������ѧ��,�������ּ���");
		course3 = in.nextLine();
		strbufer.append(course3+",");
		String str=strbufer.toString();
		
		idcourse.put(id,str);
		System.out.println("ѡ�γɹ�");
	}
	public static String  getCourse(String id){
		String str=idcourse.get(id);
		return str;
	}
	public static HashMap<String, String> getIdcourse() {
		return idcourse;
	}
	
	
}
