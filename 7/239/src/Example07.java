import java.util.*;

public class Example07 {
	
	public static void main(String[] args){
		
		ArrayList list=new ArrayList();
		list.add("Jack");
		list.add("Rose");
		list.add("Tom");
		System.out.println(list);
		
		ListIterator it=list.listIterator(list.size());
			while(it.hasPrevious()) {
				Object obj=it.previous();
				System.out.println(obj+" 11111 ");
				/*Object obj2=it.next();
				System.out.println(obj2+" µÚ¶þ¸ö ");
				*/
				
			}
	}
}
