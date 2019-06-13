interface PCI{
	void start();
	void stop();
}
class NetWorkCard implements PCI{
	public void start(){
		System.out.println("Send....");
	}
	public void stop(){
		System.out.println("NetWork stop");
	}
}
class SoundCard implements PCI{
	public void start(){
		System.out.println("Du du");
	}
	public void stop(){
		System.out.println("Sound stop");
	}
}
class MainBoard{
	public void usePCICard(PCI p){
		p.start();
		p.stop();
	}
}
class Assembler{
	public static void main(String[] args){
		MainBoard mb=new MainBoard();
		NetWorkCard nc=new NetWorkCard();
		SoundCard sc=new SoundCard();
		mb.usePCICard(nc);
		mb.usePCICard(sc);
	}
}
