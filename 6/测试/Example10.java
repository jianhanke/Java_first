class Example10{
	public static void main(String[] args){
		String str1=new String("164801001 ���� ��;164801002 ���� Ů;164801003 ���� ��;");
	   String[]str2 =new String[20];
		char[] str3=new char[]{'A','B','C','D'};
		String str4=new String("1");
		
		System.out.println(str4);
	   System.out.println(str2);
		str2=str1.split(";");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		for(int i=0;i<str2.length;i++){
			System.out.println(str2[i]);
			System.out.println("ѧ���Ƿ���1648��ͷ:"+str2[i].startsWith(String.valueOf(1648)));
		}
		
	}
	
}