package ceshi;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ziqi {
	public static void main(String[] args) {
		
		int[][] chessBoard=new int [11][11];
		//���ڻ�������
		MyJFrame jf=new MyJFrame(); 
		jf.setTitle("JFrame");
		jf.setLayout(null);
		jf.setSize(1300,1000);   //��� 9px;
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		JPanel jp1=new JPanel();
		JButton jbut1=new JButton("����2");
		jbut1.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("��������");
			}
		});
		jp1.add(jbut1);
		jf.add(jp1);

		jf.addMouseListener(new MouseAdapter() {
			int piece=1;
			
			public void checkWin() {
				try {
				for (int i=0;i<=10;i++) {
					for (int j=0;j<=10;j++) {
						if( (chessBoard[i][j]==1
								&&chessBoard[i][j-1]==1
								&&chessBoard[i][j-2]==1
								&&chessBoard[i][j+1]==1
								&&chessBoard[i][j+2]==1) ||
								(chessBoard[i][j]==1
								&&chessBoard[i+1][j]==1
								&&chessBoard[i+2][j]==1
								&&chessBoard[i-1][j]==1
								&&chessBoard[i-2][j]==1) ||
								(chessBoard[i][j]==1
								&&chessBoard[i+1][j-1]==1
								&&chessBoard[i+2][j-2]==1
								&&chessBoard[i-1][j+1]==1
								&&chessBoard[i-2][j+2]==1 ) ||
								(chessBoard[i][j]==1
								&&chessBoard[i-1][j-1]==1
								&&chessBoard[i-2][j-2]==1
								&&chessBoard[i+1][j+1]==1
								&&chessBoard[i+2][j+2]==1 )
								) {
							System.out.println("�����ʤ");
						}else if( (chessBoard[i][j]==2
								&&chessBoard[i][j+1]==2
								&&chessBoard[i][j+2]==2
								&&chessBoard[i][j-1]==2
								&&chessBoard[i][j-2]==2) ||
								(chessBoard[i][j]==2
								&&chessBoard[i+1][j]==2
								&&chessBoard[i+2][j]==2
								&&chessBoard[i-1][j]==2
								&&chessBoard[i-2][j]==2) ||
								(chessBoard[i][j]==2
								&&chessBoard[i+1][j-1]==2
								&&chessBoard[i+2][j-2]==2
								&&chessBoard[i-1][j+1]==2
								&&chessBoard[i-2][j+2]==2 ) ||
								(chessBoard[i][j]==2
								&&chessBoard[i-1][j-1]==2
								&&chessBoard[i-2][j-2]==2
								&&chessBoard[i+1][j+1]==2
								&&chessBoard[i+2][j+2]==2 )
								) {
							System.out.println("�����ʤ");
						}
					}
				}
				}catch(Exception e) {
					
				}
			}
			public void mouseClicked(MouseEvent e) {
				int x=0,y=0;
				int clickX=e.getX();
				int clickY=e.getY();
				
				int ceshiX=(clickX-209)%80;
				int ceshiY=(clickY-59)%80;
				if(ceshiX<40) {
					x=clickX-ceshiX-40  ;
				}else if(ceshiX>=40) {
					x=clickX+(80-ceshiX)-40;
				}
				if(ceshiY<40) {
					y=clickY-ceshiY-40;
				}else if(ceshiY>=40) {
					y=clickY+(80-ceshiY)-40;
				}
				
				Graphics g=jf.getGraphics();
				if((clickX>=200 &clickX<=1000)&&(clickY>=50&&clickY<=850)) {  //�����ٴη�Χ�������壬��������������
				int listX=(x+40-200)/80;
				int listY=(y+40-50)/80;
				
				System.out.println(clickX+" " +clickY);
				System.out.println(x+" "+y);
				
				
				if( chessBoard[listX][listY]==0 ) {
					if (piece%2==1) {
				g.drawImage(new ImageIcon("./black.png").getImage(), x, y,80,80, null);
				piece+=1;
				chessBoard[listX][listY]=1;    //������1
				checkWin();
				}else {
					//����������
					
				g.drawImage(new ImageIcon("./white.png").getImage(), x, y,80,80, null);
				g.drawImage(new ImageIcon("./white.png").getImage(), 200, 50,80,80, null);
				g.drawImage(new ImageIcon("./white.png").getImage(), 0, 0,80,80, null);

				chessBoard[listX][listY]=2;    //������2
				piece+=1;
				checkWin();
				}
				}

			}else {
				System.out.println("���Ѿ�Խ����");
			}
				
			}
		});
	}	
}

