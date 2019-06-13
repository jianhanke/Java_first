import java.io.*;
public class Example12 {
	public static void main(String[] args) throws Exception{
		FileInputStream in=new FileInputStream("src.txt");
		InputStreamReader isr=new InputStreamReader(in);
		BufferedReader br=new BufferedReader(isr);
		
		FileOutputStream out=new FileOutputStream("des.txt",true);
		OutputStreamWriter osw=new OutputStreamWriter(out);
		BufferedWriter bw=new BufferedWriter(osw);
		String line;
		while((line=br.readLine())!=null) {
			bw.write(line);
			System.out.println(line);
			System.out.println("µÚ¶þ¸ö");
		}
		br.close();
		bw.close();
		

		
	}
}
