class Example01{
	public static void  main (String[] args){
		
	Player player=new Player();
	try {
		player.play(11);
	}catch(Exception e){
		System.out.println("�쳣Ϊ:"+e.getMessage());
	}
	
	}
	
}