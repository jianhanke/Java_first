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
		
		System.out.println("欢迎来到选课系统");
		System.out.println("以下为可选择课程---任意选择三门学科");
		System.out.println("1--数学");
		System.out.println("2--英语");
		System.out.println("3--语文");
		System.out.println("4--政治");
		System.out.println("5--地理");
		System.out.println("6--历史");
		
		allcourse = new HashMap<String,Course>();
		in = new Scanner(System.in);
		System.out.println("请输入第一门学科,输入数字即可");
		course1 = in.nextLine();
		strbufer.append(course1+",");
		System.out.println("请输入第二门学科,输入数字即可");
		course2 = in.nextLine();
		strbufer.append(course2+",");
		System.out.println("请输入第三门学科,输入数字即可");
		course3 = in.nextLine();
		strbufer.append(course3+",");
		String str=strbufer.toString();
		
		idcourse.put(id,str);
		System.out.println("选课成功");
	}
	public static String  getCourse(String id){
		String str=idcourse.get(id);
		return str;
	}
	public static HashMap<String, String> getIdcourse() {
		return idcourse;
	}
	
	
}
