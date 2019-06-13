import java.util.*;
public class Example30 {
	public static void main(String[] args) {
		TreeMap tree=new TreeMap();
		tree.put("1","Lucy");
		tree.put("2", "John");
		tree.put("3", "Smith");
		tree.put("4", "Aimee");
		tree.put("5", "Amanda");
		
		
		Set keyset=tree.keySet();
		Iterator it=keyset.iterator();
		while(it.hasNext()) {
			Object key=it.next();
			Object value=tree.get(key);
			System.out.println(key+":"+value);
		}
		System.out.println("174804054 ’‘≈‡ §");
	}
}
