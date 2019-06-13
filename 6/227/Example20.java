public class Example20{
	public static void main(String[] args){
		TelcomUser jian=new TelcomUser("jianke");
		System.out.println(jian.communicationRecords);
	}
}
class TelcomUser{
	String phoneNumber;
	 String callTo;
	 StringBuffer communicationRecords;
	
	public TelcomUser(String phoneNumber){
		this.phoneNumber=phoneNumber;
			
	}
}