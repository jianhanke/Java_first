import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ceshi {
	
	public static void main(String[] args) {
		Gui gui=new Gui();
		gui.creat();
	}
	
}
class Gui extends JFrame{
	JTextField chat_jtf=new JTextField(20);
	
	
	public void creat() {
		setLayout(new BorderLayout());
		setSize(500,500);
		setLocationRelativeTo(null);
		setTitle("����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	JPanel chat_jp=new JPanel();
	chat_jp.add(chat_jtf);
	this.add(chat_jp);

	}
}