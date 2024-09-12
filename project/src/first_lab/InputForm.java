package first_lab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputForm extends JFrame {
    private JTextField nameField;
    private JPasswordField passwordField;
    private JTextArea displayArea;
    private JButton submitButton;

    public InputForm() {
        // Set up the JFrame
        setTitle("User Input Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        // Add JLabels and JTextFields
        panel.add(new JLabel("Name:"));
        nameField = new JTextField(15);
        panel.add(nameField);

        panel.add(new JLabel("Password:"));
        passwordField = new JPasswordField(15);
        panel.add(passwordField);

        panel.add(new JLabel("Display:"));
        displayArea = new JTextArea(5, 20);
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);
        panel.add(scrollPane);

        // Add JButton
        submitButton = new JButton("Submit");
        submitButton.addActionListener(new SubmitButtonListener());
        panel.add(submitButton);

        // Add panel to the frame
        add(panel);
    }

    // ActionListener for the button
    private class SubmitButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String name = nameField.getText();
            char[] password = passwordField.getPassword();
            displayArea.setText("Name: " + name + "\nPassword: " + new String(password));
        }
    }

    public static void main(String[] args) {
        // Create and show the form
        InputForm form = new InputForm();
        form.setVisible(true);
    }
}
