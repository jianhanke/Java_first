import java.net.InetAddress;
public class Example01 {
	public static void main(String[] args) throws Exception{
		InetAddress localhost=InetAddress.getLocalHost();
		InetAddress remoteAddress=InetAddress.getByName("www.itcase.cn");
		System.out.println("���صĵ�ַΪ:"+localhost.getHostAddress());
		System.out.println("itcase��IP��ַΪ:"+remoteAddress.getHostAddress());
		
		System.out.println("3���Ƿ� �ɴ�"+remoteAddress.isReachable(3000));
		System.out.println("itcase��������Ϊ:"+remoteAddress.getHostAddress()); 
	}
}