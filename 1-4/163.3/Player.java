class Player{
	public void play(int index)throws NoThisSongException{
		if(index>10){
			throw new NoThisSongException("�㲥�ŵĸ���������");
		}
		System.out.println("���ڲ��Ÿ���");
	}
	
}
