class Example01{
	public static void main (String[] args){
		String str1=new String ();
		String str2=new String ("abcd");
		char[] charArray=new char[] {'D','E','F','G'};
		String str3=new String (charArray);
		
		char[] jian=new char[]{'A','B','C','D'};
		String str4=new String(jian);
		
		System.out.println("a"+str1+"b");
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}
}