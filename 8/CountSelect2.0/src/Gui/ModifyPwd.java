package Gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import DateVisit.VisitCourse;
import DateVisit.VisitStudent;
import Entiy.Course;
import Entiy.Student;
import Ui.Modify;

public class ModifyPwd extends JFrame{
	
	JPasswordField jpf=new JPasswordField(15);
	public void modifypwd(String id) throws Exception {
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER,300,20) );
		this.setSize(600,600);
		this.setLocation(600,260);
		this.setTitle("学生选课界面");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		JLabel jl0=new JLabel("-----欢迎来到修改密码界面-------");
		JLabel jl1=new JLabel("新密码:");
		JButton jbut1=new JButton("确定");
		jbut1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String pwd=jpf.getText();
				try {
					Modify.pwd(id,pwd);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 JOptionPane.showMessageDialog(null,"密码修改成功！","提示消息",JOptionPane.WARNING_MESSAGE);       
				PersonUI per=new PersonUI();
				per.guisystem(id);
			}
		});
		JPanel jp1=new JPanel();
		jp1.add(jl1);
		jp1.add(jpf);
		jp1.add(jbut1);
		this.add(jl0);
		this.add(jp1);
		
		
		
	}
}