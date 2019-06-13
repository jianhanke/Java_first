class Student{
	String name;
	int age;
	public Student(){
		
	}
	public Student(String name,int age){
		this.name=name;
		this.age =age;
	}
	public void show(){
		System.out.println("name="+name+",age="+age);
	}
}
class Undergraduat extends Student{
	int degree;
	public Undergraduat(String name,int age,int degree){
		this.name=name;
		this.age=age;
		this.degree=degree;
	}
	public void show(){
		System.out.println("name="+name+",age="+age+",degree="+degree+"174804054+’‘≈‡ §");
	}
}
public class Example17{
	public static void main (String[] args){
		Student stu=new Student();
		stu.name="jinhanke";
		stu.age=20;
		stu.show();
		Undergraduat an=new Undergraduat("jianhanke",20,4);
		an.show();
		
	}
}