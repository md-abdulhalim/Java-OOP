package Jpanel;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class JpanelDemo extends JFrame{
	
	private Container c;
	private JPanel jPanel1,jPanel2;
	private JButton btn1, btn2 ,btn3;
	private JLabel jlabel;
	
	
	
	// this is a constructor 
	public JpanelDemo() {
		initComponents(); // method is calling here
	}
	
	// this is a method 
	public void initComponents() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 670, 500);
		this.setTitle("JpanelDemo");
		
		
		c=this.getContentPane();
		c.setLayout(null);
		
		jlabel = new JLabel("there are two JPanels created .");
		jlabel.setBounds(50,20,200,20);
		c.add(jlabel);
		
		btn1 =new JButton("button1");
		btn2 = new JButton("button2");
		btn3 = new JButton("button3");
		
		jPanel1 = new JPanel();
		jPanel1.setBounds(50, 50,250,300);
		jPanel1.setBackground(Color.gray);
		c.add(jPanel1);
		
		
		jPanel2 = new JPanel();
		jPanel2.setBounds(320, 50,250,300);
		jPanel2.setBackground(Color.red);
		c.add(jPanel2);
		
		
		jPanel1.add(btn1);
		jPanel2.add(btn2);
		jPanel1.add(btn3);
	}

	public static void main(String[] args) {
		
		JpanelDemo frame = new JpanelDemo();
		frame.setVisible(true);
	}

}
