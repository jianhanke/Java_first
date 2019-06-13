class Example03{
	public static void main (String[] args)throws Exception{
		Test t=new Test();
		new Thread(t,"第111个老师").start();
		new Thread(t,"第2222222个老师").start();
		new Thread(t,"第333333333333个老师").start();	
		Thread.currentThread().sleep(500);  //主线程等待0.5秒，等新建线程运行完毕输出信息
		System.out.println("174804054 赵培胜");
		
	}
}
class Test implements Runnable{
	private int books=80;
	
	public void run(){
		
		while(true){		
			salebook();
		if(books<=0){
			break;
		}
	}
	
}

	
	private synchronized void salebook(){
		if(books>0){
		System.out.println(Thread.currentThread().getName()+"正在发放第"+books--+"本书");
		}
	}


		
}