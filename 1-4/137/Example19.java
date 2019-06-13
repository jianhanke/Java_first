interface Animal{
	void shout();
}
public class Example19{
	public static void main (String[] args){
		animalShout(new Animal(){
			public void show(){
				System.out.println("ίχίχ....");
			}
	});
	
}
	public static void animalShout(Animal an){
		an.show();
	}
}