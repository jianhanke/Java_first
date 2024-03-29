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
		//登录
			public void login() throws Exception{
			DButils dbutil=DButils.getInstance();
			in = new Scanner(System.in);
			while(true){	
			System.out.println("请输入卡号:");
			String cardId=in.nextLine();
			System.out.println("请输入密码:");
			String cardPwd =in.nextLine();
			user=dbutil.getUser(cardId);
			
			if(dbutil.getUsers().containsKey(cardId)&& user.getcardPwd().equals(cardPwd) ){//从整个User中查看是否含有cardId,在从user中查看密码是否相同
				System.out.println("登录成功,中国银行欢迎您:"+user.getuserName());
				Bank.operate();	
			}else{
				System.out.println("登录错误");
				System.out.println(dbutil.getUser("10001"));
			 	}
			}
		}
			//取款操作
	public static void operate() throws Exception{
		Bank b=new Bank();
	while(true){
	System.out.println("请输入操作选项");
	System.out.println("1--存款");
	System.out.println("2--取款");
	System.out.println("3--查询余额");
	System.out.println("4--注册并保存");
	System.out.println("0--退出自动存取款机");
	 in2 = new Scanner(System.in);
	String s=in2.nextLine();
	//选择 1 ，存款
	if(s.equals("1")){
	System.out.println("请输入存款金额");
	int  money=Integer.parseInt(in2.nextLine());
		Bank.income(money);
		System.out.println("存款成功,已经存入"+money+"元");	
}
	// 选择 2， 取款
	if(s.equals("2")==true){
		System.out.println("请输入取款金额");
		int  money=Integer.parseInt(in2.nextLine());
		Bank.takeout(money);
		System.out.println("取款成功,已经取出"+money+"元");
}
	// 选择 3， 查询余额
	else if(s.equals("3")==true){
			Bank.show();
}
		//选择 4， 退出自动存取款机
	else if(s.equals("0")==true){
		System.out.println("账户退出成功");
			break;
		}
	else if(s.equals("4")==true) {
		Bank.enroll();
		b.save();   //注册后，直接存盘
	}
		else {
			System.out.println("命令有误,请重新输入命令");
		}
}
	
}
//存款方法
	public static void income(int money){
		int account=user.getaccount();
		account+=money;
		user.setaccount(account);
}
//取款方法
	public static void takeout(int money){
	int account=user.getaccount();
	account-=money;
	user.setaccount(account);
}
//显示余额
		public static void show(){
		System.out.println("你的余额为:"+user.getaccount());
		}

//注册方法
		public static void enroll() {
			User u=new User();
			scanner = new Scanner(System.in);
			System.out.println("请输入卡号");
			u.setcardId(scanner.nextLine());
			System.out.println("请输入密码");
			u.setcardPwd(scanner.nextLine());
			System.out.println("请输如用户名");
			u.setuserName(scanner.nextLine());
			System.out.println("请输入手机号");
			u.setcall(scanner.nextLine());
			//默认余额为0
			u.setaccount(0);
			DButils dbutil=DButils.getInstance();
			dbutil.addUser(u);
		}
		public void save() throws Exception {
			DButils dbutil=DButils.getInstance();
			dbutil.update();
		}
}
