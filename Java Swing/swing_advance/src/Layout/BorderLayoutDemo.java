package Layout;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo extends JFrame{
	private Container container;
	private BorderLayout bLayout;
	private JButton btn1 ,btn2 , btn3 , btn4 ,btn5 ;
	
	public BorderLayoutDemo() {
		initComponents();
	}
	
	public void initComponents() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(100,100,500,500);
		this.setTitle("BorderLayout");
		// button created
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("4");
		btn5 = new JButton("5");
		
		//Layout created is here ? border layout is the default layout of frame or window .
		//bLayout = new BorderLayout();
		//bLayout.setHgap(10);
		//bLayout.setVgap(5);
		
		container = this.getContentPane();
		//container.setLayout(bLayout);
		
		container.add(btn1 , BorderLayout.NORTH);
		container.add(btn2 , BorderLayout.SOUTH);
		container.add(btn3 , BorderLayout.EAST);
		container.add(btn4 , BorderLayout.WEST);
		container.add(btn5 , BorderLayout.CENTER);
		
	}

	public static void main(String[] args) {
		BorderLayoutDemo frame = new BorderLayoutDemo();
		frame.setVisible(true);
	}

}
