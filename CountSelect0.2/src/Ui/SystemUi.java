package Ui;

import java.util.Scanner;

import DateVisit.VisitInofrmation;

public class SystemUi {
	public static void Systemui(String id) {
		System.out.println("��ӭ��������ϵͳ����");
		System.out.println("1---ѡ��---");
		System.out.println("2---�˿�---");
		System.out.println("3---�޸�����---");
		System.out.println("4---�޸ĸ�����Ϣ----");
		System.out.println("5---ע���˺�----");
		System.out.println("6---�鿴ѡ�ν��----");
		System.out.println("0---�Ƴ�ϵͳ---");
	     Scanner in=new Scanner(System.in);
	     while(true) {
	    	 System.out.println("������ѡ��");
	    	 String str=in.nextLine();
	    	 if(str.equals("1")) {
	    		 Select.Select( id);
	    	 }else if(str.equals("2")) {
	    		 Modify.modify(id);
	    	 }else if(str.equals("3")) {
	    		 Modify.pwd(id);
	    	 }else if(str.equals("4")) {
	    		  Modify.information(id);
	    	 }else if(str.equals("5")) {
	    		 Cancel.cancel(id);
	    	 }else if(str.equals("0")) {
	    		 System.out.println("�Ƴ�ϵͳ�ɹ�");
	    		 break;
	    	 }else if(str.equals("6")) {
	    		 VisitInofrmation.show(id);
	    	 }else {
	    		 System.out.println("�Ƴ�ϵͳ�ɹ�");
	    	 }
	    	 
	     }
		
	}
}
