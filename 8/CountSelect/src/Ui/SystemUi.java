package Ui;

import java.util.Scanner;

public class SystemUi {
	public static void Systemui(String id) {
		System.out.println("��ӭ��������ϵͳ����");
		System.out.println("1---ѡ��---");
		System.out.println("2---�˿�---");
		System.out.println("3---�޸�����---");
		System.out.println("4---�޸ĸ�����Ϣ----");
		System.out.println("5---ע���˺�----");
		System.out.println("0---�Ƴ�ϵͳ---");
	     Scanner in=new Scanner(System.in);
	     while(true) {
	    	 System.out.println("������ѡ��");
	    	 String str=in.nextLine();
	    	 if(str.equals("1")) {
	    		 Select.Select( id);
	    	 }else if(str.equals("2")) {
	    		 
	    	 }else if(str.equals("3")) {
	    		 
	    	 }else if(str.equals("4")) {
	    		 
	    	 }else if(str.equals("5")) {
	    		 
	    	 }else if(str.equals("0")) {
	    		 System.out.println("ϵͳ�ɹ�");
	    		 break;
	    	 }else {
	    		 System.out.println("ϵͳ�ɹ�");
	    	 }
	    	 
	     }
		
	}
}
