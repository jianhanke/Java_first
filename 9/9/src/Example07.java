import java.awt.*;
import java.awt.event.*;

public class Example07 {
	public static void main(String[] args) {
	final Frame f=new Frame("�ҵĴ���");
	
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
		System.out.print("���������Ϊ:"+s+",");
		System.out.println("��ӦkeyCodeΪ:"+keyCode);
		}
	});
	
	Button but1=new Button("��һ����ť");
	Button but2=new Button("�ڶ�����ť");
	Button but3=new Button("��������ť");
	Button but4=new Button("���ĸ���ť");
	Button but5=new Button("�������ť");
	f.add(but1);
	f.add(but2);
	f.add(but3);
	f.add(but4);
	f.add(but5);
	
	
	
	}
}