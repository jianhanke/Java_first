class Person { 
   private String name ; 
   private int age ; 
   public Person(String name,int age){ 
         this.name = name ; 
         this.age = age ; 
   } 
   public String toString(){ 
        return "������" + this.name + "�����䣺" + this.age ; 
 }
}
public class Test{  
      public static void main(String args[]){ 
             Person per = new Person("����",20) ; 
             System.out.println(per);
             System.out.println(per.toString()) ; 
  } 
}