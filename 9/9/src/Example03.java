import java.awt.*;
import java.awt.event.*;

public class Example03 {
	public static void main(String[] args) {
	Frame f=new Frame("�ҵĴ���");
	f.setSize(400,300);
	f.setLocation(300,500);
	f.setVisible(true);
	
	f.addWindowListener(new MyWindowListener()  );
	}
	
}
class MyWindowListener extends WindowAdapter{
	
	public void windowClosing(WindowEvent e) {
		Window window=(Window) e.getComponent();
		window.dispose();
	}
}