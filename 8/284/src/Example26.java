import java.io.*;
public class Example26 {

	public static void main(String[] args) throws Exception{
		
			File file=new File("F:\\8\\284\\src");
			if(file.isDirectory()) {
				String[] names=file.list();
				for(String name: names) {
					System.out.println(name);
				}
				System.out.println(file.getParent());
			}else {
				System.out.println("²»´æÔÚ");
			}
		}
}

