class Example01 {
	public static void main (String[] args){
		Test test1=new Test("�߳�һ");
		Test test2=new Test("�̶߳�");
		Test test3=new Test("�߳���");
		Test test4=new Test("�߳���");
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
		System.out.println("174804054 ����ʤ");
	}
}