import java.awt.*;
import java.awt.event.*;
import java.nio.FloatBuffer;
public class Example08 {
	public static void main(String[] args) {
		final Frame f=new Frame("Flowlayout");
		f.setLayout(new FlowLayout(FlowLayout.CENTER,20,30));
		f.setSize(400,300);
		f.setLocation(600,500);
		f.close
		Button but1=new Button("��1����ť");
		f.add(but1);
		
		but1.addActionListener(new ActionListener() {
			private int num=1;
			public void actionPerformed(ActionEvent e) {
				f.add(new Button("��"+ ++num +"����ť"));
				f.setVisible(true);
			}
		});
		f.setVisible(true);
		
	}
}
