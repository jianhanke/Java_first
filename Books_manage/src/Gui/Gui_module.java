package Gui;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Gui_module extends JFrame {
	
	
		public Gui_module() {
			this.setTitle("图书管理系统");
			this.setSize(800,800);
			this.setLocationRelativeTo(null); 
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLayout(new FlowLayout(FlowLayout.CENTER,300,50) );
			this.setVisible(true);
		
			
		}
		
	
}
