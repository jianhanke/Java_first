import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Example01 {

	public static void main(String[] args) throws Exception{
		FileInputStream fim=new FileInputStream("soucre\\123.txt");
		FileOutputStream fom=new FileOutputStream("target\\123.txt");
		
		byte[] buff=new byte[1024];
		int len;
		while((len=fim.read(buff))!=-1) {
			fom.write(buff,0,len);
		}
		fim.close();
		fom.close();
		
		FileReader fr=new FileReader("soucre\\456.txt");
		BufferedReader br=new BufferedReader(fr);
		FileWriter fw=new FileWriter("target\\456.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		String str;
		while((str=br.readLine())!=null) {
			bw.write(str);
		}
		br.close();
		bw.close();
	}

}
