
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import jdk.nashorn.api.tree.ForLoopTree;

public class Multiplication extends JFrame {
	
	private Container container;
	private JLabel imgLabel,textLabel;
	private JTextArea textArea;
	private JTextField textField;
	private JButton clearButton;
	private ImageIcon img;
	private Font fontStyle;
	private Cursor cursor;
	
	public Multiplication() {
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.orange);
		//cursor
		cursor = new Cursor(Cursor.HAND_CURSOR);
		
		//font
		fontStyle = new Font("Arial",Font.ITALIC,20);
		
		//image
		img = new ImageIcon(getClass().getResource("java.png"));
		
		imgLabel = new JLabel(img);
		imgLabel.setBounds(20, 10, img.getIconWidth(), img.getIconHeight());
		container.add(imgLabel);
		
		textLabel = new JLabel("Enter number :");
		textLabel.setBounds(20,320,150,50);
		textLabel.setFont(fontStyle);
		container.add(textLabel);
		//TextField
		
		textField = new JTextField();
		textField.setBounds(170,320,120,50);
		textField.setFont(fontStyle);
		//textField.setBackground(Color.DARK_GRAY);
		textField.setForeground(Color.black);
		container.add(textField);
		
		//Button
		clearButton =new JButton("Clear");
		clearButton.setBounds(170,380,120,40);
		clearButton.setFont(fontStyle);
		clearButton.setBackground(Color.DARK_GRAY);
		clearButton.setForeground(Color.white);
		clearButton.setCursor(cursor);
		container.add(clearButton);
		
		//Text Area 
		textArea = new JTextArea();
		textArea.setBounds(20,450,250,250);
		textArea.setFont(fontStyle);
		textArea.setBackground(Color.DARK_GRAY);
		textArea.setForeground(Color.white);
		container.add(textArea);
		
		
		//Action Listener 
		textField.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String value =textField.getText();
				if(value.isEmpty()) {
					JOptionPane.showMessageDialog(null,"Text field is empty or blank ,please try again with any number . ");
				}
				else {
					int num = Integer.parseInt(textField.getText());
					for(int i=1;i<=10;i++) {
						int result = num *i;
						String r=String.valueOf(result);
						String n=String.valueOf(num);
						String iValue = String.valueOf(i);
						
						textArea.append(n +" x "+iValue+" = "+r+"\n");
					}
				}
				
			}
		});
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textArea.setText("");
			}
		});
	
	}

	public static void main(String[] args) {
		Multiplication frame = new Multiplication();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setBounds(200, 50,350, 800);
		frame.setTitle("Login Form");

	}

}
