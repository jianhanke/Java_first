package Gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gui_borrow extends Gui_module{
	
	public Gui_borrow() {
		this.setTitle("�û�����ϵͳ");
		this.setSize(1200,1000);
		this.setLocationRelativeTo(null); 
		//JLabel jl1=new JLabel(new ImageIcon("G:\\study_third\\book\\1844�꾭��ѧ��ѧ�ָ�.jpg"));
		
		Image img1=new ImageIcon("G:\\study_third\\book\\1844�꾭��ѧ��ѧ�ָ�.jpg").getImage();
		Image smallImage = img1.getScaledInstance(155,220,Image.SCALE_FAST);
		ImageIcon smallIcon = new ImageIcon(smallImage); 
		JLabel jl1=new JLabel(smallIcon);
		
		JLabel jl2=new JLabel(new ImageIcon("G:\\study_third\\book\\��ʮ�컷�ε���.jpg"));
		JLabel jl3=new JLabel(new ImageIcon("G:\\study_third\\book\\��ʮ�컷�ε���.jpg"));
		JLabel jl4=new JLabel(new ImageIcon("G:\\study_third\\book\\��ʮ�컷�ε���.jpg"));
		JLabel jl5=new JLabel(new ImageIcon("G:\\study_third\\book\\����ʥĸԺ.jpg"));
		JLabel jl6=new JLabel(new ImageIcon("G:\\study_third\\book\\��ʮ�컷�ε���.jpg"));
		JLabel jl7=new JLabel(new ImageIcon("G:\\study_third\\book\\��ʮ�컷�ε���.jpg"));
		JLabel jl8=new JLabel(new ImageIcon("G:\\study_third\\book\\��ʮ�컷�ε���.jpg"));
		JLabel jl9=new JLabel(new ImageIcon("G:\\study_third\\book\\���ȡ��������ȣ����£�.jpg."));
		
		JButton jbu1=new JButton("����");
		JPanel jp1=new JPanel();
		JLabel name=new JLabel("���Ӷ���");
		Font font = new  Font("����",Font.BOLD, 20);
		name.setFont(font);
		JLabel press=new JLabel("������");
		jp1.add(jl1);
		jp1.add(name);
		jp1.add(press);
		jp1.add(jbu1);
	
		this.add(jp1);
		this.add(jl2);
		this.add(jl3);
		this.add(jl4);
		this.add(jl5);
		this.add(jl6);
		this.add(jl7);
		this.add(jl8);
		this.add(jl9);
		
		//this.setLayout(new FlowLayout(FlowLayout.LEFT,490,0));
		this.setLayout(new GridLayout(3,3,-170,0) );
		this.setVisible(true);
	}
	
}
