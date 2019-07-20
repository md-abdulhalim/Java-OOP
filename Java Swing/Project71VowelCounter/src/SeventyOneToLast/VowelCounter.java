package SeventyOneToLast;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VowelCounter extends JFrame {
	private Container container;
	private JLabel promtLabel, vowelLabel, aLabel, eLabel, iLabel, oLabel, uLabel;
	private JTextArea textArea;
	private Font fontStyle;
	private JScrollPane scroll;

	int totalVowel = 0;
	int letter_a;
	int letter_e;
	int letter_i;
	int letter_o;
	int letter_u;

	// constructor
	public VowelCounter() {
		initComponents();
	}

	public void initComponents() {
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.PINK);

		this.setBounds(50, 50, 500, 500);
		this.setTitle("Vowel Counter ");

		fontStyle = new Font("Arial", Font.BOLD + Font.LAYOUT_LEFT_TO_RIGHT, 16);

		promtLabel = new JLabel("Enter Your texts :");
		promtLabel.setBounds(10, 10, 150, 100);
		promtLabel.setFont(fontStyle);
		container.add(promtLabel);

		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);

		scroll = new JScrollPane(textArea);
		scroll.setBounds(150, 20, 300, 100);
		container.add(scroll);

		// vowel label
		vowelLabel = new JLabel();
		vowelLabel.setBounds(150, 120, 250, 50);
		vowelLabel.setFont(fontStyle);
		container.add(vowelLabel);

		aLabel = new JLabel("a = ");
		aLabel.setBounds(150, 150, 250, 50);
		aLabel.setFont(fontStyle);
		container.add(aLabel);

		eLabel = new JLabel("e = ");
		eLabel.setBounds(150, 180, 250, 50);
		eLabel.setFont(fontStyle);
		container.add(eLabel);

		iLabel = new JLabel("i = ");
		iLabel.setBounds(150, 210, 250, 50);
		iLabel.setFont(fontStyle);
		container.add(iLabel);

		oLabel = new JLabel("o = ");
		oLabel.setBounds(150, 240, 250, 50);
		oLabel.setFont(fontStyle);
		container.add(oLabel);

		uLabel = new JLabel("u = ");
		uLabel.setBounds(150, 270, 250, 50);
		uLabel.setFont(fontStyle);
		container.add(uLabel);

		textArea.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getSource() == textArea) {

					if (e.VK_A == e.getKeyCode()) {

						letter_a++;
						totalVowel++;
					}
					if (e.VK_E == e.getKeyCode()) {

						letter_e++;
						totalVowel++;
					}
					if (e.VK_I == e.getKeyCode()) {

						letter_i++;
						totalVowel++;
					}
					if (e.VK_O == e.getKeyCode()) {

						letter_o++;
						totalVowel++;
					}
					
					if (e.VK_U == e.getKeyCode()) {

						letter_u++;
						totalVowel++;
					}
					

				}
				vowelLabel.setText("Total number of vowels : "+totalVowel);
				aLabel.setText("Total number of   a  : "+letter_a);
				eLabel.setText("Total number of   e  : "+letter_e);
				iLabel.setText("Total number of   i  : "+letter_i);
				oLabel.setText("Total number of   o  : "+letter_o);
				uLabel.setText("Total number of   u  : "+letter_u);
				
			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyTyped(KeyEvent arg0) {
			}

		});
	}

	public static void main(String[] args) {
		VowelCounter frame = new VowelCounter();
		frame.setVisible(true);

	}

}
