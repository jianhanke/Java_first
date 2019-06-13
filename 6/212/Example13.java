import java.io.*;
public class Example13{
	public static void main (String[] args) throws Exception{
		Runtime rt=Runtime.getRuntime();
		Process process=rt.exec("notepad.exe");
		Thread.sleep(1000);
		process.destroy();
	}
}