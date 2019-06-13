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
//将字节流转化成字符输入流   InputStreamReader()
//将字节流转化成字符输出流   OutputStreamWriter()

//字节流字符输入 InputStreamReader()
//字节流字符输出 OutputStreamWriter()