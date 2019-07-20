package com.mdhalim.soft.AddImageAndTextOnJLabel;
import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AddImageText extends JFrame{
	private Container container;
	private JLabel jLabel ;
	private ImageIcon imageIcon;
	
	public AddImageText() {
		initComponents();
	}
	public void initComponents() {
		
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.PINK);
		
		imageIcon = new ImageIcon(getClass().getResource("java.JPG"));		
		//jLabel = new JLabel("Java Development ",imageIcon,JLabel.LEFT);
		jLabel = new JLabel("Java Development ",imageIcon,JLabel.RIGHT);
		jLabel.setBounds(50,50,400,150);
		
		container.add(jLabel);
	}
	

	public static void main(String[] args) {
		
		// JFrame 
		AddImageText imageTextFrame = new AddImageText();
		imageTextFrame.setVisible(true);
		imageTextFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imageTextFrame.setBounds(100,100,500,500);
		imageTextFrame.setTitle("Image With Text On JLabel");
		

	}

}
