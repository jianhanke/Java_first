import java.util.*;
public class Example27 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList ();
		Collections.addAll(list,"C","Z","B","Z","4","25","24");
		System.out.println("����ǰ:"+list);
		Collections.reverse(list);
		System.out.println("��ת��:"+list);
		Collections.sort(list);
		System.out.println("����Ȼ����˳���"+list);
		Collections.shuffle(list);
		System.out.println("ϴ�ƺ�"+list);
	}
}
