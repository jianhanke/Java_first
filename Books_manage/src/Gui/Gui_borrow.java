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
		this.setTitle("用户借书系统");
		this.setSize(1200,1000);
		this.setLocationRelativeTo(null); 
		//JLabel jl1=new JLabel(new ImageIcon("G:\\study_third\\book\\1844年经济学哲学手稿.jpg"));
		
		Image img1=new ImageIcon("G:\\study_third\\book\\1844年经济学哲学手稿.jpg").getImage();
		Image smallImage = img1.getScaledInstance(155,220,Image.SCALE_FAST);
		ImageIcon smallIcon = new ImageIcon(smallImage); 
		JLabel jl1=new JLabel(smallIcon);
		
		JLabel jl2=new JLabel(new ImageIcon("G:\\study_third\\book\\八十天环游地球.jpg"));
		JLabel jl3=new JLabel(new ImageIcon("G:\\study_third\\book\\八十天环游地球.jpg"));
		JLabel jl4=new JLabel(new ImageIcon("G:\\study_third\\book\\八十天环游地球.jpg"));
		JLabel jl5=new JLabel(new ImageIcon("G:\\study_third\\book\\巴黎圣母院.jpg"));
		JLabel jl6=new JLabel(new ImageIcon("G:\\study_third\\book\\八十天环游地球.jpg"));
		JLabel jl7=new JLabel(new ImageIcon("G:\\study_third\\book\\八十天环游地球.jpg"));
		JLabel jl8=new JLabel(new ImageIcon("G:\\study_third\\book\\八十天环游地球.jpg"));
		JLabel jl9=new JLabel(new ImageIcon("G:\\study_third\\book\\安娜·卡列尼娜（上下）.jpg."));
		
		JButton jbu1=new JButton("借书");
		JPanel jp1=new JPanel();
		JLabel name=new JLabel("孩子额外");
		Font font = new  Font("宋体",Font.BOLD, 20);
		name.setFont(font);
		JLabel press=new JLabel("出版社");
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
