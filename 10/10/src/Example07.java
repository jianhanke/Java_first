import java.io.*;
import java.net.*;
public class Example07 {
	private static ServerSocket serversocket;

	public static void main(String[] args) throws Exception {
		try {
			serversocket = new ServerSocket(1001);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		while(true) {
			Socket s = null;
			try {
				s = serversocket.accept();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			new Thread(new ServerThread(s)).start();
		}
	}
}
class ServerThread implements Runnable{
	private Socket socket;
	public ServerThread(Socket socket) {
		this.socket=socket;
	}
	
	public void run() {
		String ip=socket.getInetAddress().getHostAddress();
		int count=1;
		try {
			InputStream in=socket.getInputStream();
		
		File parentFile=new File("d:\\upload\\");
		if(!parentFile.exists()) {
			parentFile.mkdir();
		}
		File file=new File(parentFile,ip+"("+count+").jpg ");
		while(file.exists()) {
			file=new File(parentFile,ip+"("+(count++)+").jpg ");
		}
		FileOutputStream fos=new FileOutputStream(file);
		byte[] buf=new byte[1024];
		int len=0;
		while(  ( len=in.read(buf))!=-1) {
			fos.write(buf,0,len);
		}
		OutputStream out=socket.getOutputStream();
		out.write("�ϴ��ɹ�".getBytes());
		fos.close();
		socket.close();
		}catch (Exception e){
			
		}
		
	}
}