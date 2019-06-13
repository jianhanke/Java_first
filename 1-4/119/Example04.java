class  Animal{
	//Animal有参的构造方法
	public Animal (String name){
		System.out.println("我是一只"+name);
	}
	//Animal无参的构造方法
	public Animal(){
		System.out.println("无参的构造方法被调用了");
	}
	public void show(){
		System.out.println("父类方法");
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