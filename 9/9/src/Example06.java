import java.awt.*;
import java.awt.event.*;

public class Example06 {
	public static void main(String[] args) {
	final Frame f=new Frame("�ҵĴ���");
	f.setLayout(new FlowLayout());
	f.setSize(400,300);
	f.setLocation(600,500);
	f.setVisible(true);
	Button but=new Button("Button");
	f.add(but);
	but.addMouseListener(new MouseListener() {
		public void mouseReleased(MouseEvent e) {
			System.out.println("mouseReleased-���ſ��¼�");
		}
		public void mousePressed(MouseEvent e) {
			System.out.println("mousePressed-��갴���¼�");
		}
		public void mouseExited(MouseEvent e) {
			System.out.println("mouseExited-����Ƴ���ť�¼�");
		}
		public void mouseEntered(MouseEvent e) {
			System.out.println("mouseEntered-�����밴ť�����¼�");
		}
		public void mouseClicked(MouseEvent e) {
			if(e.getButton()==e.BUTTON1) {
				System.out.println("�������¼�");
			}
			if(e.getButton()==e.BUTTON3) {
				System.out.println("����һ��¼�");
			}
			if(e.getButton()==e.BUTTON2) {
				System.out.println("����е���¼�");
			}
		}
	});
	}
}
	