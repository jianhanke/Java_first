import java.net.InetAddress;
public class Example01 {
	public static void main(String[] args) throws Exception{
		InetAddress localhost=InetAddress.getLocalHost();
		InetAddress remoteAddress=InetAddress.getByName("www.itcase.cn");
		System.out.println("本地的地址为:"+localhost.getHostAddress());
		System.out.println("itcase的IP地址为:"+remoteAddress.getHostAddress());
		
		System.out.println("3秒是否 可达"+remoteAddress.isReachable(3000));
		System.out.println("itcase的主机名为:"+remoteAddress.getHostAddress()); 
	}
}
