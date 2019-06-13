import java.io.*;

public class Example05 {
	public static void main(String[] args) throws Exception{
		InputStream in=new FileInputStream("source\\江南style.mp3");
		OutputStream out=new FileOutputStream("target\\江南style.mp3");
		byte[] buff=new byte[1024];
		int len;
		int cnt=0;
		long begintime=System.currentTimeMillis();
		while((len=in.read(buff))!=-1) {
			out.write(buff,0,len);
			System.out.println(len);
			cnt+=1;
		}
		System.out.println("次数共有"+cnt);
		long endtime=System.currentTimeMillis();
		long time=endtime-begintime;
		System.out.println("拷贝文件所消耗的时间是:"+time+"毫秒");
		in.close();
		out.close();
	}
}
