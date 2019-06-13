package Ui;

import java.util.Scanner;

public class SystemUi {
	public static void Systemui(String id) {
		System.out.println("欢迎来到个人系统界面");
		System.out.println("1---选课---");
		System.out.println("2---退课---");
		System.out.println("3---修改密码---");
		System.out.println("4---修改个人信息----");
		System.out.println("5---注销账号----");
		System.out.println("0---推出系统---");
	     Scanner in=new Scanner(System.in);
	     while(true) {
	    	 System.out.println("请输入选项");
	    	 String str=in.nextLine();
	    	 if(str.equals("1")) {
	    		 Select.Select( id);
	    	 }else if(str.equals("2")) {
	    		 
	    	 }else if(str.equals("3")) {
	    		 
	    	 }else if(str.equals("4")) {
	    		 
	    	 }else if(str.equals("5")) {
	    		 
	    	 }else if(str.equals("0")) {
	    		 System.out.println("系统成功");
	    		 break;
	    	 }else {
	    		 System.out.println("系统成功");
	    	 }
	    	 
	     }
		
	}
}
