import java.io.*;
public class Example04 {
	public static void main(String[] args) throws Exception{
		InputStream in=new FileInputStream("source\\江南style.mp3");
		OutputStream out=new FileOutputStream("target\\江南style.mp3");
		int len;
		long begintime=System.currentTimeMillis();
		while((len=in.read())!=-1) {
			out.write(len);
		}
		long endtime=System.currentTimeMillis();
		long time=endtime-begintime;
		System.out.println("拷贝文件所消耗的时间是:"+time+"毫秒");
		in.close();
		out.close();
	}
}
