
public class Example26{
	public static void main (String[] args)throws Exception{
		
        int result=divide(4,-2);
		System.out.println(result);
		
	}
	public static int divide(int x,int y)throws Exception{
		
		
		if(y<0){	
			throw new DivideByMinusException("被除数是负数");
		}
			
		
		int result=x/y;
		return result;
	}
}
