abstract class Animal{
	public void Speak(){
		System.out.println("�����ķ���");
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