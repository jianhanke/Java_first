import java.util.*;
public class Example15 {
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("1", "Jack");
		map.put("2", "Rose");
		map.put("3", "Lucy");
		
		System.out.println(map);
		
		System.out.println(map.get("1"));
		System.out.println(map.get("2"));
		System.out.println(map.get("3"));
		String str22=(String) map.get("4");
		System.out.println(str22);
		
		System.out.println(map.containsKey("2"));
		System.out.println(map.containsValue("Lucy"));
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		Set keySet=map.keySet();
		Iterator it=keySet.iterator();
		while(it.hasNext()) {
			Object key=it.next();
			Object value=map.get(key);
			System.out.println(key+":"+value);
		}
		System.out.println(map);
	
	
	
	}
}
