package awtSwing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingConcept extends JFrame{
	
	JLabel usernamelbl, passwordlbl;
	JTextField usertxt, passtxt;
	JButton btn;
	
	public SwingConcept() {
		usernamelbl = new JLabel("Enter Username");
		passwordlbl = new JLabel("Enter Password");
		usertxt = new JTextField(20);
		passtxt = new JTextField(20);
		
		btn = new JButton("Login");
		add(usernamelbl);
		add(usertxt);
		add(passtxt);
		add(btn);
		
		setLayout(new FlowLayout());
		setTitle("First Frame");
		setBounds(850,400,300,300);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingConcept();

	}

}
