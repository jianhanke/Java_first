import java.util.*;
public class Example23 {
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("String");
		list.add("Collection");
		list.add(1);
		for(Object str:list) {
			System.out.println(str);
		}
		
	}
}
