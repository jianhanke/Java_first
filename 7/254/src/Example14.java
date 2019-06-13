import java.util.*;
class Mycomparator implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String s1=(String)obj1;
		String s2=(String)obj2;
		int temp=s1.length()-s2.length();
		return temp;
	}
}


public class Example14 {
	public static void main(String[] args){
		TreeSet ts=new TreeSet(new Mycomparator());
		ts.add("Jack");
		ts.add("Helena");
		ts.add("Eve");
		Iterator it=ts.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj);
		}
	
	}
}

