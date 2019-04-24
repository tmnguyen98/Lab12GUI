/**
 * Tuan Nguyen
 * CS 210
 * 4/23/2019
 * Lab 12
 * bagelPanel.java
 */

package bagelshopGUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

/**
 * A class represent the Bagel Panel of the the order calculator GUI
 * @author tuan nguyen
 *@since 4/23/2019
 */
public class BagelPanel extends JPanel{
	private JRadioButton plainButton = new JRadioButton("Plain");
	private JRadioButton everythingButton = new JRadioButton("Everything");
	private ButtonGroup radioButtonGroup;
	public static double BagelPrice = 0;
	
	public BagelPanel() {
		//Set title and set the layout
		TitledBorder title = BorderFactory.createTitledBorder("Bagel");
		setBorder(title);
		setLayout(new GridLayout(2, 1));
		
		//Add action to the button
		plainButton.addActionListener(new radioButtonListener());
		everythingButton.addActionListener(new radioButtonListener());
		
		//Add to group so that user only choice one of 3 buttons
		radioButtonGroup = new ButtonGroup();
		radioButtonGroup.add(plainButton);
		radioButtonGroup.add(everythingButton);
		
		//Add button to panel
		add(plainButton);
		add(everythingButton);
		
	}
	/**
	 * Private inner class that handles the event when
	 * the user clicks one of the radio buttons
	 */
	private class radioButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			//User check plain button
			if (e.getSource() == plainButton) {
				BagelPrice = 1.25;
				
			//User check everything button
			} else if (e.getSource() == everythingButton) {
				BagelPrice = 1.5;
			}
		}
		
	}
}
