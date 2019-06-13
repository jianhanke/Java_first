import java.io.*;
public class Example28 {
	public static void main(String[] args) throws Exception{
		File file=new File("F:\\8\\284");
		fileDir(file);
	}
	public static void fileDir(File dir) {
		File[] files=dir.listFiles();
		for(File file:files) {
			if(file.isDirectory()) {
				fileDir(file);
			}
			System.out.println(file.getAbsolutePath());
		}
	}
}
