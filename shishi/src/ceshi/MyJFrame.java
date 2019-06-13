package ceshi;

import java.awt.*;
import javax.swing.*;

class MyJFrame extends JFrame{
	int chessHeight=11;
	int chessWeight=11;
	int [][] chess=new int[chessHeight][chessHeight]; 
	JPanel jp1=new JPanel();
	JButton jbut1=new JButton("测试");
	
	
	
	public void paint(Graphics g) {
		int wt=50;
		int boxWeight=80;
		int lineHeight=800;
		int startx=200;
		int starty=50;
		for (int i=0;i<chessHeight;i++) {        
			g.drawLine(startx,starty+(i*boxWeight),startx+lineHeight,starty+(i*boxWeight));		//横线，水平线
			g.drawLine(startx+(i*boxWeight), starty, startx+(i*boxWeight), starty+lineHeight);      //竖线,垂直线
		}
	
		jp1.add(jbut1);
		this.add(jp1);
	}
	
	
}
