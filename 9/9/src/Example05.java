import java.awt.*;
import java.awt.event.*;

public class Example05 {
	public static void main(String[] args) {
	Frame f=new Frame("我的窗体");
	f.setSize(400,300);
	f.setLocation(600,500);
	f.setVisible(true);
	
	f.addWindowListener(new WindowListener() {
		public void windowOpened(WindowEvent e) {
			System.out.println("windowOpened-----窗体打开事件");
		}
		public void windowIconified(WindowEvent e) {
			System.out.println("windowOpened-----窗体图标化事件");
		}
		public void windowDeiconified(WindowEvent e) {
			System.out.println("windowDeiconified-----窗体取消图标化事件");
		}
		public void windowDeactivated(WindowEvent e) {
			System.out.println("windowDeactivated-----窗口停用事件");
		}
		public void windowClosing(WindowEvent e) {
			System.out.println("windowClosing-----窗体正在关闭");
			((Window) e.getComponent()).dispose();
		}
		public void windowClosed(WindowEvent e) {
			System.out.println("windowActivated-----窗体关闭事件");
		}
		public void windowActivated (WindowEvent e) {
			System.out.println("windowActivated----窗体激活事件");
		}
		
		
	});

	}
	
}