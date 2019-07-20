package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CheckBoxDemo extends JFrame{
	private Container container;
	private JCheckBox java,math, english;
	private Font fontStyle;
	private ButtonGroup btg;
	private JLabel label;
	
	
	public CheckBoxDemo() {
		this.setBounds(100,100,500,500);
		this.setTitle("JCheck Box");
		
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.pink);
		
		label = new JLabel("Nothing is selected NOW");
		
		
		btg = new ButtonGroup();
		fontStyle = new Font("Arial",Font.BOLD,20);
		java = new JCheckBox("Java");
		java.setBounds(50,50,100,50);
		java.setFont(fontStyle);
		java.setBackground(Color.pink);
		java.setForeground(Color.red);
		container.add(java);
		
		math = new JCheckBox("Math");
		math.setBounds(150,50,100,50);
		math.setFont(fontStyle);
		math.setBackground(Color.pink);
		math.setForeground(Color.red);
		container.add(math);
		
		english = new JCheckBox("English");
		english.setBounds(250,50,100,50);
		english.setFont(fontStyle);
		english.setBackground(Color.pink);
		english.setForeground(Color.red);
		container.add(english);
		
		label.setBounds(50,100,400,50);
		label.setFont(fontStyle);
		container.add(label);
		
		btg.add(java);
		btg.add(math);
		btg.add(english);
		
		Handler handler = new Handler();
		java.addItemListener(handler);
		math.addItemListener(handler);
		english.addItemListener(handler);
	}
	
	class Handler implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			
			if(e.getSource().equals(java)) {
				//label.setText("You have selected Java successfully");
				JOptionPane.showMessageDialog(null, "successfull selected java");
			}
			else if(math.isSelected()) {
				label.setText("You have selected Math successfully");
			}
			else {
				label.setText("You have selected English successfully ");
			}
		}
		
	}

/*	class Handler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent object) {
			if(object.getSource().equals(java)) {
				label.setText("You have selected Java successfully .");
			}
			else if(math.isSelected()) {
				label.setText("You have selected Math successfully .");
			}
			else {
				label.setText("You have selected English successfully .");
			}
			
		}
		
	}*/
	public static void main(String[] args) {
		CheckBoxDemo frame = new CheckBoxDemo();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		

	}

}
