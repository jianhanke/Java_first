import java.util.*;

public class Example18 {
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("1", "Jack");
		map.put("2", "Rose");
		map.put("3", "Lucy");
		map.put("3", "Luc2y");
		Collection values=map.values();
		Iterator it=values.iterator();
		while(it.hasNext()) {
			Object value=it.next();
			System.out.println(value);
		}
		
		Set keySet=map.keySet();
		Iterator it2=keySet.iterator();
		while(it2.hasNext()) {
			Object key=it2.next();
			Object value=map.get(key);
			System.out.println(key+":"+value);
		}
	}
}
