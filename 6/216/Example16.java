import java.util.Random;
public class Example16{
	public static void main (String[] args){
		Random r=new Random();
		
		for(int x=0;x<10;x++){
			System.out.println(r.nextInt(100));
		}
		System.out.println('\n');
		
		for(int x=0;x<10;x++){
			System.out.println(r.nextInt(100));
		}
		System.out.println('\n');
		
		for(int x=0;x<10;x++){
			System.out.println(r.nextInt(100));
		}
		//这三个for循环，会和下此运行一样，
		//而不是本次运行三个都一样。
			System.out.println(r.nextBoolean());
			System.out.println(r.nextDouble());
			System.out.println(r.nextFloat());
			System.out.println(r.nextInt());
			System.out.println(r.nextLong());
	}
}