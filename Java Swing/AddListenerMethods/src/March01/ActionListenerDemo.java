package March01;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionListenerDemo extends JFrame implements ActionListener{
	private Container container;
	private JButton redButton,greenButton,blueButton;
	private Font fontStyle;
	
	public ActionListenerDemo() {
		initComponents();
	}
	public void initComponents() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(100,100,500,500);
		this.setTitle("Action Listener Methods");
		
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.pink);
		fontStyle = new Font("Arial", Font.BOLD+Font.PLAIN, 20);
		
		redButton = new JButton("Red");
		redButton.setBounds(50,50,150,50);
		redButton.setBackground(Color.red);
		redButton.setForeground(Color.white);
		redButton.setFont(fontStyle);
		container.add(redButton);
		
		greenButton = new JButton("Green");
		greenButton.setBounds(50,120,150,50);
		greenButton.setBackground(Color.green);
		greenButton.setForeground(Color.white);
		greenButton.setFont(fontStyle);
		container.add(greenButton);
		
		blueButton = new JButton("Blue");
		blueButton.setBounds(50,190,150,50);
		blueButton.setBackground(Color.blue);
		blueButton.setForeground(Color.white);
		blueButton.setFont(fontStyle);
		container.add(blueButton);
		
		/*redButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				container.setBackground(Color.red);
				
			}
			
		});
		
		greenButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				container.setBackground(Color.green);
				
			}
			
		});
		
		blueButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				container.setBackground(Color.blue);
				
			}
			
		});*/
													         
		 
		redButton.addActionListener(this);
		greenButton.addActionListener(this);
		blueButton.addActionListener(this);
		
	}

	public static void main(String[] args) {
		
		ActionListenerDemo frame = new ActionListenerDemo();
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(redButton)) {
			
			container.setBackground(Color.red);
		}
		else if(e.getSource().equals(greenButton)) {
			container.setBackground(Color.green);
		}
		else{
			container.setBackground(Color.blue);
		}
	}

}
