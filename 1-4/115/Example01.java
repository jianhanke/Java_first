class Animal{
	String name="jianhanke";
	void shout(){
		System.out.println("动物发出叫声");
}
}
class Dog extends Animal{
	public String  PrintName(){
		return name;
	}
	void shout(){
	System.out.println("狗在叫....");
	}
}

public class Example01{
	public static void main (String[] args){
		Dog dog=new Dog();
		dog.name="沙皮狗";
		System.out.println(dog.PrintName());
		dog.shout();
		Animal animal=new Animal();
		System.out.println(animal.name);
		animal.shout();
	}
}