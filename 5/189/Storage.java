class Storage {
	private int[] cells=new int[10];
	private int inPos,outPos;
	private int count;	
	public synchronized void put(int num){
		try{System.out.println(num);
		while(count==cells.length){
			this.wait();
		}
		cells[inPos]=num;
		System.out.println(Thread.currentThread().getName()+"从celss["+inPos+"]中存入数据"+cells[inPos]);
		inPos++;
		if(inPos==cells.length)
		   inPos=0;	       //（输进去数字10下，才算一个）（进入就绪状态，等待CPU调试完毕）
		count++;  //等运行结束后才能真正调用函数，因为调用了notify但是 之前的函数还没用完（运行10）
		this.notify();		
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public synchronized void get(){
		try{
		while(count==0){
			System.out.println(Thread.currentThread().getName()+"因为count=0 所以被堵塞");
			this.wait();
		}
		int date=cells[outPos];
		System.out.println(Thread.currentThread().getName()+"从celss["+outPos+"]中取出数据"+cells[outPos]);
		outPos++;
		if(outPos==cells.length)
		outPos=0;
		count--;
	    this.notify();	
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
class Input implements Runnable {
	private Storage st;
	private int num;
	Input(Storage st){
		this.st=st;
	}
	public void run(){
		while(true){
			st.put(++num);
		}
	}
}
class Output implements Runnable {
	private Storage st;
	Output(Storage st){
		this.st=st;
	}
	public void run(){
		while(true){
			st.get();
		}
	}
}