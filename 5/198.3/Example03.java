class Example03{
	public static void main (String[] args)throws Exception{
		Test t=new Test();
		new Thread(t,"��111����ʦ").start();
		new Thread(t,"��2222222����ʦ").start();
		new Thread(t,"��333333333333����ʦ").start();	
		Thread.currentThread().sleep(500);  //���̵߳ȴ�0.5�룬���½��߳�������������Ϣ
		System.out.println("174804054 ����ʤ");
		
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
		System.out.println(Thread.currentThread().getName()+"���ڷ��ŵ�"+books--+"����");
		}
	}


		
}