import java.io.*;
public class Example190 {

	public static void main(String[] args) throws Exception{
		PipedInputStream pis=new PipedInputStream();
		PipedOutputStream pos=new PipedOutputStream();
		pis.connect(pos);
		
		new Thread(new Runnable() {
			public void run() {
				BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
				PrintStream ps=new PrintStream(pos);
				while(true) {
					try {
						System.out.print(Thread.currentThread().getName()+"Ҫ����������");
						ps.println(br.readLine());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		},"�������ݵ��߳�").start();
		
		new Thread(new Runnable() {
			
			public void run() {
				BufferedReader br = new BufferedReader (new InputStreamReader(pis));
				 while(true) {
					 try {
						System.out.println(Thread.currentThread().getName()+"�յ�������"+br.readLine());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 }
			}
		},"�������ݵ��߳�").start();

	}

}
