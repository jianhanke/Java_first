class Animal{
  void shout(){
      System.out.println("动物叫!");
  }
  void sleep(){};
}
class Dog extends Animal{
      public void shout(){  
          System.out.println("汪汪......!");  
     }
      public void sleep() {
       System.out.println("狗狗睡觉......");
      } 
}
public class Test{
    public static void main(String args[]) {
        Animal animal = new Dog(); 
        animal.shout();
        animal.sleep();
		
        Dog dog =(Dog)animal;
        dog.sleep(); 
	
		 Animal animal2 = new Animal();
		an= (Dog)animal2;
        an.shout();
  
    }
}