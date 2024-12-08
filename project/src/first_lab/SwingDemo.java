package first_lab;


import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing "); 
        JButton button = new JButton("Click Me!"); 
        
        // Setting the button's location and size
        button.setBounds(50, 100, 100, 30);
        
        // Adding button to frame
        frame.add(button);
        
        // Setting the frame size, layout, and visibility
        frame.setSize(300, 200);
        frame.setLayout(null); // No layout manager
        frame.setVisible(true);
        
        // Closing the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
