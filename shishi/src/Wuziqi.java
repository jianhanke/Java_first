import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Wuziqi {
	public static void main(String[] args) {
		JFrame j =new JFrame();
		j.setTitle("������");
		j.setSize(800,800);
		j.setLocationRelativeTo(null);
		j.setDefaultCloseOperation(3);		
		j.setLayout(new BorderLayout());//���ö�������JFrameΪ��ܲ���
		Qipan qipan=new Qipan();
		j.add(qipan);
		j.setLayout(new BorderLayout());
	}
}
class Qipan extends JPanel implements GoBangconfig{
	
	public void paint(Graphics g) {
		super.paint(g);//�����׿�
		//��ӱ���ͼƬ
		
		
		//�ػ������
		g.setColor(Color.black);
		for(int i=0;i<10;i++) {
			g.drawLine(X, Y+SIZE*i, X+SIZE*(COLUMN-1), Y+SIZE*i);
		}
		for(int j=0;j<COLUMN;j++) {
			g.drawLine(X+SIZE*j, Y, X+SIZE*j, Y+SIZE*(ROW-1));
		}
		
	}
}
