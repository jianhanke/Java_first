public class Example08{
	public static void main(String[] args){
		System.out.println("1.���-------");
		add();
		System.out.println("2.ɾ��----------");
		remove();
		System.out.println("3.�޸�--------------");
		alter();
		System.out.println("4.Stinrg�����----------");
		Example08 example=new Example08();
		example.ceshi();
	}
	public static void add(){
		StringBuffer sb=new StringBuffer();
		sb.append("abcdefg");
		System.out.println("append��ӵĽ��"+sb);
		sb.insert(2,"123");
		System.out.println("insert��ӽ��"+sb);
		System.out.println("��ת"+sb.reverse());
		System.out.println("����Ϊ"+sb.length());
		
			
		// System.out.println("��д:"+sb.toLowerCase());
		// System.out.println("Сд:"+sb.toUpperCase());  
		//sbΪsbΪStringBuffer���ͣ�����дString��һЩ����.
	}
	public static void remove(){
		StringBuffer sb=new StringBuffer("abcdefg");
		sb.delete(1,5);
		System.out.println("ɾ��ָ��λ�õĽ��"+sb);
		sb.deleteCharAt(2);
		System.out.println("ɾ��ָ��λ�õĽ��"+sb);
		sb.delete(0,sb.length());
		System.out.println("��ջ��������"+sb);
	}
	public static void alter(){
		StringBuffer sb=new StringBuffer("abcdef");
		sb.setCharAt(1,'p');
		System.out.println("�޸��ƶ�λ���ַ����:"+sb);
		sb.replace(1,3,"qq");
		System.out.println("�滻�ƶ�λ���ַ������"+sb);
		System.out.println("�ַ���ת�Ľ��"+sb.reverse());
				System.out.println(sb.toString());

	}
	public void ceshi(){
		String sb=new String ("adfaffdfafafg");
		System.out.println("��д:"+sb.toUpperCase());
		System.out.println("Сд:"+sb.toLowerCase());  
			
		System.out.println(sb.setCharAt(2,"qq"));
	}
}