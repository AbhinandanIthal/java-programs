package lab5;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class CountryListApp {
    public static void main(String[] args) {
        // Create the main window frame
        JFrame frame = new JFrame("Country Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        // List of countries to display
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark", 
            "France", "Great Britain", "Japan", "Africa", 
            "Greenland", "Singapore"
        };

        // Create the JList with the country names
        JList<String> countryList = new JList<>(countries);
        
        // Add listener to detect when a country is selected
        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Ensure the event only fires once per selection change
                if (!e.getValueIsAdjusting()) {
                    String selected = countryList.getSelectedValue();
                    if (selected != null) {
                        System.out.println("Selected Country: " + selected);
                    }
                }
            }
        });

        // Add the list to a scrollable pane and then to the frame
        frame.add(new JScrollPane(countryList));

        // Display the application
        frame.setVisible(true);
    }
}
