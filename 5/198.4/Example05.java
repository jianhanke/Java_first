class Example05{
	public static void main (String[] args)throws Exception{
		Number number=new Number();
		for(int i=0;i<10;i++){
			new Thread(number).start();
		}
	Thread.currentThread().sleep(5000);   //等10个线程运行结束，在最结尾处显示 10个线程相加结果
	System.out.println(number.sum);
	System.out.println("174804054 赵培胜");
	}
}
class Number implements Runnable{
	private int i=1;
	private  int num;
	public   int sum;
	public void run(){
	add();   
	//经测试System，不能写在20行，因为add用完过后，return"num"正在system.out.(num)
	//写num值的过程中，已经被下一个add()函数将，num值改变
	//System.out.println(Thread.currentThread().getName()+"jianhanke");  
   // System.out.println(Thread.currentThread().getName()+",,,,"+num);  //测试用
	//System.out.println('\n');
	}
	private synchronized int add(){
		num=0;
		for(int cnt=1;cnt<=10;cnt++){
			num+=i;
			++i;
	     }
	     	System.out.println(Thread.currentThread().getName()+"!!!!!!!!"+num);
		 sum+=num;	
		 return num;	 
	}
}