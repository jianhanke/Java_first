package number;

import java.util.Random;
import java.util.Scanner;

public class number {
	
	public void num() {
		int xt_num=new Random().nextInt(1000);
		
		
		System.out.print("����������");  
		System.out.println(xt_num);
		
		int cnt=10;
		Scanner  in=new Scanner(System.in);
		while(true) {
			cnt--;
			String str=in.nextLine();
			int yh_num=Integer.parseInt(str);
			if(yh_num >xt_num ) {
				System.out.println("���ֹ���,�㻹��"+cnt+"����");
			}else  if(yh_num <xt_num ) {
					System.out.println("���ֹ�С,�㻹��"+cnt+"����");
				}else {
					System.out.println("��ϲ��¶��ˣ�����"+(10-cnt)+"�λ���");
					break;
			}if(cnt<0) {
				break;
			}
			
		}
		
	}
	
}