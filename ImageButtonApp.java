//. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is pressed by implementing the event handling mechanism with addActionListener( ).


package lab4c;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonApp extends JFrame implements ActionListener {
    JButton btnClock, btnHourGlass;
    JLabel labelMessage;

    public ImageButtonApp() {
        // Set up the JFrame
        setTitle("Button Event Handler");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create buttons with images (Ensure images exist in the project directory)
        // ImageIcon can load local image files as button icons
        btnClock = new JButton(new ImageIcon("C:\\Users\\abhin\\Downloads\\digital_clock.png"));
        btnHourGlass = new JButton(new ImageIcon("C:\\Users\\abhin\\Downloads\\hour_glass.png"));

        // Initialize label to display messages
        labelMessage = new JLabel("Press a button to see a message");

        // Implement event handling with addActionListener()
        btnClock.addActionListener(this);
        btnHourGlass.addActionListener(this);

        // Add components to the frame
        add(btnClock);
        add(btnHourGlass);
        add(labelMessage);

        setVisible(true);
    }

    // Handle button clicks
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnClock) {
            labelMessage.setText("Digital Clock is pressed");
        } else if (e.getSource() == btnHourGlass) {
            labelMessage.setText("Hour Glass is pressed");
        }
    }

    public static void main(String[] args) {
        new ImageButtonApp();
    }
}
