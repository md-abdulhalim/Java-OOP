import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;



public class RadioButtonDemo extends JFrame{ 
	private Container container;
	private JRadioButton male,feamale;
	private Font fontStyle;
	private ButtonGroup bGroup;
	private JTextArea textArea;
	public RadioButtonDemo() {
		initComponents();
	}

	public void initComponents() {
		this.setBounds(100,100,500,400);
		this.setTitle("Radio Button");
		
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.DARK_GRAY);
		
		bGroup = new ButtonGroup();
		fontStyle =new Font("Arial",Font.CENTER_BASELINE,20);
		male = new JRadioButton("Male");
		male.setBounds(50,50,100,50);
		male.setBackground(Color.DARK_GRAY);
		male.setForeground(Color.white);
		male.setFont(fontStyle);
		//male.setSelected(true);
		//male.setEnabled(false);
		container.add(male);
		
		feamale = new JRadioButton("Female");
		feamale.setBounds(150,50,100,50);
		feamale.setBackground(Color.DARK_GRAY);
		feamale.setForeground(Color.white);
		feamale.setFont(fontStyle);
		container.add(feamale);
	
		bGroup.add(male);
		bGroup.add(feamale);
		
		textArea = new JTextArea();
		textArea.setBounds(50,100,300,200);
		textArea.setFont(fontStyle);
		container.add(textArea);
		
		Handler handler = new Handler();
		male.addActionListener(handler);
		feamale.addActionListener(handler);
	}
	
	class Handler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource().equals(male)) {
				textArea.append("You are selected male \n");
			}
			else {
				textArea.append("you are selected female \n");
			}
		}
	}
	public static void main(String[] args) {
		RadioButtonDemo frame = new RadioButtonDemo();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		

	}

}
