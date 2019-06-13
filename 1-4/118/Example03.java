class Animal{
	String name="动物";
	void shout(){
		System.out.println("动物发出叫声");
	}
}
class Dog extends Animal{
	void shout(){
		System.out.println("狗发出叫声");
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