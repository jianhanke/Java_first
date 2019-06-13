import java.util.*;
import java.text.DateFormat;
class Tel{
	private String phoneNumber;
	private String callTo;
	private StringBuffer communicationRecords;
	
	public Tel(){
		this.communicationRecords=new StringBuffer();
	}
	void generateCommunicateRecord(){
		
		long timeStart=System.currentTimeMillis()-new Random().nextInt(36000000);
		long timeEnd=System.currentTimeMillis()+60000+new Random().nextInt(60000);
		phoneNumber=getCallToPhoneNumber();
		callTo=getCallToPhoneNumber();
				//��Ϣ���浽communicationRecords����
		this.communicationRecords.append(
		this.phoneNumber+","
		+timeStart+","
		+timeEnd +","
		+this.callTo+";"
		);	
		
	}
	private String getCallToPhoneNumber(){
		return "13"
		+String.valueOf(new Random().nextInt(10))
		+String.valueOf(new Random().nextInt(10))
		+String.valueOf(new Random().nextInt(10))
		+String.valueOf(new Random().nextInt(10))
		+"851"
		+String.valueOf(new Random().nextInt(10))
		+String.valueOf(new Random().nextInt(10));
	}
	private String accountFee(long timeStart,long timeEnd){
		double feePerMinute=0.2;
		int minutes=Math.round((timeEnd-timeStart)/60000);
		double feeTotal=feePerMinute*minutes;
		return  String.format("%.4f",feeTotal);
	}
	void printDetails(){
		String str=communicationRecords.toString();
		String[] recordArray=str.split(",");
		for(int i=0;i<recordArray.length;i++){
			String[] recordFile=recordArray[i].split(",");
			System.out.println("����:"+recordFile[0]);
			System.out.println("����:"+recordFile[3]);
			System.out.println("ͨ����ʼʱ��:"+DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM).format(Long.parseLong(recordFile[1])));
			System.out.println("ͨ������ʱ��:"+DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM).format(Long.parseLong(recordFile[2])));
			System.out.println("�Ʒ�:"+accountFee(Long.parseLong(recordFile[1]),Long.parseLong(recordFile[2]))+"Ԫ.");
		}
	}
 }