class Animal{
		public final void shout(){
			System.out.println("第一个方法被调用");	
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