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
		//������forѭ��������´�����һ����
		//�����Ǳ�������������һ����
			System.out.println(r.nextBoolean());
			System.out.println(r.nextDouble());
			System.out.println(r.nextFloat());
			System.out.println(r.nextInt());
			System.out.println(r.nextLong());
	}
}