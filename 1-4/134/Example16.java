class Animal{
	void shout(){
		System.out.println("¶¯ÎïÔÚ½Ð....");
	}
	public String toString(){
		return "I am an animal";
	}
}
public class Example16{
	public static void main (String[] args){
		Animal animal=new Animal();
		System.out.println(animal.toString());
	}
}