package March01;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyListenerDemo extends JFrame implements KeyListener{
	
	private Container container;
	private Font fontStyle;
	private JTextField textField;
	private JTextArea textArea;
	
	public KeyListenerDemo() {
		initComponents();
	}

	public void initComponents() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(100,100,500,500);
		this.setTitle("Action Listener Methods");
		
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.pink);
		fontStyle = new Font("Arial", Font.BOLD+Font.CENTER_BASELINE, 18);
		
		
		textField = new JTextField();
		textField.setBounds(50,20,200,60);
		textField.setFont(fontStyle);
		textField.setBackground(Color.white);
		textField.setForeground(Color.black);
		container.add(textField);
		
		
		textArea = new JTextArea();
		textArea.setBounds(50,100,300,350);
		textArea.setFont(fontStyle);
		textArea.setBackground(Color.DARK_GRAY);
		textArea.setForeground(Color.WHITE);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		container.add(textArea);
		
		textField.addKeyListener(this);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		textArea.append("Key Pressed : "+e.getKeyChar()+"\n");
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
	
			textArea.append("Key Released : "+e.getKeyChar()+"\n");
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		textArea.append("Key Typed : "+e.getKeyChar()+"\n");
	}
	
	
	
	public static void main(String[] args) {
		KeyListenerDemo frame = new KeyListenerDemo();
		frame.setVisible(true);

	}



}
