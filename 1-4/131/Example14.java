interface Animal{
	void shout();
	
}
class Cat implements Animal{
	public void shout(){
		System.out.println("����......");
	}
	public void sleep(){
		System.out.println("è��˯��....");
	}
}
class Dog implements Animal{
	public void  shout(){
		System.out.println("����.....");
	}
}

public class Example14{
	public static void main (String[] args){
		Dog dog=new Dog();
		animalShout(dog);
		
	}
	public static void animalShout(Animal animal){
		if(animal instanceof Cat){
			Cat cat=(Cat)animal;
			cat.sleep();
			cat.shout();
		}else{
			System.out.println("this animal is not a cat");
		}
		
	}
}