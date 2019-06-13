package Entiy;

import java.util.HashMap;


public class Course {
	private  String courseid;
	private static  String coursename;
	private static HashMap <String,String> allcourse;
	private static Course instance=null;
	public Course() {
		allcourse =new HashMap<String,String> ();
		allcourse.put("1","数学");
		allcourse.put("2","英语");
		allcourse.put("3","语文");
		allcourse.put("4","政治");
		allcourse.put("5","地理");
		allcourse.put("6","历史");
		allcourse.put("0", "无");
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
	

