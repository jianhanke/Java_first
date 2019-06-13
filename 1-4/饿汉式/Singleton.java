public class Singleton{
	private Singleton(){
		
	}

	private static Singleton single=null;
	public static Singleton getInstance(){
		if(single==null){
			single=new Singleton();
			
		}
		return single;
	}
	}
	