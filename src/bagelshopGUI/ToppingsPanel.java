package bagelshopGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class ToppingsPanel extends JPanel {
	private JCheckBox CreamCheeseCheckBox = new JCheckBox("Cream Cheese");
	private JCheckBox butterCheckBox = new JCheckBox("Butter");
	private JCheckBox jellyCheckBox = new JCheckBox("Jelly");
	private JCheckBox jamcheCheckBox = new JCheckBox("Jam");
	public static double totalToppingPrice = 0;
	public static boolean[] checkboxChecker = {true, true, true, true};
	
	public ToppingsPanel() {
		JPanel smallpanel = new JPanel(); 
		TitledBorder title = BorderFactory.createTitledBorder("Coffee");
		smallpanel.setBorder(title);
		smallpanel.setLayout(new BoxLayout(smallpanel, BoxLayout.Y_AXIS));
		
		CreamCheeseCheckBox.addActionListener(new CheckBoxListener());
		butterCheckBox.addActionListener(new CheckBoxListener());
		jellyCheckBox.addActionListener(new CheckBoxListener());
		jamcheCheckBox.addActionListener(new CheckBoxListener());
		
		smallpanel.add(CreamCheeseCheckBox);
		smallpanel.add(butterCheckBox);
		smallpanel.add(jellyCheckBox);
		smallpanel.add(jamcheCheckBox);
		
		this.add(smallpanel);
	}
	
	private class CheckBoxListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == CreamCheeseCheckBox) {
				if (checkboxChecker[0] == true) {
					totalToppingPrice += 0.50;
					checkboxChecker[0] = false;
				} else {
					totalToppingPrice -= 0.50;
					checkboxChecker[0] = true;
				}

			} else if (e.getSource() == butterCheckBox) {
				if (checkboxChecker[1] == true) {
					totalToppingPrice += 0.25;
					checkboxChecker[1] = false;
				} else {
					totalToppingPrice -= 0.25;
					checkboxChecker[1] = true;
				}
				
			} else if (e.getSource() == jellyCheckBox) {
				if (checkboxChecker[2] == true) {
					totalToppingPrice += 0.75;
					checkboxChecker[2] = false;
				} else {
					totalToppingPrice -= 0.75;
					checkboxChecker[2] = true;
				}
				
			} else if (e.getSource() == jamcheCheckBox) {
				if (checkboxChecker[3] == true) {
					totalToppingPrice += 0.75;
					checkboxChecker[3] = false;
				} else {
					totalToppingPrice -= 0.75;
					checkboxChecker[3] = true;
				}

			}
		}
		
	}
}
