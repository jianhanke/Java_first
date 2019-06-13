public class Example03{
	public static void main(String[] args){
		String str="abcd";
		System.out.println("将字符串转换的结果");
		char[] charArray=str.toCharArray();
		for(int i=0;i<charArray.length;i++){
			if(i!=charArray.length-1){
				System.out.println(charArray[i]+",");
			}else{
				System.out.println(charArray[i]);
			}
		}
		System.out.println("将int值转化为String类型之后的结果:"+String.valueOf(12));
		System.out.println("将字符串转化成大小写之后的结果"+str.toUpperCase());
	}
}