package second_lab;


import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class MouseAdapterDemo extends MouseAdapter {
    Label l;
    JFrame frame;

    MouseAdapterDemo() {
        frame = new JFrame();
        frame.addMouseListener(this);
        l = new Label();
        l.setBounds(20, 50, 100, 20);
        frame.add(l);
        frame.setLayout(null);
        frame.setSize(300, 200); // Set the size of the frame
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }

    public static void main(String[] args) {
        new MouseAdapterDemo();
    }
}
