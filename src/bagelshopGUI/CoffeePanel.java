/**
 * Tuan Nguyen
 * CS 210
 * 4/23/2019
 * Lab 12
 * CoffeePanel.java
 */
package bagelshopGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 * A class represent the Coffee Panel of the the order calculator GUI
 * @author tuan nguyen
 * @since 4/23/2019
 */
public class CoffeePanel extends JPanel {
	private JRadioButton NoneButton = new JRadioButton("None");
	private JRadioButton RegularCoffeeButton = new JRadioButton("Regular coffee");
	private JRadioButton DecafButton = new JRadioButton("Decaf coffee");
	private JRadioButton CappuccinoButton = new JRadioButton("Cappuccino");
	private ButtonGroup radioButtonGroup;
	public static double CoffeePrice = 0;
	
	
	public CoffeePanel() {
		//Set the title as well as the inner layout of panel
		TitledBorder title = BorderFactory.createTitledBorder("Toppings");
		setBorder(title);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		//Add action to each of the check box
		NoneButton.addActionListener(new radioButtonListener());
		RegularCoffeeButton.addActionListener(new radioButtonListener());
		DecafButton.addActionListener(new radioButtonListener());
		CappuccinoButton.addActionListener(new radioButtonListener());
		
		//Add to group so that user only choice one of 4 buttons
		radioButtonGroup = new ButtonGroup();
		radioButtonGroup.add(NoneButton);
		radioButtonGroup.add(RegularCoffeeButton);
		radioButtonGroup.add(DecafButton);
		radioButtonGroup.add(CappuccinoButton);
		
		//Add button to panel
		add(NoneButton);
		add(RegularCoffeeButton);
		add(DecafButton);
		add(CappuccinoButton);
		
	}
	
	/**
	 * Private inner class that handles the event when
	 * the user clicks one of the radio buttons
	 */
	private class radioButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// User check Regular Coffee button
			if (e.getSource() == RegularCoffeeButton) {
				CoffeePrice = 1.25;
			
			// User check Decaf button
			} else if (e.getSource() == DecafButton) {
				CoffeePrice = 1.25;
				
			// User check Cappuccino button
			} else if (e.getSource() == CappuccinoButton) {
				CoffeePrice = 2.00;
				
			// User check None button
			} else if (e.getSource() == NoneButton) {
				CoffeePrice = 0;
			}
		}
		
	}
}
