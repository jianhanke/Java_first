public class Example06{
	public static void main(String[] args){
		String str="��,ë,��,��,��,-ƹ����";
		System.out.println("�ӵ�5�����ַ���ȡ��ĩβ�Ľ��"+str.substring(4));
		System.out.println("�ӵ�5���ַ���ȡ����6���ַ��Ľ��"+str.substring(4,6));
		System.out.println("�ָ����ַ��������е�Ԫ��������:");
		String[] strArray=str.split(",");
		
		for(int i=0;i<strArray.length;i++){
			if(i!=strArray.length-1){
				System.out.println(strArray[i]+"��");
			}else{
				System.out.println(strArray[i]);
			}
		}
	}
}