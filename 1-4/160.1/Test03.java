public class Test03{
	public static void main (String[] args){
		try{
			int x=2/0;
			System.out.println(x);
		}catch(Exception e){
			System.out.println("异常为："+e.getMessage());
		}finally{
			System.out.println("进入finally代码块");
		}
	}
}