class YieldThread extends Thread{
	public YieldThread (String name){
		super(name);
	}
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+"---"+i);
			if(i==3){
				System.out.println(Thread.currentThread().getName()+"�ò�");
				Thread.yield();
			}
		}
	}
}
public  class Example09{
	public static void main(String[] args){
		Thread t1=new YieldThread("�߳�A");
		Thread t2=new YieldThread("�߳�B");
		Thread t3=new YieldThread("�߳�C");
		t1.start();
		t2.start();
		t3.start();
	}
}
