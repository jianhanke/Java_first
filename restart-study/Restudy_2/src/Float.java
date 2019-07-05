
public class Float {
	public static void main(String[] args) {
		System.out.println(0.1f);
		System.out.println(0.1f==0.1d);
		
		
		
		Test_default();
		
	}
	public static void Test_array() {
		
	}
	public static void Test_default() {
		int[] arr=new int[5] {1,2,3,4};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void Test_25() {
		System.out.println(00001010<<2);
		System.out.println(Integer.toBinaryString(0B00001010<<2));
		
	}
	
	public static void Test_23(){
		byte b1=-127;
		byte b2=4;
		byte b3 =(byte) (b1+b2);
		System.out.println(b3);
	}
	public static void Test_21() {
		int num=4;
		byte b=(byte) num;
		System.out.println(b);
		
		byte a;
		int b2=298;
		a=(byte)b2;
		System.out.println(b2);
		System.out.println(a);
	}
	
}
