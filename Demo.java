import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculator extends JFrame{
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;	
	private JButton equalButton;
	
	public Calculator(){
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		text1=new JTextField(6);
		add(text1);
		add(new JLabel("/"));
		text2=new JTextField(6);
		add(text2);
		equalButton=new JButton("=");
		equalButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				int num1=Integer.parseInt(text1.getText());
				int num2=Integer.parseInt(text2.getText());
				int result=num1/num2;
				//text3.setText(result);
				text3.setText(Integer.toString(result));
			}
		});
		add(equalButton);
		text3=new JTextField(6);
		add(text3);
		
		pack();
	}
}

class Demo{
	public static void main(String...args){
		new Calculator().setVisible(true);
	}
}
