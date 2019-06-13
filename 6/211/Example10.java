class Example10{
	public static void main(String[] args){
		long starttime=System.currentTimeMillis();
		long c=starttime/(1000*3600*24*365);
		System.gc();
		System.out.println(c);
	
		System.out.println(1047/48);
		System.gc();
	}
}