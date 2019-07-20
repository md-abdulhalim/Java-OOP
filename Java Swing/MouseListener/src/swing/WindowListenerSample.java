package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class WindowListenerSample extends JFrame{
	private Container container;
	private JButton btn;
	private JTextArea textarea;
	
	
	public WindowListenerSample() {
		initComponents();
	}

	
	public void initComponents() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(50,50,500,500);
		this.setTitle("Windows Listener");
		
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.CYAN);
		
		
		this.addWindowListener(new WindowListener() {

			@Override
			public void windowActivated(WindowEvent we) {
				System.out.println("WindowActivated");
				
			}

			@Override
			public void windowClosed(WindowEvent we) {
				System.out.println("WindowClosed");
			}

			@Override
			public void windowClosing(WindowEvent we) {
				System.out.println("WindowClosing");
			}

			@Override
			public void windowDeactivated(WindowEvent we) {
				System.out.println("WindowDeactivated");
			}

			@Override
			public void windowDeiconified(WindowEvent we) {
				System.out.println("WindowDeiconified");
			}

			@Override
			public void windowIconified(WindowEvent we) {
				System.out.println("WindowIconified");
			}

			@Override
			public void windowOpened(WindowEvent we) {
				System.out.println("WindowOpened");
			}
			
			
		});
		
		/*btn = new JButton("click me");
		btn.setBounds(20, 50, 100, 50);
		container.add(btn);
		
		
		textarea = new JTextArea();
		textarea.setBounds(20,120,200,200);
		container.add(textarea);*/
		
		
		
	}

	public static void main(String[] args) {
		WindowListenerSample frame = new WindowListenerSample();
		frame.setVisible(true);
	}

}
