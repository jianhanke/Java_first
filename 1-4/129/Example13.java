interface Aniaml{
	void shout();
}
class Cat implements Aniaml{
	public void shout(){
		System.out.println("ß÷ß÷.....");
	}
}
class Dog implements Aniaml{
	public void shout(){
		System.out.println("ÍôÍô....");
	}
}
public class Example13{
	public static void main (String[] args){
		Aniaml an1=new Cat();
		Aniaml an2=new Dog();
		         
		animalShout(an1);
		animalShout(an2);
	}
	public static void animalShout(Aniaml ang){
		ang.shout();
	} 
}