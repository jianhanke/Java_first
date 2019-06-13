1:import java.io.*;
2:public class Example09 {
3:	public static void main(String[] args) throws Exception{
4:		FileWriter writer=new FileWriter("writer.txt",true);
5:		String str="ÄãºÃ£¬´«ÖÇ²¥¿Í";
6:		writer.write(str);
7:		writer.write("\r\n");
8:		writer.close();
9:	}
10:}
