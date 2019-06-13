package Gui;

import DateVisit.VisitInofrmation;
import Ui.Cancel;
import Ui.Modify;
import Ui.Select;

import java.awt.*;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class ModifyPerson extends JFrame{
		JTextField jtf1=new JTextField(8);
		JTextField jtf2=new JTextField(8);
		JTextField jtf3=new JTextField(8);
	public void modifyperson(String id) {
		this.setLayout(new FlowLayout(FlowLayout.CENTER,300,20) );
		this.setSize(600,600);
		this.setLocation(600,260);
		this.setTitle("修改个人信息");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		JLabel jl0=new JLabel("请选择更改信息选项");
		
		
		JButton jbut1=new JButton("更改年龄");
		JButton jbut2=new JButton("更改性别");
		JButton jbut3=new JButton("更改院系");
		
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		JPanel jp3=new JPanel();
		jp1.add(jtf1);
		jp1.add(jbut1);
		jp2.add(jtf2);
		jp2.add(jbut2);
		jp3.add(jtf3);
		jp3.add(jbut3);
		this.add(jl0);
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
		jbut1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String information1=jtf1.getText();
				try {
					Modify.information(id, "1",information1);
					JOptionPane.showMessageDialog(null,"修改成功","提示消息",JOptionPane.WARNING_MESSAGE);
					PersonUI person=new PersonUI();
					person.guisystem(id);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		jbut2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String information2=jtf2.getText();
				try {
					Modify.information(id, "2",information2);
					JOptionPane.showMessageDialog(null,"修改成功","提示消息",JOptionPane.WARNING_MESSAGE);
					PersonUI person=new PersonUI();
					person.guisystem(id);
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		jbut3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String information3=jtf3.getText();
				try {
					Modify.information(id, "3",information3);
					JOptionPane.showMessageDialog(null,"修改成功","提示消息",JOptionPane.WARNING_MESSAGE);
					PersonUI person=new PersonUI();
					person.guisystem(id);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	}
}
