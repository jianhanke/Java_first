class Example06{
	public static void main (String[] args)throws Exception{
		Number number=new Number();
		for(int i=0;i<10;i++){
			new Thread(number).start();
		}
	Thread.currentThread().sleep(5000);   //��10���߳����н����������β����ʾ 10���߳���ӽ��
	System.out.println(number.sum);
	}
}
class Number implements Runnable{
	private int i=1;
	private  int num;
	public   int sum;
	public void run(){
	add();    
	System.out.println(num);
	}
	private synchronized int add(){
		num=0;
		for(int cnt=1;cnt<=10;cnt++){
			num+=i;
			++i;
	     }
		 	System.out.println(num);

		 sum+=num;	
		 return num;
	}
}