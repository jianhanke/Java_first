package Ui;

import java.util.Scanner;

public class Main {
		private static Scanner in;

		public static void main(String[] args) {
			while(true){
			System.out.println("1--登陆,登录成功自动进如系统");
			System.out.println("2--注册,注册成功自动计入系统");
			System.out.println("3--推出");
			in = new Scanner(System.in);
			String str=in.nextLine();
			if(str.equals("1")) {
				Login.login();
			}
			if(str.equals("2")) {
				Enroll.enroll();
			}
			if(str.equals("3")) {
				System.out.println("你已经出推出系统");
			}
			
			}
		}
}
