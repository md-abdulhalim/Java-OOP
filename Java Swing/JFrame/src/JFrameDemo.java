
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Container;

public class JFrameDemo extends JFrame {

	// HOW TO SET IMAGE ICON IN THE JFRAME Title ? Lecture No. (10) .

	
	// private ImageIcon icon;
	private Container container;
	 
	JFrameDemo() {
		initializedComponents();
	}

	public void initializedComponents() {
		container = this.getContentPane();
		container.setBackground(Color.cyan);

		// icon=new ImageIcon(getClass().getResource("cms.png"));
		ImageIcon icon = new ImageIcon(getClass().getResource("cms.png"));
		this.setIconImage(icon.getImage());
		
	}
	

	// HOW TO CHANGE JFRAME BACKGROUND COLOR ? Lecture No. (11)

	public static void main(String[] args) {

		// JFrame frame =new JFrame(); // This line of code is applicable if you din't
		// extends JFrame class.
		JFrameDemo frame = new JFrameDemo();

		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// frame.setSize(400, 300); //width =400px ; height =300px;

		// frame.setLocation(300, 100); // left move =300px; top move = 100px;

		// frame.setLocationRelativeTo(null); //this method is used to centering frame.

		// setBounds(); is the combined of two method like setSize(),setLocation();
		frame.setBounds(200, 220, 500, 420); // left move =200px; top move =220px; width=500;height =420

		frame.setTitle("The People's University Of Bangladesh");

		frame.setResizable(false);

	}
}
