import java.awt.*;

public class Example10{
	public static void main(String[] args) {
		final Frame f=new Frame("GridLayout");
		f.setLayout(new GridLayout(3,3,30,10));
		f.setSize(300,300);
		f.setLocation(300, 500);
		
		for (int i=1;i<=9;i++) {
			Button btn=new Button("button"+i);
			f.add(btn);
		}
		f.setVisible(true);
	}
}