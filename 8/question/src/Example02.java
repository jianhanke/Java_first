import java.io.*;

public class Example02 {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		int cnt=5;
		while(true) {
			line=br.readLine();
		if(line.equals("123456")) {
				System.out.println("登陆成功");
				break;
		}else {
			--cnt;
			if(cnt>0) {
			System.out.println("你还有"+cnt+"次机会");	
			}
			else {
				System.out.println("你的次数已经用完222");
				break;
			}	
	}
		}
	}
}

