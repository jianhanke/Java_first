import java.io.*;

public class Example03 {
	public static void main(String[] args) throws Exception {
		FileOutputStream out=new FileOutputStream("example.txt",true);//保留之前文档内容，追加末尾
		String str=",北京欢迎你";
		byte[] b=str.getBytes();
		for(int i=0;i<b.length;i++) {
			out.write(b[i]);
		}
		out.close();
	}
}
