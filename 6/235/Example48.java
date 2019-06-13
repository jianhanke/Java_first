public class Example48{
	public static void main(String[] args){
	String s1=new String("HelloWorld");
	char[] s1Array=s1.toCharArray();

	StringBuffer s2=new StringBuffer();

	for(int i=s1Array.length-1;i>=0;i--){
		char c=s1Array[i];
		if(c>=97&&c<=122){
		   String c2=String.valueOf(c).toUpperCase();
		   s2.append(c2);
		}else{
		 String c2=String.valueOf(c).toLowerCase();		
		 s2.append(c2);
		}
	}
	System.out.println(s2.toString());
	System.out.println("174804054,ÕÔÅàÊ¤");
}
}