package javaDialogPackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FileColorChooser extends JFrame{
	JButton filebtn, colorbtn;
	JPanel panel;
	
	public FileColorChooser() {
		setTitle("File and color frame");
		setSize(300,300);
		filebtn = new JButton("Open file");
		filebtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new JFileChooser().showOpenDialog(panel);
				
			}
		});
		colorbtn = new JButton("Choose color");
		colorbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Color c = new JColorChooser().showDialog(panel, "Select color", Color.white);
				panel.setBackground(c);
			}
		});
		panel = new JPanel();
		add(filebtn, BorderLayout.NORTH);
		add(panel);
		add(colorbtn, BorderLayout.SOUTH);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new FileColorChooser();
	}

}
