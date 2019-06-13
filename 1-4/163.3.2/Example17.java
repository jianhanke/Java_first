
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
			throw new NoThisSoundException("你播放的歌曲不存在"+"174804054 赵培胜");
		}
		System.out.println("正在播放歌曲");
	}
}


class Example17{
	public static void  main (String[] args){
	Player player=new Player();
	try {
		player.play(13);
	}catch(NoThisSoundException e){
		System.out.println("异常为："+e.getMessage());
	}
	}
}
