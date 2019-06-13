public class Example21{
	public static void main(String[] args){
		System.out.println(getType(args[0]));
		int w=Integer.parseInt(args[0]);
		int h=Integer.parseInt(args[1]);
			
			
		for(int i=0;i<w;i++){
			StringBuffer sb=new StringBuffer();
			for(int j=0;j<h;j++){
				sb.append("*");
			}
			System.out.println(sb.toString());
		}
	}
}