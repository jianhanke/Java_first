public class Example03{
	public static void main(String[] args){
		String str="abcd";
		System.out.println("���ַ���ת���Ľ��");
		char[] charArray=str.toCharArray();
		for(int i=0;i<charArray.length;i++){
			if(i!=charArray.length-1){
				System.out.println(charArray[i]+",");
			}else{
				System.out.println(charArray[i]);
			}
		}
		System.out.println("��intֵת��ΪString����֮��Ľ��:"+String.valueOf(12));
		System.out.println("���ַ���ת���ɴ�Сд֮��Ľ��"+str.toUpperCase());
	}
}