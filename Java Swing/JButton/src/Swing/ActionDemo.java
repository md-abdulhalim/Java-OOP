package Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ActionDemo extends JFrame {
	private Container container;
	private JTextField texField;
	private JButton button;
	
	
	public ActionDemo() {
		initComponents();
	}
	public void initComponents() {
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.red);
		
		texField = new JTextField();
		texField.setBounds(50,50,150,50);
		container.add(texField);
		
		button = new JButton("Clear");
		button.setBounds(50,120,100,40);
		container.add(button);
		
		button.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				texField.setText("");
				
			}
		});
	}

	
	public static void main(String[] args) {
		ActionDemo frame = new ActionDemo();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 500, 400);
		frame.setTitle("JPassword Field");
	}

}
