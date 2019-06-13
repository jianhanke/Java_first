public class Example066{
	public static void main(String[] args){
		String str="羽,毛,球,篮,球,乒乓球,\r";
		System.out.println("从第5个子字符截取到末尾的结果"+str.substring(4));
		System.out.println("从第5个字符截取到第6个字符的结果"+str.substring(4,6));
		System.out.println("分割后的字符串数组中的元素依次是:");
		String[] strArray=str.split(",");
		
		for(int i=0;i<strArray.length;i++){
				System.out.print(strArray[i]+".");
			}
		System.out.println(str);
		System.out.println(str);
		}
	}
