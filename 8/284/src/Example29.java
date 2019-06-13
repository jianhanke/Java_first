import java.io.*;
public class Example29 {

	public static void main(String[] args) {
		File file=new File("F:\\123");
		if(file.exists()) {
			System.out.println(file.delete());
		}
	}
}
