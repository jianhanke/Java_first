public class Test03{
	public static void main (String[] args){
		try{
			int x=2/0;
			System.out.println(x);
		}catch(Exception e){
			System.out.println("�쳣Ϊ��"+e.getMessage());
		}finally{
			System.out.println("����finally�����");
		}
	}
}