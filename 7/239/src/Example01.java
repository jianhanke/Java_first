import java.util.*;
public class Example01{
	public static void main(String[] args){
		
		ArrayList list=new ArrayList();
		list.add("stu1");
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
		System.out.println("���ϵĳ���:"+list.size());
		System.out.println("�ڶ���Ԫ��:"+list.get(1));
		System.out.println("�ڶ���Ԫ��:"+list);
		System.out.println("�ڶ���Ԫ��:"+list.get(1));
		System.out.println("�ڶ���Ԫ��:"+list.remove(0)+list.remove(2));
		System.out.println(list.set(1, "jianhanke"));
		System.out.println(list);
		
		
		
		
	}
}