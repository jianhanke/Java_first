interface Animal {
    void breathe();
    void run();
    void eat(){};
}
class Dog implements Animal {
   public void breathe(){
   System.out.println("I'm breathing")
  }
   public void eat() {
   System.out.println("I'm eathing")
   }
}
public class test04 {
      public static void main(String [] args) {
         Dog dog=new dog();
         dog.breathe();
         dog.eat();
      }
}
