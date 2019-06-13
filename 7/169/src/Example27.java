import java.util.*;
public class Example27 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList ();
		Collections.addAll(list,"C","Z","B","Z","4","25","24");
		System.out.println("排序前:"+list);
		Collections.reverse(list);
		System.out.println("反转后:"+list);
		Collections.sort(list);
		System.out.println("按自然排序顺序后"+list);
		Collections.shuffle(list);
		System.out.println("洗牌后"+list);
	}
}
