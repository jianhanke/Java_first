class  Animal{
	//Animal�вεĹ��췽��
	public Animal (String name){
		System.out.println("����һֻ"+name);
	}
	//Animal�޲εĹ��췽��
	public Animal(){
		System.out.println("�޲εĹ��췽����������");
	}
	public void show(){
		System.out.println("���෽��");
	}
}

class Dog extends Animal{
	String name;
	public Dog(String name){
		super();
		this.name=name;
		System.out.println(name);
	}
}

public class Example04{
	public static void main (String[] args){
		Dog dog=new Dog("20");
		Dog dog2=new Dog("jianhanke");
	}
}