import java.io.*;
public class Example21 {

	public static void main(String[] args) {
		byte [] bufs=new byte[] {97,98,99,100};
		ByteArrayInputStream bis=new ByteArrayInputStream(bufs);
		int b;
		while((b=bis.read())!=-1) {
			System.out.println((char)b);
		}

	}

}
