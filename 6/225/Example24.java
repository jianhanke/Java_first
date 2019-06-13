import java.util.*;
public class Example24{
	public static  void main(String[] args){
		
		Calendar calendar=Calendar.getInstance();
		
		System.out.println(Calendar.YEAR);
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.DATE);
		
		calendar.set(2018,5,14);
		calendar.add(Calendar.DATE,223);
		calendar.add(Calendar.YEAR,0);
		calendar.add(Calendar.MONTH,0);
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH)+1;
		int date=calendar.get(Calendar.DATE);
		System.out.println("成为四年好友时间为:"+year+"年"+month+"月"+date+"日"+Calendar.HOUR+"时"+Calendar.MINUTE+"分"+Calendar.SECOND+"秒");
		
	}
}