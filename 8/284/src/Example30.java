import java.io.*;
public class Example30 {
	public static void main(String[] args) throws Exception{
		File file=new File("F:\\123");
		deleteDir(file);
	}
	public static void deleteDir(File dir) {
		if(dir.exists()){
			File[] files=dir.listFiles();
			for(File file:files) {
				if(file.isDirectory()) {
					deleteDir(file);
				}else {
					file.delete();
				}
			}
			dir.delete();
		}
	}


}
