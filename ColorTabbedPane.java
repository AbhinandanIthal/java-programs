package lab5;

import javax.swing.*;
import java.awt.*;

public class ColorTabbedPane {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Color Tabbed Pane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create Panels for each color and set their background
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);

        // Add tabs to the JTabbedPane
        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);

        // Add the tabbed pane to the frame
        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}
