import java.awt.*;
public class Example09 {
	public static void main(String[] args) {
		final Frame f=new Frame("BorderLayout");
		f.setLayout(new BorderLayout());
		f.setSize(300,300);
		f.setLocation(300, 500);
		f.setVisible(true);
		Button but1=new Button("��");
		Button but2=new Button("��");
		Button but3=new Button("��");
		Button but4=new Button("��");
		Button but5=new Button("��");
		f.add(but1,BorderLayout.EAST);
		f.add(but2,BorderLayout.WEST);
		f.add(but3,BorderLayout.SOUTH);
		f.add(but4,BorderLayout.NORTH);
		f.add(but5,BorderLayout.CENTER);
	}
}
