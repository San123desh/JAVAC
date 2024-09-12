package first_lab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComboBoxList {
    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("JComboBox and JList Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Data for JComboBox and JList
        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4"};

        // Create JComboBox and JList
        JComboBox<String> comboBox = new JComboBox<>(items);
        JList<String> list = new JList<>(items);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        // Create a JScrollPane to wrap the JList (optional for scrollable list)
        JScrollPane listScrollPane = new JScrollPane(list);
        listScrollPane.setPreferredSize(new Dimension(100, 100));

        // Add action listener to JComboBox
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the selected item from JComboBox
                String selectedItem = (String) comboBox.getSelectedItem();
                // Update the selected item in JList
                list.setSelectedValue(selectedItem, true);
            }
        });

        // Add components to the frame
        frame.add(new JLabel("Select an item:"));
        frame.add(comboBox);
        frame.add(new JLabel("List of items:"));
        frame.add(listScrollPane);

        // Display the frame
        frame.setVisible(true);
    }
}
