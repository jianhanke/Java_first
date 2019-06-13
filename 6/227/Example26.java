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
		
		
		
			System.out.println("当前日期的完整格式为:"+fullFormat1.format(date));
			System.out.println("当前日期的完整格式为:"+fullFormat2.format(date));
		
			System.out.println("当前其的长格式为:"+longFormat.format(date));
			System.out.println("当前日期的普通格式为:"+mediumFormat.format(date));
			System.out.println("当前其的短格式为:"+shortFormat.format(date));
		
	}
}