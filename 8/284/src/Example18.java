import java.io.*;

public class Example18 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("source.txt"));
		System.setOut(new PrintStream("target.txt"));
		
		BufferedReader br=new BufferedReader(new  InputStreamReader(System.in  ));
		String line;
		while((line=br.readLine())!=null) {
			System.out.println(line);  
		}
	}

}
//���ֽ���ת�����ַ�������   InputStreamReader()
//���ֽ���ת�����ַ������   OutputStreamWriter()

//�ֽ����ַ����� InputStreamReader()
//�ֽ����ַ���� OutputStreamWriter()