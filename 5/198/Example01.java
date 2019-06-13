class Example01 {
	public static void main (String[] args){
		Test test1=new Test("线程一");
		Test test2=new Test("线程二");
		Test test3=new Test("线程三");
		Test test4=new Test("线程四");
		test1.start();
		test2.start();
		test3.start();
		test4.start();
		test1.speak();
		test2.speak();
		test3.speak();
		test4.speak();
	}
	
}
class Test extends Thread{
	public Test(String name){
		super(name);
	}
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
	void speak(){
		System.out.println("174804054 赵培胜");
	}
}