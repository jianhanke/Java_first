package ceshi;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFrameListen implements MouseListener{
	public static  MyJFrame mj;
	static {
		
	}
	public void mouseClicked(java.awt.event.MouseEvent e) {
		int x=e.getX()-40;
		int y=e.getY()-40;
		
		Graphics g=mj.getGraphics();
		g.drawImage(new ImageIcon("./black.png").getImage(), x, y,80,80, null);
		 
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}




	
	
}
