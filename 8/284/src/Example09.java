import java.io.*;
public class Example09 {
	public static void main(String[] args) throws Exception{
		FileWriter writer=new FileWriter("writer.txt",true);
		String str="��ã����ǲ���";
		writer.write(str);
		writer.write("\r\n");
		writer.close();
	}
}
