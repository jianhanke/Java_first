import java.io.*;
public class Example04 {
	public static void main(String[] args) throws Exception{
		InputStream in=new FileInputStream("source\\����style.mp3");
		OutputStream out=new FileOutputStream("target\\����style.mp3");
		int len;
		long begintime=System.currentTimeMillis();
		while((len=in.read())!=-1) {
			out.write(len);
		}
		long endtime=System.currentTimeMillis();
		long time=endtime-begintime;
		System.out.println("�����ļ������ĵ�ʱ����:"+time+"����");
		in.close();
		out.close();
	}
}
