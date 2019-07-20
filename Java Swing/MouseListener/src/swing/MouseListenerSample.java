package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MouseListenerSample extends JFrame {
	private Container container;
	private JTextField jTextField;
	private JTextArea jTextArea;
	private JScrollPane scroll;

	public MouseListenerSample() {
		initComponents();
	}

	public void initComponents() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100,100,500,500);
		this.setTitle("Mouse Listener ");
		
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.cyan);
		// TextField
		
		jTextField = new JTextField();
		jTextField.setBounds(50,50,200,50);
		container.add(jTextField);
		
		// TextArea
		jTextArea = new JTextArea();
		//jTextArea.setBounds(50,120,200,200);
		jTextArea.setBackground(Color.white);
		container.add(jTextArea);
		
		//Scroll Pane ;
		
		scroll = new JScrollPane(jTextArea);
		scroll.setBounds(50,120,200,200);
		container.add(scroll);
		
	jTextField.addMouseListener(new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			jTextArea.append("Mouse Clicked \n ");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			jTextArea.append("Mouse Entered \n ");
		}

		@Override
		public void mouseExited(MouseEvent e) {
			jTextArea.append("Mouse Exited \n ");
		}

		@Override
		public void mousePressed(MouseEvent e) {
			jTextArea.append("Mouse Pressed \n ");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			jTextArea.append("Mouse Released \n ");
		}
		
	});	
	}

	public static void main(String[] args) {
		MouseListenerSample  frame = new MouseListenerSample();
		frame.setVisible(true);
	}

}
