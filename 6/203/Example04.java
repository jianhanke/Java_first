public class Example04{
	public static void main(String[] args){
		String s="itcast";
		System.out.println("��it�滻��cn.it�Ľ��:"+s.replace("it","cn.it"));
		String s1=" i t c a s t ";
		System.out.println("ȥ���ַ������˿ո��Ľ��:"+s1.trim());
		System.out.println("ȥ���ַ��������пո�Ľ��"+s1.replace(" ",""));
		String s2="   it is an dogs  ";
		System.out.println("�����ģ�"+s2);
		System.out.println("�����ո�Ľ��:"+s2.trim());
	}
}