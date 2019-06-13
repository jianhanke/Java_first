import java.io.*;
public class Example16 {

	public static void main(String[] args) throws Exception{
		PrintStream ps=new PrintStream(new FileOutputStream("printStream.txt"),true);
		Student stu=new Student();
		ps.print("这是一个数字");
		ps.println(19);
		ps.println(stu);
		
		Student stu1=new Student();
		System.out.println(stu1);
		System.out.println(stu1.age);
		
	}
	

}
class Student{

	String name="zhaopeisheng";
	String age="12";
	public String toString() {
		return name;
	}
}
