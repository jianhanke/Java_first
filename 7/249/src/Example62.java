import java.util.*;

public class Example62{
	public static void main(String[] args) {
		HashSet hashset=new HashSet();	
		hashset.add(new Person("hanke","20"));
		hashset.add(new Person("Coco","550"));
		hashset.add(new Person("Jing","30"));
		System.out.println(hashset);
		System.out.println("174804054+赵培胜");
	}
}
class Person{
	String name;
	String age;
	public Person(String name,String age) {//构造方法
		this.name=name;
		this.age=age;
	}
	public String toString() {				//重构toString(),否则显示的是哈希值
		return "姓名为:"+name+"年龄为:"+age;
	}
	public int hashCode() {				//重构hasCode()方法,
		return name.hashCode();
		
	}
	public boolean equals(Object obj) {		//重构equals()方法,返回值值为ture舍弃，返回值false存入。
		if(this==obj)
		return true;
		if(!(obj instanceof Person))
			return false;
		Person s1=(Person)obj;
		return s1.name.equals(this.name);
		
	}
}
