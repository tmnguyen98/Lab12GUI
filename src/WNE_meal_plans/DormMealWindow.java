package WNE_meal_plans;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        setTitle("Order Calculator");

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Specify an action for the close button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Build the panel and add it to the frame
        buildPanel();

        //Display the window
        setVisible(true);

    }

    private void buildPanel() {
        // Create dropdown and text stuff
        String[] dorms = {"Plymouth", "Commonwealth", "Gateway", "Southwood"};
        String[] mealplan = {"7 meals per week", "14 meals per week", "Unlimited meal"};
        Dormdropdown = new JComboBox(dorms);
        Mealdropdown = new JComboBox(mealplan);
        Dormdropdown.addActionListener(new DropdownListener());
        Mealdropdown.addActionListener(new DropdownListener());
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel1.add(Dormdropdown);
        panel2.add(Mealdropdown);
        panel3.add(label);

        add(panel1, BorderLayout.EAST);
        add(panel2, BorderLayout.WEST);
        add(panel3, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new DormMealWindow();
    }

    private class DropdownListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
        	if ( e.getSource() == Dormdropdown) {
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
            
        	label.setText("Total of $" + Integer.toString(dormprice + mealprice));
        }
    }
}
