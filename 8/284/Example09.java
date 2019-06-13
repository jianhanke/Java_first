import java.io.*;
public class Example09 {
	public static void main(String[] args) throws Exception{
		FileWriter writer=new FileWriter("writer.txt",true);
		String str="ÄãºÃ£¬´«ÖÇ²¥¿Í";
		writer.write(str);
		writer.write("\r\n");
		writer.close();
	}
}
