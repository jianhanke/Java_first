public class Example04{
	public static void main (String[] args){
		new TicketWindow().start();
		new TicketWindow().start();
		new TicketWindow().start();
		new TicketWindow().start();
	}
}
class TicketWindow extends Thread{
	private int tickets=100;
	public void run(){
		while(true){
			if(tickets>0){
				Thread th_name=Thread.currentThread();
				
				System.out.println("���ڷ��۵�"+tickets--+"��Ʊ");
			}
		}
	}
}