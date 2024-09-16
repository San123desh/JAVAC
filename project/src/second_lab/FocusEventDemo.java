package second_lab;

import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FocusEventDemo extends JFrame implements FocusListener {
    private JTextField textField;
    JButton button;
    JLabel statusLabel;

    public FocusEventDemo() {
        setTitle("Focus Event");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textField = new JTextField(20);
        button = new JButton("Click Me");
        statusLabel = new JLabel("Focus on a component");

        textField.addFocusListener(this);
        button.addFocusListener(this);

        add(textField);
        add(button);
        add(statusLabel);

        setVisible(true);
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (e.getSource() == textField) {
            statusLabel.setText("TextField gained focus");
        } else if (e.getSource() == button) {
            statusLabel.setText("Button gained focus");
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource() == textField) {
            statusLabel.setText("TextField lost focus");
        } else if (e.getSource() == button) {
            statusLabel.setText("Button lost focus");
        }
    }

    public static void main(String[] args) {
        new FocusEventDemo();
    }
}
