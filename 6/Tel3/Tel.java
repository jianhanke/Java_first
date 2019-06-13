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
			System.out.println("����:"+recordFile[0]);
			System.out.println("����:"+recordFile[3]);
			System.out.println("ͨ����ʼʱ��:"+DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM).format(Long.parseLong(recordFile[1])));
			System.out.println("ͨ������ʱ��:"+DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM).format(Long.parseLong(recordFile[2])));
			System.out.println("�Ʒ�:"+accountFee(Long.parseLong(recordFile[1]),Long.parseLong(recordFile[2]))+"Ԫ.");
		}
	}
	private String accountFee(long timeStart,long timeEnd){
		double feePerMinute=0.2;
		int minutes=Math.round((timeEnd-timeStart)/60000);
		double feeTotal=feePerMinute*minutes;
		return  String.format("%.4f",feeTotal);
	}
 }