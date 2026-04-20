//. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and display the concerned color whenever the specific tab is selected in the Pan


package lab5;

import javax.swing.*;
import java.awt.*;

public class TabbedColorDemo {
    public static void main(String[] args) {
        // Run the GUI creation on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Color Tabbed Pane");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            // Create the tabbed pane
            JTabbedPane tabbedPane = new JTabbedPane();

            // Create panels with specific background colors
            JPanel cyanPanel = new JPanel();
            cyanPanel.setBackground(Color.CYAN);

            JPanel magentaPanel = new JPanel();
            magentaPanel.setBackground(Color.MAGENTA);

            JPanel yellowPanel = new JPanel();
            yellowPanel.setBackground(Color.YELLOW);

            // Add tabs to the pane
            tabbedPane.addTab("Cyan", cyanPanel);
            tabbedPane.addTab("Magenta", magentaPanel);
            tabbedPane.addTab("Yellow", yellowPanel);

            // Add the tabbed pane to the frame
            frame.add(tabbedPane);
            frame.setVisible(true);
        });
    }
}
