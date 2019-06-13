package calculate;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculate extends JFrame implements ActionListener{
	final String[] allob= {"7","8","9","/","4","5","6","*","1","2","3","-",".","0","=","+" };
	JButton[] jbuts=new JButton[allob.length];
	JTextField text=new JTextField("0");  //新建文本域
	JButton jbut0=new JButton("CE");
	
	public calculate() {
		JPanel jp1=new JPanel(new GridLayout(0, 2));
		jp1.add(text);
		jp1.add(jbut0);
		JPanel jp2 = new JPanel(new GridLayout(4, 4));
	for(int i=0;i<allob.length;i++) {		//new 所有的按钮
		jbuts[i] =new JButton(allob[i]);
		jp2.add(jbuts[i]);
	}
	for(int i=0;i<allob.length;i++) {
		 jbuts[i].addActionListener(this);
	}
	jbut0.addActionListener(this);
		
	this.setLayout(new FlowLayout(FlowLayout.CENTER,300,20) );
	this.setSize(600,600);
	this.setLocation(600,260);
	this.setTitle("计算器");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setVisible(true);
	this.add(jp1);
	this.add(jp2);
	
	}
	public static void main(String[] args) {
		new calculate();
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		String str=e.getActionCommand();
		
		if(obj == jbut0) {
			handleReset();
		}else if("0123456789.".contains(str)){
			hanleNumber(str);
		}else {
			handleOperator(str);
		}

	}
	public void handleReset() {
		text.setText("0");
		isFirstDigit = true;
	     operator = "=";
	}
	boolean isFirstDigit = true;
	public void hanleNumber(String str) {
		
		if(isFirstDigit) {
			text.setText(str);
		}else if(str.equals(".") && str.contains(".") ) {
			text.setText(str+".");
		}else {
			String number1=text.getText();
			text.setText(number1+str);
		}
		isFirstDigit=false;
	}
	double num=0.0;
	String operator="=";
	public void handleOperator(String opt) {
		if(operator.equals("+")) {
			num+= Double.valueOf( text.getText());
		}
		if(operator.equals("-")) {
			num-= Double.valueOf( text.getText());
		}
		if(operator.equals("*")) {
			num*= Double.valueOf( text.getText());
		}
		if(operator.equals("/")) {
			num/= Double.valueOf( text.getText());
		}
		if(operator.equals("=")) {
			num= Double.valueOf( text.getText());
		}
		text.setText(String.valueOf(num));
		operator=opt;
		isFirstDigit=true;
	}
	
	
}
