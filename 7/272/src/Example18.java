import java.util.*;

import bank.DButils;
import bank.User;

public class Example18 {
	

	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("3", "notexist");
		map.put("5", "Jack");
		map.put("1", "Jack");
		map.put("2", "Rose");
		map.put("3", "");
		map.put("4", "Lucy");
		
		Collection values=map.values();
		Iterator it=values.iterator();
		while(it.hasNext()) {
			Object value=it.next();          
			System.out.println(value);
			}
		System.out.println(map.containsValue("Rose"));
		System.out.println(map);
		
		System.out.println();
		Map map2=new LinkedHashMap();
		map2.put("1", "Jack");
		map2.put("2", "Rose");
		map2.put("3", "Lucy");
		Set keySet=map2.keySet();
		Iterator it2=keySet.iterator();
		while(it2.hasNext()) {
			Object key=it2.next();
			Object value=map2.get(key);
			System.out.println(key+":"+value);
		}
		System.out.println(map2.containsKey("3"));
	}
	
}
