import java.io.*;

public class Example14 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("objectStream.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Person p=(Person)ois.readObject();
		
		System.out.println("-----从文件中读取后----");
		System.out.println("Person对象的id:"+p.getId());
		System.out.println("Person对象的name:"+p.getName());
		System.out.println("Person对象的age:"+p.getAge());

	}

}
class Person implements Serializable{
	private String id;
	private String name;
	private int age;
	public Person (String id,String name,int age) {
		
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
	
	
}
