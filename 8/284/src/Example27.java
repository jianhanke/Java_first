import java.io.*;

public class Example27 {

	public static void main(String[] args) throws Exception{
		File file=new File("F:\\8\\284");
		FilenameFilter filter=new FilenameFilter() {
			
				public boolean accept(File dir,String name) {
				File currFile=new File(dir,name);
				if(currFile.isFile() && name.endsWith(".java")) {
					return true;
				}else {
					return false;
				}
			}
			};
			if(file.exists()) {
				String[] lists=file.list(filter);
				for(String name:lists) {
					System.out.println(name);
				}
			}
		}

	}


