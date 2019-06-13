class Out{
	 static class Inner{
		static int num=10;
		 void show(){
			System.out.println("num="+num);
		}
	}
}
public class Outer{
	public static void main(String[] args){
		Out.Inner inner=new Out.Inner();
                inner.show();
	}
}