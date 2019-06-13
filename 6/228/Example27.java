import java.text.*;
public class Example27{
	public static void main(String[] args)throws Exception{
		DateFormat df1=DateFormat.getDateInstance(DateFormat.LONG);
		String d1="2008Äê 8ÔÂ 8ÈÕ";
		
		System.out.println(df1.parse(d1));
			
		}
		
	}

