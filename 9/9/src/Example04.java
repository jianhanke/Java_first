import java.awt.*;
import java.awt.event.*;

public class Example04 {
	public static void main(String[] args) {
	Frame f=new Frame("ΞÒµΔ΄°Με");
	f.setSize(400,300);
	f.setLocation(600,500);
	f.setVisible(true);
	
	Button btn=new Button("Exit");
	f.add(btn);
	
	btn.addMouseListener( new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			System.exit(0);
		}
	});

	}
	
}
