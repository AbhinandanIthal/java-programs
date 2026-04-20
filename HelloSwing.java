package swing;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

class HelloSwing {
    HelloSwing() {
        // Create a new JFrame container
        JFrame jfrm = new JFrame("A Simple Swing Application");

        // Terminate the program when the user closes the application
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a text-based label
        JLabel jlab = new JLabel("Hello! VI C, Welcome to Swing Programming!", SwingConstants.CENTER);

        // Set font and color properties
        // Tip: Ensure the window is large enough for a 32pt font
        jlab.setFont(new Font("Verdana", Font.PLAIN, 24)); 
        jlab.setForeground(new Color(0, 0, 255));

        // Add the label to the content pane
        jfrm.add(jlab);

        // Adjust size to fit the label or set a larger fixed size
        jfrm.setSize(600, 200); 
        
        // Center the window on the screen
        jfrm.setLocationRelativeTo(null);

        // Display the frame
        jfrm.setVisible(true);
    }

    public static void main(String args[]) {
        // Create the frame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new HelloSwing();
            }
        });
    }
}
