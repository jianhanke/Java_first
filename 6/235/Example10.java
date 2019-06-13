public class Example10{
	public static void main(String[] args){
	Student stu1=new Student("name",174804054);	
	Teacher teacher=new Teacher();
	System.out.println(stu1.score);
	teacher.change(20);
	System.out.println(stu1.score);
	}
}
class Student extends Common{
	public Student(String name,int sum){
		this.name=name;
		this.sum=sum;
	}
		public Student(String name1){
			name=name1;
		}
		public void see(){
			System.out.println(score);
		}

}
class Teacher extends Common{
	
	public void put(int num){
	score=num;
	}
	public void change(int num){
		score=num;
	}
	
}
class Common{
	String name;
	int sum;
	int score;        
}
	

	