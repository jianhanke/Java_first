 class Father{
 
	private String name="zhangjuns";
	public String getFather(){
		return name;
	}
	public void setFather(String name){
			this.name=name;
		}
 }
public class Test{
	public static void main (String[] args){
		
		Father fat=new Father();
			fat.setFather("jianhanke");
			System.out.println(fat.getFather());
	}
}