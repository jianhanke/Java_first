import java.util.*;
public class Example02{
	public static void main(String[] args){

	LinkedList link=new LinkedList();
		link.add("stu1");
		link.add("stu2");
		link.add("stu3");
		link.add("stu4");
	System.out.println(link.toString());
	link.add(3,"Student");
	System.out.println(link);
	link.addFirst("First");
	System.out.println(link);
	link.remove(2);
	System.out.println(link);
	link.removeFirst();
	System.out.println(link);
	
	
	
		
		
		
	}
}