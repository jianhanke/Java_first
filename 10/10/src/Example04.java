import java.io.*;
import java.net.*;
public class Example04 {
	public static void main(String[] args) throws Exception {
		new TCPServer().listen();
	}	
		//�����  		
}
	class TCPServer{
		private static final int PORT=7788;
		public void listen() throws Exception {
			ServerSocket serverSocket=new ServerSocket(PORT);
			Socket client=serverSocket.accept();
			
			System.out.println("��ʼ");
			System.out.println("��ʼ��ͻ��˽�������0000");

			//ִ��accept��ʼ������֪���ͻ��˷������ӣ����ӳɹ��Żᷢ��һ��Socket����
			OutputStream os=client.getOutputStream();
			
			os.write(("���ǲ��ͻ�ӭ��!".getBytes()));
			Thread.sleep(3000);   //�����˯�ߣ��޷�������������С�
			System.out.println("������ͻ��˽�������");
			System.out.println("����1");
			os.close();
			System.out.println("�رղ���1");
			client.close();
			System.out.println("�رղ���2");
		}
	}
