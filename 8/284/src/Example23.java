import java.io.*;
public class Example23 {
	public static void main(String[] args) throws Exception{
			FileInputStream in1=new FileInputStream("stream1.txt");
			FileInputStream in2=new FileInputStream("stream2.txt");
			SequenceInputStream sis=new SequenceInputStream(in1,in2);
			
			FileOutputStream out=new FileOutputStream("Stream.txt");
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
