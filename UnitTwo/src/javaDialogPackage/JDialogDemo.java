package javaDialogPackage;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyInfo extends JDialog{
	JLabel infolbl;
	
	public MyInfo() {
		setTitle("My information");
		infolbl = new JLabel("My name is <h1>ram</h1>");
		add(infolbl);
		setSize(200,200);
		setVisible(true);
	}
}


public class JDialogDemo extends JFrame{
	JButton btn;
	
	public JDialogDemo() {
		setTitle("Dialog parent frame");
		btn = new JButton("Display info");
//		btn.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				new MyInfo();
//			}
//		});
		setSize(400,400);
		setVisible(true);
		add(btn, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JDialogDemo();
	}

}
