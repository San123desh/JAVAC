package second_lab;



import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;


public class JTree_JTable {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("JTree and JTable ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        
        // Create the root node for the JTree
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode bikes = new DefaultMutableTreeNode("Bikes");
        DefaultMutableTreeNode automobile = new DefaultMutableTreeNode("Automobile");
        root.add(bikes);
        root.add(automobile);
        bikes.add(new DefaultMutableTreeNode("450mt"));
        bikes.add(new DefaultMutableTreeNode("crf"));
        automobile.add(new DefaultMutableTreeNode("Toyota"));
        automobile.add(new DefaultMutableTreeNode("BYD"));
        
        // Create the JTree
        JTree tree = new JTree(root);
        JScrollPane treeScrollPane = new JScrollPane(tree);
        
        // Create the JTable
        String[] columnNames = {"Brand", "Country"};
        String[][] data = {
            {"Toyota", "Japan"},
            {"BYD", "China"}
        };

        JTable table = new JTable(data, columnNames);
        JScrollPane tableScrollPane = new JScrollPane(table);
        
        // Create a split pane to hold both the JTree and JTable
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, treeScrollPane, tableScrollPane);
        splitPane.setDividerLocation(200);
//        
//        // Add the split pane to the frame
        frame.add(splitPane);
//        
//        // Display the frame
        frame.setVisible(true);
    }
}

