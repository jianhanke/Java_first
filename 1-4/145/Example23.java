public class Example23{
	public static void main (String[] args)throws Exception{
		
		int result=divide(4,-2);
		System.out.println(result);
		
	}
	public static int divide (int x,int y) throws Exception{
		if(y<0){
			throw new Jianhanke("´íÎó");
		}
	
	int result=x/y;
	return result;
      }
}
 class Jianhanke extends Exception{
	public Jianhanke() {
		super();
	}
	public Jianhanke(String name){
		super(name);
	}

}