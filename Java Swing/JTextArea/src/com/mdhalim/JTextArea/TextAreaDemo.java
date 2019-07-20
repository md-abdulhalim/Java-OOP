package com.mdhalim.JTextArea;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



public class TextAreaDemo extends JFrame{
	private Container container;
	private JTextArea textArea;
	private Font fontStyle;
	private JScrollPane scroll;
	public TextAreaDemo() {
		initComponents();
	}
	public void initComponents() {
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.pink);
		//font
		fontStyle = new Font("tahoma",Font.CENTER_BASELINE,16);
		
		//Text Area
		textArea = new JTextArea();
		//textArea.setBounds(10,10,200,200);
		textArea.setFont(fontStyle);
		textArea.setBackground(Color.DARK_GRAY);
		textArea.setForeground(Color.WHITE);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		
		
		//scroll
		scroll = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll.setBounds(10,10,200,200);
		container.add(scroll);
	}

	public static void main(String[] args) {
		TextAreaDemo frame = new TextAreaDemo();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setBounds(50,50,500,400);
		

	}

}
