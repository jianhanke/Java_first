class Student{
	private String name;
	private int score;
		public void setName(String con_name){
		name=con_name;
	}
	public String getName(String name){
		return name;
	}

	public int getScore(int score){
		return score;
	}
	public void setScore(int score){
		this.score=score;
	}
	public Student(){
		
	}
	public Student(String name,int score){
		this.name=name;
		this.score=score;
	}
	public void speak(){
		System.out.println("�ҵ������ǣ�"+name+"���ҵķ����ǣ�"+score);
		System.out.println("174804054 ����ʤ");
	}
}
public class Example01
{
	public static void main (String[] args){
		Student stu1=new Student();
		Student stu2=new Student("����ʤ",20);
	 
    stu1.setName("������");
		 stu1.setScore(12);
		 stu1.speak();
		 stu2.speak();
	}
}