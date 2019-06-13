package bank;

import java.util.*;

public class Bank{
	int account;
	private static User user;
	private static Scanner in2;
	private Scanner in;
	private static Scanner scanner;
	public static void main(String[] args) throws Exception {
		Bank b=new Bank();
		b.login();
		}
		//��¼
			public void login() throws Exception{
			DButils dbutil=DButils.getInstance();
			in = new Scanner(System.in);
			while(true){	
			System.out.println("�����뿨��:");
			String cardId=in.nextLine();
			System.out.println("����������:");
			String cardPwd =in.nextLine();
			user=dbutil.getUser(cardId);
			
			if(dbutil.getUsers().containsKey(cardId)&& user.getcardPwd().equals(cardPwd) ){//������User�в鿴�Ƿ���cardId,�ڴ�user�в鿴�����Ƿ���ͬ
				System.out.println("��¼�ɹ�,�й����л�ӭ��:"+user.getuserName());
				Bank.operate();	
			}else{
				System.out.println("��¼����");
				System.out.println(dbutil.getUser("10001"));
			 	}
			}
		}
			//ȡ�����
	public static void operate() throws Exception{
		Bank b=new Bank();
	while(true){
	System.out.println("���������ѡ��");
	System.out.println("1--���");
	System.out.println("2--ȡ��");
	System.out.println("3--��ѯ���");
	System.out.println("4--ע�Ტ����");
	System.out.println("0--�˳��Զ���ȡ���");
	 in2 = new Scanner(System.in);
	String s=in2.nextLine();
	//ѡ�� 1 �����
	if(s.equals("1")){
	System.out.println("����������");
	int  money=Integer.parseInt(in2.nextLine());
		Bank.income(money);
		System.out.println("���ɹ�,�Ѿ�����"+money+"Ԫ");	
}
	// ѡ�� 2�� ȡ��
	if(s.equals("2")==true){
		System.out.println("������ȡ����");
		int  money=Integer.parseInt(in2.nextLine());
		Bank.takeout(money);
		System.out.println("ȡ��ɹ�,�Ѿ�ȡ��"+money+"Ԫ");
}
	// ѡ�� 3�� ��ѯ���
	else if(s.equals("3")==true){
			Bank.show();
}
		//ѡ�� 4�� �˳��Զ���ȡ���
	else if(s.equals("0")==true){
		System.out.println("�˻��˳��ɹ�");
			break;
		}
	else if(s.equals("4")==true) {
		Bank.enroll();
		b.save();   //ע���ֱ�Ӵ���
	}
		else {
			System.out.println("��������,��������������");
		}
}
	
}
//����
	public static void income(int money){
		int account=user.getaccount();
		account+=money;
		user.setaccount(account);
}
//ȡ���
	public static void takeout(int money){
	int account=user.getaccount();
	account-=money;
	user.setaccount(account);
}
//��ʾ���
		public static void show(){
		System.out.println("������Ϊ:"+user.getaccount());
		}

//ע�᷽��
		public static void enroll() {
			User u=new User();
			scanner = new Scanner(System.in);
			System.out.println("�����뿨��");
			u.setcardId(scanner.nextLine());
			System.out.println("����������");
			u.setcardPwd(scanner.nextLine());
			System.out.println("�������û���");
			u.setuserName(scanner.nextLine());
			System.out.println("�������ֻ���");
			u.setcall(scanner.nextLine());
			//Ĭ�����Ϊ0
			u.setaccount(0);
			DButils dbutil=DButils.getInstance();
			dbutil.addUser(u);
		}
		public void save() throws Exception {
			DButils dbutil=DButils.getInstance();
			dbutil.update();
		}
}