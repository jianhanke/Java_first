package Ui;

import java.util.Scanner;

public class Main {
		private static Scanner in;

		public static void main(String[] args) {
			while(true){
			System.out.println("1--��½,��¼�ɹ��Զ�����ϵͳ");
			System.out.println("2--ע��,ע��ɹ��Զ�����ϵͳ");
			System.out.println("3--�Ƴ�");
			in = new Scanner(System.in);
			String str=in.nextLine();
			if(str.equals("1")) {
				Login.login();
			}
			if(str.equals("2")) {
				Enroll.enroll();
			}
			if(str.equals("3")) {
				System.out.println("���Ѿ����Ƴ�ϵͳ");
			}
			
			}
		}
}
