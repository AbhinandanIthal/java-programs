package lab5;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.HashMap;
import java.util.Map;

public class CountryCapitalList extends JFrame {
    private JList<String> countryList;
    private Map<String, String> capitalMap;

    public CountryCapitalList() {
        // 1. Prepare country-capital data
        capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington, D.C.");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Canada", "Ottawa");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("France", "Paris");
        capitalMap.put("Great Britain", "London");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Africa", "N/A (Africa is a Continent)");
        capitalMap.put("Greenland", "Nuuk");
        capitalMap.put("Singapore", "Singapore");

        // 2. Define the countries for the JList
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark", 
            "France", "Great Britain", "Japan", "Africa", 
            "Greenland", "Singapore"
        };

        // 3. Create the JList and add to a ScrollPane
        countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(countryList);

        // 4. Add ListSelectionListener to handle selections
        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Ensure the event only triggers once per selection
                if (!e.getValueIsAdjusting()) {
                    String selectedCountry = countryList.getSelectedValue();
                    if (selectedCountry != null) {
                        String capital = capitalMap.get(selectedCountry);
                        System.out.println("Country: " + selectedCountry + " | Capital: " + capital);
                    }
                }
            }
        });

        // 5. Configure the JFrame
        setTitle("Country Capital Selector");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(scrollPane);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run the GUI on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> new CountryCapitalList());
    }
}
