package Entiy;

import java.util.*;

public class Course {
	private String courseid;
	private String coursename;
	HashMap <String,Course> allcourse=new HashMap<String,Course> ();
	
	
	public Course(String courseid,String coursename) {
		this.courseid=courseid;
		this.coursename=coursename;
	}
	
	Course course1=new Course("1","��ѧ");
	Course course2=new Course("2","Ӣ��");
	Course course3=new Course("3","����");
	Course course4=new Course("4","����");
	Course course5=new Course("5","����");
	Course course6=new Course("6","��ʷ");
	
	public void setCourseid(String courseid){
		this.courseid=courseid;
	}
	public String getCourseid(){
		return courseid;
	}
	//////////
	public void setCoursename(String coursename){
		this.coursename=coursename;
	}
	public String getCoursename() {
		return coursename;
	}
	public void all() {
	allcourse.put(course1.getCourseid(),course1);
	allcourse.put(course2.getCourseid(),course2);
	allcourse.put(course3.getCourseid(),course3);
	allcourse.put(course4.getCourseid(),course4);
	allcourse.put(course5.getCourseid(),course5);
	allcourse.put(course6.getCourseid(),course6);
	}
	
	
}
	

