import java.util.*;
public class Example29 {
	public static void main(String[] args) {
		int[] arr= {9,8,3,5,2};
		System.out.println("����ǰ:");
		printArray(arr);
		Arrays.sort(arr);
		System.out.println("�����:");
		printArray(arr);
		
		Arrays.sort(arr);
		int index=Arrays.binarySearch(arr,3);
		System.out.println("����������Ԫ��3��������;"+index);
		
	}
	public static void printArray(int[] arr){
		System.out.println("[");
		for(int x=0;x<arr.length;x++) {
			if(x!=arr.length-1) {
				System.out.println(arr[x]+",");
			}else {
				System.out.println(arr[x]+"]");
			}
		}
		
	}
}
