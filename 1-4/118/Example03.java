class Animal{
	String name="����";
	void shout(){
		System.out.println("���﷢������");
	}
}
class Dog extends Animal{
	void shout(){
		System.out.println("����������");
	}
	void PrintName(){
		System.out.println("name="+super.name);
		System.out.println("name="+this.name);
	}
	
}
public class Example03{
	public static void main (String[] args){
		Dog dog=new Dog();
		dog.shout();
		dog.PrintName();
	}
}