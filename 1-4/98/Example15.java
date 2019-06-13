class Single{
		// new静态的单例的 inatcance
	private static Single instance=new Single();
	//私有构造方法
		private Single(){
			
		}
	//提供返还值 //静态的
	public static Single getInstance(){
		return instance;
	}
}
class Example15{
	public static void main (String[] args){
		//调用公共的静态的getInstance
		Single s1=Single.getInstance();
		Single s2=Single.getInstance();
		System.out.println(s1);
		System.out.println(s2);
	}
}