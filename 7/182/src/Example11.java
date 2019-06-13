
public class Example11 {
	
	public static void main (String[] args){
		
		SaleThread saleThread=new SaleThread();
		
		new Thread(aleThread,"线程一").start();
		new Thread(aleThread,"线程二").start();
		new Thread(aleThread,"线程三").start();
		new Thread(aleThread,"线程四").start();
		
	}
}
