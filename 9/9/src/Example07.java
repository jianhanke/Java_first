import java.awt.*;
import java.awt.event.*;

public class Example07 {
	public static void main(String[] args) {
	final Frame f=new Frame("我的窗体");
	
	f.setLayout(new FlowLayout(FlowLayout.CENTER,300,20) );
	f.setSize(600,600);
	f.setLocation(600,260);
	TextField tf=new TextField(30);
	f.add(tf);
	f.setVisible(true);
	tf.addKeyListener(new KeyAdapter() {
		public void keyPressed(KeyEvent e) {
		int keyCode=e.getKeyCode();
		String s=KeyEvent.getKeyText(keyCode);
		System.out.print("输入的内容为:"+s+",");
		System.out.println("对应keyCode为:"+keyCode);
		}
	});
	
	Button but1=new Button("第一个按钮");
	Button but2=new Button("第二个按钮");
	Button but3=new Button("第三个按钮");
	Button but4=new Button("第四个按钮");
	Button but5=new Button("第五个按钮");
	f.add(but1);
	f.add(but2);
	f.add(but3);
	f.add(but4);
	f.add(but5);
	
	
	
	}
}