import java.util.*;
public class Example17 {
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("1", "Jack");
		map.put("2", "Rose");
		map.put("3", "Lucy");
		Set entrySet=map.entrySet();
		
		Iterator it=entrySet.iterator();
		while(it.hasNext()) {
			Map.Entry entry=(Map.Entry)it.next();
			Object value=entry.getValue();
			Object key=entry.getKey();
			System.out.println(key+":"+value);
		}
	}
}

