abstract class Animal{
	public void Speak(){
		System.out.println("正常的方法");
	}
}
class Dog extends Animal{
	
}
class Example10{
	public static void main(String[] args){
		Dog dog=new Dog();
		dog.Speak();
	
	}
}