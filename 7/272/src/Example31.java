import java.util.*;
public class Example31 {
	public static void main(String[] args) {
		int[]arr= {9,8,3,5,2};
		int[]copied=Arrays.copyOfRange(arr, 0, 7);
		for(int i=0;i<copied.length;i++) {
			System.out.println(copied[i]+"");
		}
		//Example32
		int[]arr2= {1,2,3,4};
		Arrays.fill(arr2,8);
		for(int i=0;i<arr2.length;i++) {
			System.out.println(i+":"+arr2[i]);
		}
		//Example33
		int[] arr3= {9,8,3,5,2};
		String arrString=Arrays.toString(arr);
		System.out.println(arrString);
		
		//
		
	}
}
