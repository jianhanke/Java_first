import java.util.Random;

class Storage
{
String name;
int cnt;
int sum;
//��¼
		public void put()throws Exception{
			
	for(int i=0;i<5+new Random(3).nextInt(10);i++){ //�����¼�����û�����������û�
		name=String.valueOf(1000+new Random().nextInt(9001));
			++cnt;
	System.out.println("�û���"+name+"����¼");
	Thread.currentThread().sleep(20);
	}
		System.out.println("��ǰ��������Ϊ:"+cnt);
	}
			//ע��
		public void get()throws Exception{
		
		for(int i=0;i<3+new Random(3).nextInt(10);i++){
			
			System.out.println("�û���"+1000+new Random().nextInt(9001)+"'�ѱ�ע��");
			--cnt;
			Thread.currentThread().sleep(40);
		}
       System.out.println("��ǰ��������"+cnt);
	   		
  }
}
class Input implements Runnable //��¼�߳�
{
Storage st;
public Input(Storage st){
this.st=st;
}
public void run(){
	while(true){
			try{
	st.put();
		}catch(Exception e){
			
		}
		
		}
	}
}
class Out implements Runnable  //ע���߳�
{
Storage st;
public Out(Storage st){
this.st=st;
}
public void run(){
	
	while(true){
		try{
	st.get();
		}catch(Exception e){
			
		}
	}
	}
}
