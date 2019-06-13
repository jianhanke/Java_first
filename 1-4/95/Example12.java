class Student{
	static String schoolName;
}
public class Example12{
	public static void main (String[] args){
		Student stu1=new Student();
		Student stu2=new Student();
		Student.schoolName="´«ÖÇ²¥¿Í";
		System.out.println(stu1.schoolName);
		System.out.println(Student.schoolName);
	}
}