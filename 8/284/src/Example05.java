import java.io.*;

public class Example05 {
	public static void main(String[] args) throws Exception{
		InputStream in=new FileInputStream("source\\����style.mp3");
		OutputStream out=new FileOutputStream("target\\����style.mp3");
		byte[] buff=new byte[1024];
		int len;
		int cnt=0;
		long begintime=System.currentTimeMillis();
		while((len=in.read(buff))!=-1) {
			out.write(buff,0,len);
			System.out.println(len);
			cnt+=1;
		}
		System.out.println("��������"+cnt);
		long endtime=System.currentTimeMillis();
		long time=endtime-begintime;
		System.out.println("�����ļ������ĵ�ʱ����:"+time+"����");
		in.close();
		out.close();
	}
}
