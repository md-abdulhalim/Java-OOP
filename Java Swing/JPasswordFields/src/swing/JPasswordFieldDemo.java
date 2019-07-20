package swing;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

public class JPasswordFieldDemo extends JFrame {

	private Container container;
	private JPasswordField passwordField;
	private Font font;

	public JPasswordFieldDemo() {
		initComponents();
	}

	public void initComponents() {

		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.red);

		font = new Font("Arial", Font.BOLD, 20);
		passwordField = new JPasswordField(); 

		passwordField.setEchoChar('*');
		passwordField.setFont(font);
		passwordField.setBackground(Color.DARK_GRAY);
		passwordField.setForeground(Color.WHITE);
		passwordField.setBounds(50, 50, 150, 40);
		container.add(passwordField);

	}

	public static void main(String[] args) {

		// JFrame
		JPasswordFieldDemo frame = new JPasswordFieldDemo();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 400, 300);
		frame.setTitle("JPassword Field");

	}

}
