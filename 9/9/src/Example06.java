import java.awt.*;
import java.awt.event.*;

public class Example06 {
	public static void main(String[] args) {
	final Frame f=new Frame("我的窗体");
	f.setLayout(new FlowLayout());
	f.setSize(400,300);
	f.setLocation(600,500);
	f.setVisible(true);
	Button but=new Button("Button");
	f.add(but);
	but.addMouseListener(new MouseListener() {
		public void mouseReleased(MouseEvent e) {
			System.out.println("mouseReleased-鼠标放开事件");
		}
		public void mousePressed(MouseEvent e) {
			System.out.println("mousePressed-鼠标按下事件");
		}
		public void mouseExited(MouseEvent e) {
			System.out.println("mouseExited-鼠标移出按钮事件");
		}
		public void mouseEntered(MouseEvent e) {
			System.out.println("mouseEntered-鼠标进入按钮区域事件");
		}
		public void mouseClicked(MouseEvent e) {
			if(e.getButton()==e.BUTTON1) {
				System.out.println("鼠标左击事件");
			}
			if(e.getButton()==e.BUTTON3) {
				System.out.println("鼠标右击事件");
			}
			if(e.getButton()==e.BUTTON2) {
				System.out.println("鼠标中点击事件");
			}
		}
	});
	}
}
	