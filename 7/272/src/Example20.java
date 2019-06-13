import java.util.*;
public class Example20 {

	public static void main(String[] args) {
		int[] arr= {9,8,3,5,2};
		Arrays.sort(arr);
		int index=Arrays.binarySearch(arr,5);
		
		System.out.println("数组排序后的元素"+index);

	}

}
