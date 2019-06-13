import java.util.*;
public class Example25{
	public static void main(String[] args){
		Calendar calendar=Calendar.getInstance();
		
		calendar.set(Calendar.MONTH,13);
		
		System.out.println(calendar.getTime());
		calendar.setLenient(false);
		calendar.set(Calendar.MONTH,13);
		System.out.println(calendar.getTime());
		
		
	}
}