package choiceComponent;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class RadioButtonDemo extends JFrame{
	JRadioButton male, female, notspeci;
	JLabel genderlbl;
	
	public RadioButtonDemo() {
		setTitle("Gender Frame");
		setSize(200,200);
		setLayout(new FlowLayout());
		male = new JRadioButton("Male");
		female = new JRadioButton("FEMALE");
		notspeci = new JRadioButton("NOT SPECIFIED");
		genderlbl = new JLabel("Choose Gender:");
		add(genderlbl);
		add(male);
		add(female);
		add(notspeci);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioButtonDemo();

	}

}
