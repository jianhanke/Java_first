package Ui;

import java.util.Scanner;

import DateVisit.VisitInofrmation;

public class SystemUi {
	private static Scanner in;

	public static void Systemui(String id) throws Exception {
		System.out.println("欢迎来到个人系统界面");
		System.out.println("1---选课---");
		System.out.println("2---退课---");
		System.out.println("3---修改密码---");
		System.out.println("4---修改个人信息----");
		System.out.println("5---注销账号----");
		System.out.println("6---查看选课结果----");
		System.out.println("0---推出系统---");
	     in = new Scanner(System.in);
	     while(true) {
	    	 System.out.println("请输入选项");
	    	 String str=in.nextLine();
	    	 if(str.equals("1")) {
	    		 Select.select( id);
	    	 }else if(str.equals("2")) {
	    		 Modify.modify(id);
	    	 }else if(str.equals("3")) {
	    		 Modify.pwd(id);
	    	 }else if(str.equals("4")) {
	    		  Modify.information(id);
	    	 }else if(str.equals("5")) {
	    		 Cancel.cancel(id);
	    	 }else if(str.equals("0")) {
	    		 System.out.println("推出系统成功");
	    		 break;
	    	 }else if(str.equals("6")) {
	    		 VisitInofrmation.show(id);
	    	 }else {
	    		 System.out.println("推出系统成功");
	    	 }
	    	 
	     }
	}
}
