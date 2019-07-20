package Jpanel;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PracticeDemo extends JFrame {
	
	private Container container;
	private JPanel panel1,panel2;
	
	
	
	public PracticeDemo(){
		initComponents();
	}
	
	public void initComponents() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100,100,400,500);
		this.setTitle("Practice session");
		
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.PINK);
		
		
		panel1 = new JPanel();
		panel1.setBounds(40,30,200,300);
		panel1.setBackground(Color.red);
		
		container.add(panel1);
		
		
		panel2 = new JPanel();
		panel2.setBounds(250,30,100,300);
		panel2.setBackground(Color.green);
		
		container.add(panel2);
		
	}

	public static void main(String[] args) {
		PracticeDemo frame = new PracticeDemo();
		frame.setVisible(true);

	}

}
