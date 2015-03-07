
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.table.AbstractTableModel;

// Class implements three different types of listener.
public class TableExample {
 
    public Container createContentPane()
    {
        
        // The data used as the titles for the table.
        String[] title = {"No.", "Country", "Player", "Position"};

        // The data used in the table, placed as a multi-dimensional array.
        Object[][] playerdata = {       
        {new Integer(4), "United States", "Sterling Davis" , "Forward"},
        {new Integer(6), "Germany", "Moritz Wohlers", "Forward/Centre"},
        {new Integer(7), "United Kingdom", "Ross Hutton", "Centre"},
        {new Integer(8), "Belgium", "Hugo Sterk", "Guard"},
        {new Integer(10), "United Kingdom", "Andy Pearson", "Forward"},
        {new Integer(11), "United States", "Robert Yanders", "Guard"},
        {new Integer(12), "United Kingdom", "Graham Hunter", "Guard"},
        {new Integer(14), "United Kingdom", "Julius Joseph", "Guard/Forward"},
        {new Integer(15), "United Kingdom", "Gareth Murray", "Forward"},
        {new Integer(21), "United States", "Maurice Hampton", "Guard"}};

        // Table instantiated using the two sets of data.
        JTable table = new JTable(playerdata, title);
        
        // The table displayed in a Scrollpane.
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(500, 150));
    
        JPanel totalGUI = new JPanel();
        totalGUI.add(scrollPane);
        totalGUI.setOpaque(true);
        return totalGUI;
    }

    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("[=] JTable [=]");

        //Create and set up the ContentPane
        TableExample demo = new TableExample();
        frame.setContentPane(demo.createContentPane());
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}