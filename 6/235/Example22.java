class Example22{
	public static void main(String[] args){
			
		System.out.println(20+(int)(Math.random()*980));
		
		System.out.println(20+(int)Math.random()*980);
		System.out.println((int)Math.random()*999);
		
		int i;
		float f=2.3f;
		double d=2.7;
		i=((int)Math.ceil(f)*(int)Math.round(d));
		
		System.out.println(i);
		double d2=2.7;
		System.out.println(Math.round(d2));
		
		System.out.println(Math.abs(-5));
		System.out.println(Math.ceil(6.6));
		System.out.println(Math.ceil(6));
	}
}