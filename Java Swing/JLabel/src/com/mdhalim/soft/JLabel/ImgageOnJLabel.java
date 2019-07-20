package com.mdhalim.soft.JLabel;

import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImgageOnJLabel extends JFrame {
	
	private Container container;
	private JLabel imageLabel;
	private ImageIcon img;
	
	public ImgageOnJLabel() {
		initComponents();
	}
	
	public void initComponents() {
		
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.darkGray);
		
		img =new ImageIcon(getClass().getResource("java.png"));
		
		imageLabel = new JLabel(img);
		//imageLabel.setBounds(50,50,300, 200);
		imageLabel.setBounds(50,50,img.getIconWidth(),img.getIconHeight());
		container.add(imageLabel);
	}
	
	
	// Main method start from here .........

	public static void main(String[] args) {
		ImgageOnJLabel imageOnJLabel =new ImgageOnJLabel();
					imageOnJLabel.setVisible(true);
					imageOnJLabel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					imageOnJLabel.setBounds(100,200,400,500);
					imageOnJLabel.setTitle("Image on JLabel Form");
	}

}
