package ceshi;

import java.awt.*;
import javax.swing.*;

class MyJFrame extends JFrame{
	int chessHeight=11;
	int chessWeight=11;
	int [][] chess=new int[chessHeight][chessHeight]; 
	JPanel jp1=new JPanel();
	JButton jbut1=new JButton("����");
	
	
	
	public void paint(Graphics g) {
		int wt=50;
		int boxWeight=80;
		int lineHeight=800;
		int startx=200;
		int starty=50;
		for (int i=0;i<chessHeight;i++) {        
			g.drawLine(startx,starty+(i*boxWeight),startx+lineHeight,starty+(i*boxWeight));		//���ߣ�ˮƽ��
			g.drawLine(startx+(i*boxWeight), starty, startx+(i*boxWeight), starty+lineHeight);      //����,��ֱ��
		}
	
		jp1.add(jbut1);
		this.add(jp1);
	}
	
	
}
