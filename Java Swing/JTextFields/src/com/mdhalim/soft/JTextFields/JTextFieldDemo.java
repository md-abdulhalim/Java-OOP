package com.mdhalim.soft.JTextFields;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;


public class JTextFieldDemo extends JFrame{
	
	private Container container;
	private JTextField textField1, textField2;
	private Font font;
	
	public JTextFieldDemo() {
		initComponents();
	}
	
	public void initComponents() {
		
		container =this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.GRAY);
		font = new Font("Script MT Bold",Font.ITALIC+Font.BOLD,20);
		
		// How to set Font style & size of JTextField  ?
		textField1 = new JTextField();
		textField1.setBounds(50,50,200,50);
		textField1.setText("Enter your first name ");
		// How to set Font style & size of JTextField ?
		textField1.setFont(font); 
		// How to set Foreground & background color of JTextField ?
		textField1.setForeground(Color.white);
		textField1.setBackground(Color.GREEN);
		//How to align JTextField
		textField1.setHorizontalAlignment(JTextField.CENTER);
		container.add(textField1);
		
		
		textField2 = new JTextField();
		textField2.setBounds(50,110,200,50);
		textField2.setText("Enter your last name");
		textField2.setFont(font);
		textField2.setBackground(Color.red);
		textField2.setForeground(Color.white);
		container.add(textField2);
	}
	

	public static void main(String[] args) {
		//JFrame 
		JTextFieldDemo textField = new JTextFieldDemo();
		textField.setVisible(true);
		textField.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textField.setBounds(100,120,400,400);
		textField.setTitle("JText Field Form");
		

	}

}
