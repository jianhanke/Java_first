import java.text.*;
import java.util.*;
public class Example26{
	public static void main(String[] args){
		Date date=new Date();
		DateFormat fullFormat1=DateFormat.getDateInstance();
		
		DateFormat fullFormat2=DateFormat.getDateInstance(DateFormat.FULL);
		DateFormat longFormat=DateFormat.getDateInstance(DateFormat.LONG);
		DateFormat mediumFormat=DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
		DateFormat shortFormat=DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
		
		
		
			System.out.println("��ǰ���ڵ�������ʽΪ:"+fullFormat1.format(date));
			System.out.println("��ǰ���ڵ�������ʽΪ:"+fullFormat2.format(date));
		
			System.out.println("��ǰ��ĳ���ʽΪ:"+longFormat.format(date));
			System.out.println("��ǰ���ڵ���ͨ��ʽΪ:"+mediumFormat.format(date));
			System.out.println("��ǰ��Ķ̸�ʽΪ:"+shortFormat.format(date));
		
	}
}