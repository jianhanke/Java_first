class Example01{
	public static void main(String[] args){
	int i,j;
	int temp;
	int[]s={25,24,12,76,101,96,28};
	for(i=0;i<7-1;i++)
	{
		for(j=0;j<7-1-i;j++){
			if(s[j]>s[j+1]){
				temp=s[j];
				s[j]=s[j+1];
				s[j+1]=temp;
			}
		}
	}
			for(i=0;i<7;i++)
				System.out.println(s[i]);
		
}
}