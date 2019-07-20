package com.mdhalim.LoginForm;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewFrame extends JFrame{
	private Container container;
	private JLabel label;
	public NewFrame() {
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setBounds(200, 50, 500, 400);
		this.setTitle("Login Form");
		
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.orange);
		
		label = new JLabel("Amar sunar bangla ami tumai valo basi chirodin Tomar Akash ");
		label.setBounds(50,50,500,20);
		container.add(label);
		
	}

	public static void main(String[] args) {
		NewFrame frame = new NewFrame();
		frame.setVisible(true);

	}

}
