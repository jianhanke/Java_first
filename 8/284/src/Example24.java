import java.io.*;
import java.util.*;

public class Example24 {

	public static void main(String[] args) throws Exception{
		Vector vector=new Vector();
		FileInputStream fis1=new FileInputStream("1.txt");
		FileInputStream fis2=new FileInputStream("2.txt");
		FileInputStream fis3=new FileInputStream("3.txt");
		vector.add(fis1);
		vector.add(fis2);
		vector.add(fis3);
		Enumeration e=vector.elements();
		SequenceInputStream sis=new SequenceInputStream(e);
		FileOutputStream out=new FileOutputStream("stream.txt");
		int len;
		byte[] buf=new byte[1024];
		while((len=sis.read(buf))!=-1) {
			out.write(buf,0,len);
			out.write("\r\n".getBytes());
		}
		sis.close();
		out.close();
	}

}
