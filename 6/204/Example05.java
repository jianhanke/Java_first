public class Example05{
	public static void main (String[] args){
		String s1="String";
		String s2="Str";
		System.out.println("�ж��Ƿ����ַ���Str��ͷ"+s1.startsWith("Str"));
		System.out.println("�ж��Ƿ����ַ���ng��β"+s1.endsWith("nd"));
		System.out.println("�ж��Ƿ�����ַ���"+s1.contains("tri"));
		System.out.println("�ж��ַ����Ƿ�Ϊ��"+s1.isEmpty());
		System.out.println("�ж������ַ����Ƿ����"+s1.equals(s2));
		
		String str1=new String("abc");
		String str2=new String("abc");
		System.out.println("equals,,,"+s1.equals(s2));
		System.out.println("equals"+str1==str2);
	}
}