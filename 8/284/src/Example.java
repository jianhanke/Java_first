import java.io.*;

import bank.User; 

public class Example {
	public static void main(String[] args)throws Exception{
		FileInputStream in=new FileInputStream("test.txt");
		int b=0;
		System.out.println(in.available());
		while(true) {
			b=in.read();
			if(b==-1) {
				break;
			}
			
			System.out.println((char)b);
		}
		in.close();
		
	}
	
}
