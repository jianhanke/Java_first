public class Example11{
	public static void main (String[] args){
		SaleThread saleThread=new SaleThread();
		new Thread(saleThread,"线程一").start();
		new Thread(saleThread,"线程二").start();
		new Thread(saleThread,"线程三").start();
		new Thread(saleThread,"线程四").start();
		new Thread(saleThread,"线程五").start();
	}
}
class SaleThread implements Runnable{
	private int tickets=10;
	Object lock=new Object();
	
	public void run(){
		
		//synchronized(lock){
			
		while(tickets>0){
       //此处有5-1=4个在等待线程一结束，线程一结束后会有0 -1 -2 -3（总共四个）
			   synchronized(lock){		
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"---卖出的票"+tickets--);
		}
		
		}
	}
}
	
