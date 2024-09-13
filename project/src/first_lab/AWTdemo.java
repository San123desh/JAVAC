package first_lab;

import java.awt.*;
import java.awt.event.*;

public class AWTdemo {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT "); // Creating a frame
        Button button = new Button("Click Me!"); // Creating a button
        
        // Setting the button's location and size
        button.setBounds(50, 100, 80, 30);
        
        // Adding button to frame
        frame.add(button);
        
        // Setting the frame size, layout, and visibility
        frame.setSize(300, 200);
        frame.setLayout(null); // No layout manager
        frame.setVisible(true);
        
        // Closing the frame
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
