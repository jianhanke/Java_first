import java.io.*;
public class Example11 {
	public static void main(String[] args)throws Exception {
		FileReader fr=new FileReader("Example09.java");
		FileWriter fw=new FileWriter("copy.java");
	LineNumberReader lr= new LineNumberReader(fr);
	lr.setLineNumber(0);
	String line=null;
	while((line=lr.readLine())!=null) {
		fw.write(lr.getLineNumber()+":"+line);
		fw.write("\r\n");
	}
	lr.close();
	fw.close();
	}
}
