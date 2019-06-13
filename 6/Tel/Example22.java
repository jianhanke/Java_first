public class Example22{
	public static void main(String[] args){
			Phone phone=new Phone();
			phone.add();
			phone.show();
	}
	
}
class  Phone{

	private StringBuffer communicationRecords;
	private int age;
	public Phone(){
		//this.communicationRecords=new StringBuffer();
	}
	public void add(){
		this.communicationRecords.append("½£º®¿Í");
	}
	public void show(){
		System.out.println(age+"ºÍ"+communicationRecords);
	}
	
	
}