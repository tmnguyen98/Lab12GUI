/**
 * Tuan Nguyen
 * CS 210
 * 4/23/2019
 * Lab 12
 * DormMealWindow.java
 */
package WNE_meal_plans;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * The DormMealWindow class lets the user choose dorm price
 * and meal price and then calculate the total prices.
 *
 */
public class DormMealWindow extends JFrame {

    private JComboBox Dormdropdown;
    private JComboBox Mealdropdown;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JLabel label = new JLabel();
    private final int WINDOW_WIDTH = 400;	// Window width
    private final int WINDOW_HEIGHT = 100;	// Window height
    private int dormprice;
    private int mealprice;

    public DormMealWindow() {
        // Set the title bar text
        setTitle("Dorm Meal Plan");

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Specify an action for the close button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Build the panel and add it to the frame
        buildPanel();

        //Display the window
        setVisible(true);

    }

    private void buildPanel() {
        // Create dorm dropdown and meal drop down
        String[] dorms = {"Plymouth", "Commonwealth", "Gateway", "Southwood"};
        String[] mealplan = {"7 meals per week", "14 meals per week", "Unlimited meal"};
        Dormdropdown = new JComboBox(dorms);
        Mealdropdown = new JComboBox(mealplan);
        
        // Add action to both drop down
        Dormdropdown.addActionListener(new DropdownListener());
        Mealdropdown.addActionListener(new DropdownListener());
        
        // Build panel and label, then add drop down to panel
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel1.add(Dormdropdown);
        panel2.add(Mealdropdown);
        panel3.add(label);

        // Add panel to GUI
        add(panel1, BorderLayout.EAST);
        add(panel2, BorderLayout.WEST);
        add(panel3, BorderLayout.SOUTH);
    }

	/**
	 * The main method creates an instance of the
	 * MainBagelCalculator class, displaying its window.
	 * @param args
	 */
    public static void main(String[] args) {
        new DormMealWindow();
    }

	/**
	 * Private inner class that handles the event when
	 * the user clicks click 1 or 2 drop down.
	 */
    private class DropdownListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
        	if ( e.getSource() == Dormdropdown) {
        		//Check the message to see if it's in Dorm plan
        		JComboBox item = (JComboBox) e.getSource();
                String message = (String) item.getSelectedItem();
                switch (message) {
                    case "Plymouth": 
                    	dormprice = 1200;
                    	break;
                    case "Commonwealth": 
                    	dormprice = 1500;
                    	break;
                    case "Gateway": 
                    	dormprice = 1600;
                    	break;
                    case "Southwood": 
                    	dormprice = 1800;
                    	break;
                }
			} else {
				// Check message to see if it's in Meal plan
                JComboBox item = (JComboBox) e.getSource();
                String message = (String) item.getSelectedItem();
                switch (message) {
                    case "7 meals per week": 
                    	mealprice = 1200;
                    	break;
                    case "14 meals per week": 
                        mealprice = 1500;
                    	break;
                    case "Unlimited meal": 
                    	mealprice = 1600;
                    	break;
                }
			}
            
        	// Show the label
        	label.setText("Total of $" + Integer.toString(dormprice + mealprice));
        }
    }
}
