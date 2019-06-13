package study;

public class Study_First {
	public static void main(String[] args) {
		
		int[] arr ;   //声明数组,却不赋值，在下面赋值，将会错误
		int i = 1; 		//此处为了方便观察，
		//arr= {1,2,3};		// The local variable arr may not have been initialized
		//System.out.println(arr);  //错误应为没有实例化 ,initial
		
		int[] arr2= {1,2,3};    //声明数组，同时赋值 在声明的时候直接就已经分配空间，并赋值,不能再改变
		System.out.println(arr2[1]);;  //可以输出
		int arr2[1]= 4;     //不使用 new 无法赋值 
		
		int[] arr3=new int[] {1,2,3};
		int[] arr4=new int[3];
		
		
		
	}
	
}
