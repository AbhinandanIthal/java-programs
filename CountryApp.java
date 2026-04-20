package Swings;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryApp extends JFrame implements ActionListener {
    private JLabel messageLabel;
    private JButton indiaBtn, srilankaBtn;

    public CountryApp() {
        // Frame setup
        setTitle("Country Selector");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create components
        indiaBtn = new JButton("India");
        srilankaBtn = new JButton("Srilanka");
        messageLabel = new JLabel("Click a button");

        // Register event handlers
        indiaBtn.addActionListener(this);
        srilankaBtn.addActionListener(this);

        // Add components to the frame
        add(indiaBtn);
        add(srilankaBtn);
        add(messageLabel);

        setVisible(true);
    }

    // Handle button click events
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == indiaBtn) {
            messageLabel.setText("India is pressed");
        } else if (e.getSource() == srilankaBtn) {
            messageLabel.setText("Srilanka is pressed");
        }
    }

    public static void main(String[] args) {
        new CountryApp();
    }
}
