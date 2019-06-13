import java.io.*;
import java.net.*;
public class Example04 {
	public static void main(String[] args) throws Exception {
		new TCPServer().listen();
	}	
		//服务端  		
}
	class TCPServer{
		private static final int PORT=7788;
		public void listen() throws Exception {
			ServerSocket serverSocket=new ServerSocket(PORT);
			Socket client=serverSocket.accept();
			
			System.out.println("开始");
			System.out.println("开始与客户端交互数据0000");

			//执行accept开始堵塞，知道客户端发出连接，连接成功才会发会一个Socket对象
			OutputStream os=client.getOutputStream();
			
			os.write(("传智播客欢迎你!".getBytes()));
			Thread.sleep(3000);   //如果不睡眠，无法持续程序进行中。
			System.out.println("结束与客户端交互数据");
			System.out.println("测试1");
			os.close();
			System.out.println("关闭测试1");
			client.close();
			System.out.println("关闭测试2");
		}
	}

