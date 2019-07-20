package com.mdhalim.soft.JLabel;

import javax.swing.JFrame;
import javax.swing.JLabel; 
import java.awt.Color; 
import java.awt.Container;
import java.awt.Font;

public class JLabels extends JFrame {
	private Container container; //How to change background color of JFrame ?
	private JLabel userLabel ,userPassword; // How to create a JLabel  and multiple JLabel ?
	private Font font; //How to set Font style & size of JLabel

	
	
	public JLabels() {
		initComponents();
	}
	
	public void initComponents() {
		//How to change background color of JFrame ?
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.darkGray);
		//initialized font values.
		font = new Font("Arial",Font.BOLD,16); 
		
		//How to create a JLabel  and multiple JLabel ?
		userLabel = new JLabel();
		userLabel.setText("Enter your UserName :");
		userLabel.setBounds(50,20,200,50);
		//How to set Font style & size of JLabel
		userLabel.setFont(font);
		//How to set Foreground and background color of JLabe ?
		userLabel.setOpaque(true);
		userLabel.setForeground(Color.WHITE);
		userLabel.setBackground(Color.black);
		userLabel.setToolTipText("Click Me");
		container.add(userLabel);
		//System.out.println(" "+userLabel.getText());
		//String s = userLabel.getToolTipText();
		//System.out.println(" "+s);
		
		
		userPassword = new JLabel("Enter your password :");
		userPassword.setBounds(50,60,200,50);
		//How to set Font style & size of JLabel
		userPassword.setFont(font);
		//How to set Foreground and background color of JLabe ?
		userPassword.setOpaque(true);
		userPassword.setForeground(Color.WHITE);
		userPassword.setBackground(Color.red);
		container.add(userPassword);
		
	}

	
	
	// Main method start from here ..............
	
	public static void main(String[] args) {
		// JFrame 
		JLabels labels = new JLabels();
		labels.setVisible(true);
		labels.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		labels.setBounds(100, 100, 500, 500);
		labels.setTitle("Form Registration");

	}

}
