import java.io.*;

public class Example02 {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		int cnt=5;
		while(true) {
			line=br.readLine();
		if(line.equals("123456")) {
				System.out.println("��½�ɹ�");
				break;
		}else {
			--cnt;
			if(cnt>0) {
			System.out.println("�㻹��"+cnt+"�λ���");	
			}
			else {
				System.out.println("��Ĵ����Ѿ�����222");
				break;
			}	
	}
		}
	}
}

