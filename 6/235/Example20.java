public class Example20{
	public static void main(String[] args){
		
	StringBuffer str1=new StringBuffer();
	
	str1.append("174804054 ÕÔÅàÊ¤ 20;174804040 ½£º®¿Í 25;174803050 µ¶Ñ×Ö÷ 30;");
	System.out.println(str1);
	delete1(str1,0,20);
	change (str1,0,20,"zaozhidaoshizheyangxiangmengyichang");
	look   (str1);
	
	}
	public static void look(StringBuffer str1){	
	String[] strArray=str1.toString().split(";");
		for(int i=0;i<strArray.length;i++){
			System.out.println(strArray[i]);
		}
		
	}
	public static void delete1(StringBuffer str,int start,int end){
		StringBuffer buffer=new StringBuffer(str);
		buffer.delete(start,end);
		System.out.println(buffer);
						
	}
	 private static void change(StringBuffer str,int start,int end,String s){
		StringBuffer buffer=new StringBuffer(str);
		buffer.replace(start,end,s);
		System.out.println(buffer);
	}
	
	
}




