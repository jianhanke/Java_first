class Player{
	public void play(int index)throws NoThisSongException{
		if(index>10){
			throw new NoThisSongException("你播放的歌曲不存在");
		}
		System.out.println("正在播放歌曲");
	}
	
}
