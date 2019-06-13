import java.io.*;
public class Example15 {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos=new FileOutputStream("d:\\dataStream.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		dos.writeByte(12);		
		dos.writeChar('1');
		dos.writeBoolean(true);
		dos.writeUTF("Í¬Ñ§ÄãºÃ");
		dos.close();
		
		FileInputStream fis=new FileInputStream("d:\\dataStream.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		DataInputStream dis=new DataInputStream(bis);
		
		System.out.println(dis.readByte());
		System.out.println(dis.readChar());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readUTF());
		dis.close();

	}

}
