import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Example14 {
	public static void main(String[] args) {
		final Frame frame=new Frame("ÑéÖ¤Âë");
		MyPanel panel=new MyPanel();
		frame.add(panel);
		frame.setSize(200, 100);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
}
class MyPanel extends Panel{
	public void paint(Graphics g) {
		int width=160;
		int height=40;
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, width, height);
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, width-1, height-1);
		Random r=new Random();
		for (int i=0;i<50;i++) {
			int x=r.nextInt(width);
			int y=r.nextInt(height);
			g.drawOval(x, y, width-1, height-1);
		}
		g.setFont(new Font("ºÚÌå",Font.BOLD,30));
		g.setColor(Color.BLUE);
		char[] chars= ("0123456789qwertyupfsjajcxvzljsadjf").toCharArray();
		StringBuilder sb=new StringBuilder();
		for (int i=0;i<4;i++) {
			int pos=r.nextInt(chars.length);
			char c=chars[pos];
			sb.append(c+"");
		}
		g.drawString(sb.toString(), 20, 30);
	}
}
