package project;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class BorderImplement extends JFrame{
	
	public BorderImplement() {
        
		setTitle("Border Types");

        setSize(600, 400);

        setLayout(new GridLayout(3, 3, 10, 10));
        
        JPanel p1 = createBorderPanel("Line Border", BorderFactory.createLineBorder(Color.BLACK, 3));
        JPanel p2 = createBorderPanel("Etched Border", BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        JPanel p3 = createBorderPanel("Bevel Border", BorderFactory.createBevelBorder(BevelBorder.RAISED));
        JPanel p4 = createBorderPanel("Matte Border", BorderFactory.createMatteBorder(5,5,5,5, Color.RED));
        JPanel p5 = createBorderPanel("Titled Border", BorderFactory.createTitledBorder("Title"));
        JPanel p6 = createBorderPanel("Compound Border", BorderFactory.createCompoundBorder(
        		BorderFactory.createLineBorder(Color.BLUE,3),
        		BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        
        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);
        add(p6);
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

	private JPanel createBorderPanel(String title, Border border) {
		// TODO Auto-generated method stub
		JPanel panel = new JPanel();
		panel.setBorder(border);
		panel.add(new JLabel(title));
		return panel;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderImplement();
	}

}
