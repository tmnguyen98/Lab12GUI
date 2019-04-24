/**
 * Tuan Nguyen
 * CS 210
 * 4/23/2019
 * Lab 12
 * ButtonGroupPanel.java
 */
package bagelshopGUI;

import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * A sub class represent the panel contains two buttons, calculation button
 * and exit button that calculator the price and exit the program
 * @author tuan nguyen
 * @since 4/23/2019
 */
public class ButtonGroupPanel extends JPanel {

    private JPanel smallpanel = new JPanel();
    private JButton CalculateButton = new JButton("Calculate");
    private JButton ExitButton = new JButton("Exit");

    public ButtonGroupPanel() {
    	
    	//Add the action to the button when the user click the button
    	ExitButton.addActionListener(new ExitListener());
    	CalculateButton.addActionListener(new CalculationListener());
    	
    	//Add the buttons to the panel
    	smallpanel.add(CalculateButton);
        smallpanel.add(ExitButton);

        this.add(smallpanel);
    }
    
	/**
	 * Private inner class that handles the event when
	 * the user clicks one of the exit button
	 */
    private class ExitListener implements ActionListener {
    	
    	@Override
    	public void actionPerformed(ActionEvent e) {
    		System.exit(0);
    	}
    }
    
	/**
	 * Private inner class that handles the event when
	 * the user clicks the calculation button
	 */
    private class CalculationListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			double total = BagelPanel.BagelPrice + CoffeePanel.CoffeePrice + ToppingsPanel.totalToppingPrice;
			
			// Display the conversion
			JOptionPane.showMessageDialog(null, "total price is $" + total);
		}
    	
    }
}