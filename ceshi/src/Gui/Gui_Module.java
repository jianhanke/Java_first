package Gui;

import javax.swing.JFrame;

public class Gui_Module extends JFrame implements Config{
	
	JFrame jf;
	
			
	public Gui_Module() {
		this.setTitle("图书管理系统");
		this.setSize(800,800);
		this.setLocation(550, 160);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}
