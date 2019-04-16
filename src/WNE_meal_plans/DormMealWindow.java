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
    private JLabel label;
    private final int WINDOW_WIDTH = 400;	// Window width
    private final int WINDOW_HEIGHT = 100;	// Window height

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
        String[] mealplan = {"7 meals per week ", "14 meals per week", "Unlimited meal"};
        Dormdropdown = new JComboBox(dorms);
        Mealdropdown = new JComboBox(mealplan);
        //dropdown.addActionListener(new DropdownListener());
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel1.add(Dormdropdown);
        panel2.add(Mealdropdown);
        //add(label);

        add(panel1, BorderLayout.EAST);
        add(panel2, BorderLayout.WEST);
    }

    public static void main(String[] args) {
        new DormMealWindow();
    }

    private class DropdownListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == Dormdropdown) {
                JComboBox item = (JComboBox) e.getSource();
                String message = (String) item.getSelectedItem();
                switch (message) {
                    case "Pymouth": label.setText("");
                }
            }
        }
    }
}
