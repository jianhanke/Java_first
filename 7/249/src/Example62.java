import java.util.*;

public class Example62{
	public static void main(String[] args) {
		HashSet hashset=new HashSet();	
		hashset.add(new Person("hanke","20"));
		hashset.add(new Person("Coco","550"));
		hashset.add(new Person("Jing","30"));
		System.out.println(hashset);
		System.out.println("174804054+����ʤ");
	}
}
class Person{
	String name;
	String age;
	public Person(String name,String age) {//���췽��
		this.name=name;
		this.age=age;
	}
	public String toString() {				//�ع�toString(),������ʾ���ǹ�ϣֵ
		return "����Ϊ:"+name+"����Ϊ:"+age;
	}
	public int hashCode() {				//�ع�hasCode()����,
		return name.hashCode();
		
	}
	public boolean equals(Object obj) {		//�ع�equals()����,����ֵֵΪture����������ֵfalse���롣
		if(this==obj)
		return true;
		if(!(obj instanceof Person))
			return false;
		Person s1=(Person)obj;
		return s1.name.equals(this.name);
		
	}
}
