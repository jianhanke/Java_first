import java.util.*;

public class Example03{
	public static void main(String[] args){

		ArrayList list=new ArrayList();
		list.add("stu1");
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
		Iterator it=list.iterator();
		while(it.hasNext()) {
		Object obj=it.next();
		System.out.println(obj);
		}
		for(Object obj:list) {
			System.out.println(obj);
		}

	}
}