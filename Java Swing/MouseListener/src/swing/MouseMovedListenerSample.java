package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MouseMovedListenerSample extends JFrame {
	private Container container;
	private JTextField jTextField;
	private JTextArea jTextArea;

	public MouseMovedListenerSample() {
		initComponents();
	}

	public void initComponents() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 500, 500);
		this.setTitle("Mouse Motion Listener ");

		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.cyan);

		// TextArea
		jTextArea = new JTextArea();
		jTextArea.setBounds(20,20,250,250);
		jTextArea.setBackground(Color.white);
		container.add(jTextArea);

		// TextField

		jTextField = new JTextField();
		jTextField.setBounds(290,20,180,50);
		container.add(jTextField);
		
		jTextArea.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent e) {
				jTextField.setText("Mouse Dragged : "+e.getX()+ " "+e.getY());
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				jTextField.setText("Mouse Moved : "+e.getX()+ " "+e.getY());
			}
			
		});
	}

	public static void main(String[] args) {

		MouseMovedListenerSample frame = new MouseMovedListenerSample();
		frame.setVisible(true);
	}

}
