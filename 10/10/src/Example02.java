import java.net.*;
public class Example02 {
	public static void main(String[] args) throws Exception{
		byte[] buf=new byte[1024];
		DatagramSocket ds=new DatagramSocket(8954);
		DatagramPacket dp=new DatagramPacket(buf,1024);
		System.out.println("等待接受数据");
		
		ds.receive(dp);
		
		String str=new String(dp.getData(),0,dp.getLength())+"from"+dp.getAddress().getHostAddress()+":"+dp.getPort();
		System.out.println(str);
		ds.close();
		
	}
}
