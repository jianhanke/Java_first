import java.awt.*;
import java.awt.event.*;

public class Example05 {
	public static void main(String[] args) {
	Frame f=new Frame("�ҵĴ���");
	f.setSize(400,300);
	f.setLocation(600,500);
	f.setVisible(true);
	
	f.addWindowListener(new WindowListener() {
		public void windowOpened(WindowEvent e) {
			System.out.println("windowOpened-----������¼�");
		}
		public void windowIconified(WindowEvent e) {
			System.out.println("windowOpened-----����ͼ�껯�¼�");
		}
		public void windowDeiconified(WindowEvent e) {
			System.out.println("windowDeiconified-----����ȡ��ͼ�껯�¼�");
		}
		public void windowDeactivated(WindowEvent e) {
			System.out.println("windowDeactivated-----����ͣ���¼�");
		}
		public void windowClosing(WindowEvent e) {
			System.out.println("windowClosing-----�������ڹر�");
			((Window) e.getComponent()).dispose();
		}
		public void windowClosed(WindowEvent e) {
			System.out.println("windowActivated-----����ر��¼�");
		}
		public void windowActivated (WindowEvent e) {
			System.out.println("windowActivated----���弤���¼�");
		}
		
		
	});

	}
	
}