class Animal{
		public final void shout(){
			System.out.println("��һ������������");	
	}
}
class Dog extends Animal{
	
}
class  Example07{
	public static void main (String[] args){
		Dog dog=new Dog();
		dog.shout();
	}
}