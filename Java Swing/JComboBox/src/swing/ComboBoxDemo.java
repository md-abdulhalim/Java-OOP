package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxDemo extends JFrame{
	private Container container;
	private JComboBox combox;
	private String[] listItem = {"Java","Math","English","Accounting", "Physics","PHP","JavaFx"};
	private JLabel label;
	private JButton btn;
	//constructor 
	public ComboBoxDemo() {
		initComponents();
	}
	//method
	public void initComponents() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(100,100,500,500);
		this.setTitle("Combo Box Basic Frame");
		
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.orange);
		
		combox = new JComboBox(listItem);
		combox.setBounds(50,50,100,50);
		combox.setEditable(true);
		//combox.setSelectedIndex(3);
		//combox.setSelectedItem("Accounting");
		//combox.addItem("Banlga");
		//combox.removeItem("Java");
		//combox.removeItemAt(1);
		//combox.removeAllItems();
		//System.out.println("Total Item in the ComboBox = "+combox.getItemCount());
		container.add(combox);
		
		btn = new JButton("Show");
		btn.setBounds(50,120,100,50);
		container.add(btn);
		
		label = new JLabel("java");
		label.setBounds(180,50,200,50);
		container.add(label);
		
		/*combox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String item =combox.getSelectedItem().toString();
				label.setText("You have selected : "+item);
				
			}
			
		});*/
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String item =combox.getSelectedItem().toString();
				label.setText("You have selected : "+item);
				
			}
			
		});
	}

	public static void main(String[] args) {
		
		ComboBoxDemo frame = new ComboBoxDemo();
		frame.setVisible(true);
	}

}
