package com.mdhalim.LoginForm;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {

	private JLabel userLabel, passwordLabel;
	private JTextField jtextField;
	private JPasswordField passwordField;
	private JButton loginButton, clearButton;
	private Font font;
	private Container container;

	public LoginFrame() {

		// frame creation
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(100, 50, 500, 400);
		this.setTitle("Login Form");
		// keeping the frame in the container
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.DARK_GRAY);
		// font
		font = new Font("tahoma", Font.BOLD, 16);
		// userLabel
		userLabel = new JLabel("UserName :");
		userLabel.setBounds(50, 50, 150, 50);
		userLabel.setFont(font);
		userLabel.setForeground(Color.WHITE);
		container.add(userLabel);
		
		// passwordLabel
		passwordLabel = new JLabel("UserPassword :");
		passwordLabel.setBounds(50, 120, 150, 50);
		passwordLabel.setFont(font);
		passwordLabel.setForeground(Color.WHITE);
		container.add(passwordLabel);

		// textField
		jtextField = new JTextField();
		jtextField.setBounds(190, 50, 200, 50);
		jtextField.setFont(font);
		container.add(jtextField);

		// passwordField
		passwordField = new JPasswordField();
		passwordField.setBounds(190, 120, 200, 50);
		passwordField.setFont(font);
		passwordField.setEchoChar('*');
		container.add(passwordField);
		
		// button 
		loginButton =new JButton("LOGIN");
		loginButton.setBounds(190,190,90,50);
		loginButton.setFont(font);
		loginButton.setForeground(Color.ORANGE);
		container.add(loginButton);
		
		clearButton =new JButton("CLEAR");
		clearButton.setBounds(290,190,90,50);
		clearButton.setFont(font);
		container.add(clearButton);
		
		//Action Listener 
		clearButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
	
				jtextField.setText("");
				passwordField.setText("");	
			}
		});
		
loginButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String userName =jtextField.getText();
				String password =passwordField.getText();
				
				if(userName.equals("Abdul Halim") && password.equals("123456")) { 
				JOptionPane.showMessageDialog(null, "You are successfully logined");
				NewFrame frame = new NewFrame();
				frame.setVisible(true);
				//dispose();
				}
				else
					JOptionPane.showMessageDialog(null, "You entered invalid 'password' or 'userName' ");
			}
		});

	}

	public static void main(String[] args) {
		LoginFrame frame = new LoginFrame();
		frame.setVisible(true);

	}

}
