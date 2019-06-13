import java.awt.*;
import java.awt.event.*;
public class Example01 {
	public static void main(String[] args) {
		Frame f=new Frame("ÎÒµÄ´°Ìå");
		f.setSize(400,300);
		f.setLocation(300,200);
		f.setVisible(true);
		MyWindowListener mw=new MyWindowListener();
		f.addWindowListener(mw);
	}
}
class MyWindowListener implements WindowListener{
	public void windowClosing(WindowEvent e){
		Window window=e.getWindow();
		window.setVisible(false);
		window.dispose();
	}

	
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
