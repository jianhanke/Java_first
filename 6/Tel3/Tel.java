import java.util.*;
import java.text.DateFormat;
class Tel{
	private String phoneNumber;
	private String callTo;
	private ArrayList communicationRecords;
	
	public Tel(String phoneNumber){
		this.phoneNumber=phoneNumber;
		
	}
	void generateCommunicateRecord(){
		int recordNum=new Random().nextInt(10);
		for(int i=0;i<=recordNum;i++){
		long timeStart=System.currentTimeMillis()-new Random().nextInt(36000000);
		long timeEnd=System.currentTimeMillis()+60000+new Random().nextInt(60000);

		callTo=getCallToPhoneNumber();
		this.communicationRecords.add(
		this.phoneNumber+","
		+timeStart+","
		+timeEnd +","
		+this.callTo+";"
		);	
		}
	}
	private String getCallToPhoneNumber(){
		return "1380372"
		+String.valueOf(new Random().nextInt(10))
		+String.valueOf(new Random().nextInt(10))
		+String.valueOf(new Random().nextInt(10))
		+String.valueOf(new Random().nextInt(10));
	}
	void printDetails(){
		
		int count=this.communicationRecords.size();
		for(int i=0;i<count-1;i++){
			String[] recordFile=((String)this.communicationRecords.get(i)).split(";");
			System.out.println("主叫:"+recordFile[0]);
			System.out.println("被叫:"+recordFile[3]);
			System.out.println("通话开始时间:"+DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM).format(Long.parseLong(recordFile[1])));
			System.out.println("通话结束时间:"+DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM).format(Long.parseLong(recordFile[2])));
			System.out.println("计费:"+accountFee(Long.parseLong(recordFile[1]),Long.parseLong(recordFile[2]))+"元.");
		}
	}
	private String accountFee(long timeStart,long timeEnd){
		double feePerMinute=0.2;
		int minutes=Math.round((timeEnd-timeStart)/60000);
		double feeTotal=feePerMinute*minutes;
		return  String.format("%.4f",feeTotal);
	}
 }