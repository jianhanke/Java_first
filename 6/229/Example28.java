import java.text.*;
import java.util.*;
public class Example28{
	public static void main(String[] args){
		SimpleDateFormat dfl=new SimpleDateFormat("Gyyyy年的MM月的dd的:今天是yyyy年的第D天,E");
		SimpleDateFormat df2=new SimpleDateFormat("Gyyyy MM dd yyyy D ,E");
		
		
		System.out.println(dfl.format(new Date()));
		System.out.println(df2.format(new Date()));
		System.out.println(df2.format(new Date()));
	}
}