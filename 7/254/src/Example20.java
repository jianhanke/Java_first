import java.util.*;
public class Example20 {
	public static void main(String[] args) {
		TreeMap tm=new TreeMap(new MyComparator());
		tm.put("1", "Jack");
		tm.put("2", "Rose");
		tm.put("3", "Lucy");
		Set keySet=tm.keySet();
		Iterator it=keySet.iterator();
		while(it.hasNext()) {
			Object key=it.next();
			Object value=tm.get(key);
			System.out.println(key+":"+value);
		}
	}
}
class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String id1=(String)obj1;
		String id2=(String)obj2;
		return id2.compareTo(id1);
	}
}
