package Entiy;

import java.util.HashMap;


public class Course {
	private  String courseid;
	private static  String coursename;
	private static HashMap <String,String> allcourse;
	private static Course instance=null;
	public Course() {
		allcourse =new HashMap<String,String> ();
		allcourse.put("1","��ѧ");
		allcourse.put("2","Ӣ��");
		allcourse.put("3","����");
		allcourse.put("4","����");
		allcourse.put("5","����");
		allcourse.put("6","��ʷ");
		allcourse.put("0", "��");
	}
	
	public void setCourseid(String courseid){
		this.courseid=courseid;
	}
	public String getCourseid(){
		return courseid;
	}
	//////////
	public void setCoursename(String coursename){
		Course.coursename=coursename;
	}
	public String getCoursename() {
		return coursename;
	}
	
	public HashMap<String, String> getAllcourse(){
		return allcourse;	
	}
	public static Course getinstance() {
		if(instance==null) {
			synchronized(Course.class){
				instance=new Course();
			}
		}
		return instance;
	}
	
	
}
	

