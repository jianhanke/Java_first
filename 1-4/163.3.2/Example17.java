
class NoThisSoundException extends Exception {
	public NoThisSoundException(){
		super();
	}
	public NoThisSoundException(String name){
		super(name);
	}	
}



class Player{
	public void play(int index)throws NoThisSoundException{
		if(index>10){
			throw new NoThisSoundException("�㲥�ŵĸ���������"+"174804054 ����ʤ");
		}
		System.out.println("���ڲ��Ÿ���");
	}
}


class Example17{
	public static void  main (String[] args){
	Player player=new Player();
	try {
		player.play(13);
	}catch(NoThisSoundException e){
		System.out.println("�쳣Ϊ��"+e.getMessage());
	}
	}
}
