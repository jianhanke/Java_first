class Animal{
	String name="jianhanke";
	void shout(){
		System.out.println("���﷢������");
}
}
class Dog extends Animal{
	public String  PrintName(){
		return name;
	}
	void shout(){
	System.out.println("���ڽ�....");
	}
}

public class Example01{
	public static void main (String[] args){
		Dog dog=new Dog();
		dog.name="ɳƤ��";
		System.out.println(dog.PrintName());
		dog.shout();
		Animal animal=new Animal();
		System.out.println(animal.name);
		animal.shout();
	}
}