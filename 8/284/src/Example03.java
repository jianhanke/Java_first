import java.io.*;

public class Example03 {
	public static void main(String[] args) throws Exception {
		FileOutputStream out=new FileOutputStream("example.txt",true);//����֮ǰ�ĵ����ݣ�׷��ĩβ
		String str=",������ӭ��";
		byte[] b=str.getBytes();
		for(int i=0;i<b.length;i++) {
			out.write(b[i]);
		}
		out.close();
	}
}
