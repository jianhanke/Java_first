class NoThisSongException extends Exception {
	public NoThisSongException(){
		super();
	}
	public NoThisSongException(String name){
		super(name);
	}	
}
