 import java.io.*;
 public class Example31 {
	public static void main(String[] args) throws Exception{
		RandomAccessFile raf=new RandomAccessFile("time.txt","rw");
		int times=0;
		times=Integer.parseInt(raf.readLine());
		if(times>0) {
			System.out.println("�����������"+--times+"��!");
			raf.seek(0);
			raf.writeBytes(times+"");
		}else {
			System.out.println("���ʹ�ô����ѵ�");
			// raf.write("��Ĵ����ѵ�".getBytes());
		}
		raf.close();
	}
}
