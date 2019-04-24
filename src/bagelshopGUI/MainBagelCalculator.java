/**
 * Tuan Nguyen
 * CS 210
 * 4/23/2019
 * Lab 12
 * MainBagelCalculator.java
 */
package bagelshopGUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

/**
 * 
 * The MetricConverterWindow class lets the user choose bagel,
 * topping and coffee and calculate the total prices.
 *
 */
public class MainBagelCalculator extends JFrame{
	
	private JPanel upperpanel = new JPanel();
	
	public MainBagelCalculator() {
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
	
	/**
	 * The buildPanel method adds 5 labels to a panel.
	 */
	private void buildPanel() {
		//Create panel
		BagelPanel bagelPanel = new BagelPanel();
		ToppingsPanel toppingsPanel = new ToppingsPanel();
		CoffeePanel coffeePanel = new CoffeePanel();
		JLabel introduction = new JLabel("Welcome to the Bagel House");
		upperpanel.add(introduction);
		ButtonGroupPanel buttonGroupPanel = new ButtonGroupPanel();
		
		//Add panel
		add(bagelPanel, BorderLayout.WEST);
		add(coffeePanel, BorderLayout.EAST);
		add(toppingsPanel, BorderLayout.CENTER);
		add(upperpanel, BorderLayout.NORTH);
		add(buttonGroupPanel, BorderLayout.SOUTH);
	}

	/**
	 * The main method creates an instance of the
	 * MainBagelCalculator class, displaying its window.
	 * @param args
	 */
	public static void main(String[] args) {
		new MainBagelCalculator();
	}
}
