public class Example02{
	public static void main (String[] args){
             int y=function(10); 
			 System.out.println(y);
				
	}
}

public static int function(int x){
	int y;
	if(x>0){
		y=x+3;
	}
	else if(x==0){
		y=0;
	}
	else {
		y=x*x-1;
	}
	return y;
}

		
