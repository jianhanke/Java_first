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
		System.out.println("我的名字是："+name+"，我的分数是："+score);
		System.out.println("174804054 赵培胜");
	}
}
public class Example01
{
	public static void main (String[] args){
		Student stu1=new Student();
		Student stu2=new Student("赵培胜",20);
	 
    stu1.setName("剑寒客");
		 stu1.setScore(12);
		 stu1.speak();
		 stu2.speak();
	}
}