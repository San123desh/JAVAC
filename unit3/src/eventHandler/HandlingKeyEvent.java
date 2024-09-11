package eventHandler;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;




public class HandlingKeyEvent extends JFrame implements KeyListener{
	
	JLabel label;
	JTextArea textArea;
	
	public HandlingKeyEvent() {
		setTitle("KeyListener Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create a JTextArea to capture key events
        textArea = new JTextArea();
        textArea.addKeyListener(this);  

        // Create a label to display key information
        label = new JLabel("Press any key...", JLabel.CENTER);


//         Add components to the frame
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        add(label, BorderLayout.SOUTH);
        
       
        // Set frame visibility
        setVisible(true);
	}

	
	
	public static void main(String[] args) {
		
		new HandlingKeyEvent();
		

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		label.setText("Key Typed: " + e.getKeyChar());
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		label.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		label.setText("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
		
	}

}
