import java.io.*;
public class Example13 {

	public static void main(String[] args) throws Exception {
		Person p=new Person("p1","zhangsan",20);
		System.out.println("-----д���ļ�Ǯ----");
		System.out.println("Person�����id:"+p.getId());
		System.out.println("Person�����name:"+p.getName());
		System.out.println("Person�����age:"+p.getAge());
		
		FileOutputStream fos=new FileOutputStream("objectStream.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(p);

	}

}
class Person implements Serializable{
	private String id;
	private String name;
	private int age;
	public Person (String id,String name,int age) {
		super();
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public String getId() {
		return id;
	}
	public String getName() {
	return name;
	}
	public int getAge() {
		return age;
	}
	public int getAge() {
		return age;
	}
	
}
