import java.io.*;
public class Example20 {

	public static void main(String[] args) throws Exception{
		FileInputStream in=new FileInputStream("source2.txt");
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		FileOutputStream out=new FileOutputStream("target.txt");
		int b;
		while((b=in.read())!=-1) {
			bos.write(b);
		}
		in.close();
		bos.close();
		out.write(bos.toByteArray());
		out.close();
	}
}