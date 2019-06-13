import java.util.Random;
public class Example22
{
	public static void main(String[] args)throws Exception{
	Storage st=new Storage();
	Input intput=new Input(st);
		Out  out=new Out(st);

		new Thread(intput).start();
		new Thread(out).start();
		
	}
}