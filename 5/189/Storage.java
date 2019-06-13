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
		System.out.println(Thread.currentThread().getName()+"��celss["+inPos+"]�д�������"+cells[inPos]);
		inPos++;
		if(inPos==cells.length)
		   inPos=0;	       //�����ȥ����10�£�����һ�������������״̬���ȴ�CPU������ϣ�
		count++;  //�����н���������������ú�������Ϊ������notify���� ֮ǰ�ĺ�����û���꣨����10��
		this.notify();		
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public synchronized void get(){
		try{
		while(count==0){
			System.out.println(Thread.currentThread().getName()+"��Ϊcount=0 ���Ա�����");
			this.wait();
		}
		int date=cells[outPos];
		System.out.println(Thread.currentThread().getName()+"��celss["+outPos+"]��ȡ������"+cells[outPos]);
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