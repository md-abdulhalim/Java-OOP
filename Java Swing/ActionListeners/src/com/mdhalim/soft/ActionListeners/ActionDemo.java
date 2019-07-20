package com.mdhalim.soft.ActionListeners;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionDemo extends JFrame {

	private Container container;
	private JTextField textField1, textField2;

	public ActionDemo() {
		initComponents();
	}

	public void initComponents() {

		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.orange);

		textField1 = new JTextField();
		textField1.setBounds(50, 50, 200, 50);
		container.add(textField1);

		textField2 = new JTextField();
		textField2.setBounds(50, 110, 200, 50);
		container.add(textField2);

	/*	textField1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String string = textField1.getText();
				if (string.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please Enter Something.");
				} else {
					JOptionPane.showMessageDialog(null, "textField1 :" + string);
				}

			}
		});*/

		/*textField2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String string = textField2.getText();
				if (string.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please Enter Something.");
				} else {
					JOptionPane.showMessageDialog(null, "textField2 :" + string);
				}

			}
		});*/

		// Second method to addActionListener to any button ,textField , etc.
		Handler handler = new Handler();
		textField1.addActionListener(handler);
		textField2.addActionListener(handler);
		
	}
	
	class Handler implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == textField1) {
				
				String string = textField1.getText();
				if (string.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please Enter Something.");
				} else {
					JOptionPane.showMessageDialog(null, "textField1 :" + string);
				}
			}
			else {
				String string = textField2.getText();
				if (string.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please Enter Something.");
				} else {
					JOptionPane.showMessageDialog(null, "textField2 :" + string);
				}
			}
			

		}
		
	}

	public static void main(String[] args) {

		ActionDemo textField = new ActionDemo();
		textField.setVisible(true);
		textField.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textField.setBounds(100, 120, 400, 400);
		textField.setTitle("Action Listener Demo");

	}

}
