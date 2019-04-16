package WNE_meal_plans;

import javax.swing.*;

public class DormMealWindow extends JFrame{

    public DormMealWindow() {
        // Set the title bar text
        setTitle("Order Calculator");

        // Specify an action for the close button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Display the window
        pack();
        setVisible(true);

    }

    public static void main(String[] args) {
        new DormMealWindow();
    }
}
