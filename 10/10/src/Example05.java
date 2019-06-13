import java.io.*;
import java.net.*;
public class Example05 {
	public static void main(String[] args) throws Exception {
		new TCPClient().connect();
		new TCPClient().connect();
		new TCPClient().connect();
		
	}
}
//¿Í»§¶Ë
class TCPClient{
	private static final int PORT=7788;
	public void connect() throws Exception, Exception {
		Socket client=new Socket(InetAddress.getLocalHost(),PORT);
		
		InputStream is=client.getInputStream();
		byte[] buf=new byte[1024];
		int len=is.read(buf);
		System.out.println(new String(buf,0,len));
		client.close();
	}
}