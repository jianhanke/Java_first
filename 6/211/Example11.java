public class Example11{
	public static void main(String[] args){
		int[] fromArray={111,222,333,444,555,666};
		int[] toArray=  {1,2,3,4,5,6,7};
		System.arraycopy(fromArray,2,toArray,3,5);
		for(int i=0;i<toArray.length;i++){
			System.out.println(i+":"+toArray[i]);
		}

	}
}