package WNE_meal_plans;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DormMealWindow extends JFrame {

    private JComboBox dropdown;
    private JLabel label;

    public DormMealWindow() {
        // Set the title bar text
        setTitle("Order Calculator");

        // Specify an action for the close button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Build the panel and add it to the frame
        buildPanel();

        //Display the window
        pack();
        setVisible(true);

    }

    private void buildPanel() {
        // Create dropdown and text stuff
        String[] dorms = {"Plymouth", "Commonwealth", "Gateway", "Southwood"};
        dropdown = new JComboBox(dorms);
        //dropdown.addActionListener(new DropdownListener());
        add(dropdown);
        //add(label);
    }

    public static void main(String[] args) {
        new DormMealWindow();
    }

    private class DropdownListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
