import java.util.Random;

class Storage
{
String name;
int cnt;
int sum;
//登录
		public void put()throws Exception{
			
	for(int i=0;i<5+new Random(3).nextInt(10);i++){ //随机登录几个用户，最少五个用户
		name=String.valueOf(1000+new Random().nextInt(9001));
			++cnt;
	System.out.println("用户“"+name+"”登录");
	Thread.currentThread().sleep(20);
	}
		System.out.println("当前在线人数为:"+cnt);
	}
			//注销
		public void get()throws Exception{
		
		for(int i=0;i<3+new Random(3).nextInt(10);i++){
			
			System.out.println("用户‘"+1000+new Random().nextInt(9001)+"'已被注销");
			--cnt;
			Thread.currentThread().sleep(40);
		}
       System.out.println("当前在线人数"+cnt);
	   		
  }
}
class Input implements Runnable //登录线程
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
class Out implements Runnable  //注销线程
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
