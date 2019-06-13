class Example04{
	public static void main(String[] args)throws Exception{
	  Number number =new Number();
	  new Thread(number,"1").start();
	  new Thread(number,"22").start();
	  new Thread(number,"333").start();
	  new Thread(number,"4444").start();
	  new Thread(number,"55555").start();
	  new Thread(number,"666666").start();
	  new Thread(number,"7777777").start();
	  new Thread(number,"88888888").start();
	  new Thread(number,"999999999").start();
	  new Thread(number,"1000000000").start(); 
	Thread.currentThread().sleep(1000);   //等10个线程运行结束，在最结尾处显示 10个线程相加结果
	System.out.println(number.num);
	}
}
class Number implements Runnable{
	public static int i=1;
	public  int sum=0;
	public  int num=0;
	public int n=1;
	Object lock =new Object();
	public void run(){
		synchronized(lock){
			sum=0;
			int n=1;
			for(int cnt=1;cnt<=10;cnt++){
				sum=sum+i;
				++i;
		}
		System.out.println(Thread.currentThread().getName()+"这个线程的sum="+sum);
		    num+=sum;
	}
	}
	
}