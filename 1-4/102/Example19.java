class Outer{
	private int num=4;
	public void test(){
class Inner{
			Inner in=new Inner();
		void show(){
				System.out.println("num="+num);
				System.out.println("jianhanek");
		}
	
	}
	// Inner in=new Inner();
			in.show();
}

}
public class Example19{
	public static void main (String[] args){
		Outer outer=new Outer();
		outer.test();
	}
}