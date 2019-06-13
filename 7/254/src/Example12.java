import java.util.*;

public class Example12 {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
			ts.add(new Student("Jack",19));
			ts.add(new Student("Rose",18));
			ts.add(new Student("Tom",19));
			ts.add(new Student("Rose",18));
		Iterator it=ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
class Student implements Comparable{
	String name;
	int age;
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return name+":"+age;
	}
	public int compareTo(Object obj) {
		Student s=(Student) obj;
		if(this.age-s.age>0) {
			return 1;
		}
		if(this.age-s.age==0) {
			return this.name.compareTo(s.name);
		}
		return -1;
	}
}
