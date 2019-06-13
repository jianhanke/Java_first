import java.util.*;
public class Example09 {
	public static void main(String[] args){
		HashSet set=new HashSet();
		set.add("Jack");
		set.add("Eve");
		set.add("Rose");
		set.add("Rose");
		set.add("Jack");
		Iterator it=set.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj);
		}
		System.out.println(set);
	}

}
