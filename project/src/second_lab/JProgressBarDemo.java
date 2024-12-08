package second_lab;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

public class JProgressBarDemo extends JFrame{
	JProgressBar bar;
	JButton progress;
	JButton resetBar;
	
	public JProgressBarDemo() {
		setTitle("Custom Progress Frame");
		setSize(300,300);
		
		
		bar = new JProgressBar(SwingConstants.HORIZONTAL, 0, 100);
		bar.setStringPainted(true);
		progress = new JButton("Progress");
		progress.addActionListener(new ActionListener() {
			int count = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				count += 5;
				if(count >= 80) {
					bar.setString("Goal Reached!");
				}
				bar.setValue(count);
			}
			
		});
		
		
		add(progress, BorderLayout.NORTH);
		add(bar, BorderLayout.SOUTH);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		new JProgressBarDemo();
	}

}
