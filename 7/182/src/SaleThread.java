
 class SaleThreadimplements Runnable{
	private int tickets=10;
	Object lock=new Object();
	
	public void run(){
		
		//synchronized(lock){
			
		while(tickets>0){
       //�˴���5-1=4���ڵȴ��߳�һ�������߳�һ���������0 -1 -2 -3���ܹ��ĸ���
			   synchronized(lock){		
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"---������Ʊ"+tickets--);
		}
		
		}
	}
}
