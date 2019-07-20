package Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Cursor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class ButtonDemo extends JFrame{
	private Container container;
	private JButton btn1,btn2;
	private Font font;
	private Cursor cursor;
	private ImageIcon img1,img2;
	
	
	public ButtonDemo() {
		initComponents();
	}
	public void initComponents() {
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.red);
		// set ImageIcon 
		img1 =new ImageIcon(getClass().getResource("icon.png"));
		img2 =new ImageIcon(getClass().getResource("icon2.png"));
		
		btn1 =new JButton(img1);
		//btn2 =new JButton("Submit");
		btn1.setBounds(50,50,64,64);
		container.add(btn1);
		
		btn2 =new JButton(img2);
		//btn2 =new JButton("Clear");
		btn2.setBounds(180,50,64,64);
		container.add(btn2);
		
		//font creation
		font =new Font("Arial", Font.BOLD, 16);
		btn1.setFont(font);
		container.add(btn1);
		
		btn2.setFont(font);
		container.add(btn2);
		
		//Foreground Color 
		btn1.setBackground(Color.orange);
		btn1.setForeground(Color.WHITE);
		
		btn2.setBackground(Color.gray);
		btn2.setForeground(Color.WHITE);
		//create different cursor
		cursor = new Cursor(Cursor.HAND_CURSOR);
		btn1.setCursor(cursor);
		btn2.setCursor(cursor);
		
		
		
		
	
	}

	public static void main(String[] args) {
		ButtonDemo frame = new ButtonDemo();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 500, 400);
		frame.setTitle("JPassword Field");

	}

}
