import java.text.*;
import java.util.*;
public class Example28{
	public static void main(String[] args){
		SimpleDateFormat dfl=new SimpleDateFormat("Gyyyy���MM�µ�dd��:������yyyy��ĵ�D��,E");
		SimpleDateFormat df2=new SimpleDateFormat("Gyyyy MM dd yyyy D ,E");
		
		
		System.out.println(dfl.format(new Date()));
		System.out.println(df2.format(new Date()));
		System.out.println(df2.format(new Date()));
	}
}