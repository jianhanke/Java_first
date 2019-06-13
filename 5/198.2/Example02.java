class Example02{
	public static void main(String[] args){
		
		new Thread(new Test()).start();
		
		
		for(int i=1;i<=50;i++){
		System.out.println("main 174804054 ÕÔÅàÊ¤");
	}
	
	}
}
class Test implements Runnable{
	public void run(){
		for(int i=1;i<=50;i++){
		System.out.println("new 174804054 ÕÔÅàÊ¤");
	}
	}
}