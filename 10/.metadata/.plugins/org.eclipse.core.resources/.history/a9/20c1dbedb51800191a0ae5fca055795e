import java.net.*;
public class Example03 {
	public static void main(String[] args) throws Exception{
		DatagramSocket ds=new DatagramSocket(300);
		String str="hello world";
		
		DatagramPacket dp=new DatagramPacket (str.getBytes(),str.length(),InetAddress.getByName("localhost"),8954);
		System.out.println("∑¢ÀÕ–≈œ¢");
		ds.send(dp);
		ds.close();
	}
}
