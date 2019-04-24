/**
 * Tuan Nguyen
 * CS 210
 * 4/23/2019
 * Lab 12
 * ToppingPanel.java
 */
package bagelshopGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
/**
 * A class represent the Topping Panel of the the order calculator GUI
 * @author tuan nguyen
 * @since 4/23/2019
 */
public class ToppingsPanel extends JPanel {
	private JCheckBox CreamCheeseCheckBox = new JCheckBox("Cream Cheese");
	private JCheckBox butterCheckBox = new JCheckBox("Butter");
	private JCheckBox jellyCheckBox = new JCheckBox("Jelly");
	private JCheckBox jamcheCheckBox = new JCheckBox("Jam");
	public static double totalToppingPrice = 0;
	public static boolean[] checkboxChecker = {true, true, true, true};
	
	public ToppingsPanel() {
		//Set the title as well as the inner layout of panel
		TitledBorder title = BorderFactory.createTitledBorder("Coffee");
		setBorder(title);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		//Add the action to the button when the user click the button
		CreamCheeseCheckBox.addActionListener(new CheckBoxListener());
		butterCheckBox.addActionListener(new CheckBoxListener());
		jellyCheckBox.addActionListener(new CheckBoxListener());
		jamcheCheckBox.addActionListener(new CheckBoxListener());
		
		//Add button to panel
		add(CreamCheeseCheckBox);
		add(butterCheckBox);
		add(jellyCheckBox);
		add(jamcheCheckBox);
		
	}
	
	/**
	 * Private inner class that handles the event when
	 * the user clicks one of the Check boxes
	 */
	private class CheckBoxListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			//User check or uncheck the Cream Cheese Check Box
			if (e.getSource() == CreamCheeseCheckBox) {
				//If user check box
				if (checkboxChecker[0] == true) {
					totalToppingPrice += 0.50;
					checkboxChecker[0] = false;
				//If user uncheck box
				} else {
					totalToppingPrice -= 0.50;
					checkboxChecker[0] = true;
				}
			//User check or uncheck the Butter Check Box
			} else if (e.getSource() == butterCheckBox) {
				//If user check box
				if (checkboxChecker[1] == true) {
					totalToppingPrice += 0.25;
					checkboxChecker[1] = false;
				//If user uncheck box
				} else {
					totalToppingPrice -= 0.25;
					checkboxChecker[1] = true;
				}
			//User check or uncheck the Jelly Check Box
			} else if (e.getSource() == jellyCheckBox) {
				//If user check box
				if (checkboxChecker[2] == true) {
					totalToppingPrice += 0.75;
					checkboxChecker[2] = false;
				//If user uncheck box
				} else {
					totalToppingPrice -= 0.75;
					checkboxChecker[2] = true;
				}
			//User check or uncheck the Jelly Check Box
			} else if (e.getSource() == jamcheCheckBox) {
				//If user check box
				if (checkboxChecker[3] == true) {
					totalToppingPrice += 0.75;
					checkboxChecker[3] = false;
				//If user uncheck box
				} else {
					totalToppingPrice -= 0.75;
					checkboxChecker[3] = true;
				}

			}
		}
		
	}
}
