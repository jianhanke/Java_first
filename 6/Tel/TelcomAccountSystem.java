public  class TelcomAccountSystem{
	public static void main(String[] args){
		TelcomUser telcomUser=new TelcomUser("13830013800");

		telcomUser.generateCommunicateRecord();
		
		telcomUser.printDetails();
	}
}