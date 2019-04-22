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

public class CoffeePanel extends JPanel {	
	private JRadioButton NoneButton = new JRadioButton("None");
	private JRadioButton RegularCoffeeButton = new JRadioButton("Regular coffee");
	private JRadioButton DecafButton = new JRadioButton("Decaf coffee");
	private JRadioButton CappuccinoButton = new JRadioButton("Cappuccino");
	private ButtonGroup radioButtonGroup;
	public static double CoffeePrice = 0;
	
	
	public CoffeePanel() {
		JPanel smallpanel = new JPanel(); 
		TitledBorder title = BorderFactory.createTitledBorder("Toppings");
		smallpanel.setBorder(title);
		smallpanel.setLayout(new BoxLayout(smallpanel, BoxLayout.Y_AXIS));
		
		NoneButton.addActionListener(new radioButtonListener());
		RegularCoffeeButton.addActionListener(new radioButtonListener());
		DecafButton.addActionListener(new radioButtonListener());
		CappuccinoButton.addActionListener(new radioButtonListener());
		
		radioButtonGroup = new ButtonGroup();
		radioButtonGroup.add(NoneButton);
		radioButtonGroup.add(RegularCoffeeButton);
		radioButtonGroup.add(DecafButton);
		radioButtonGroup.add(CappuccinoButton);
		
		smallpanel.add(NoneButton);
		smallpanel.add(RegularCoffeeButton);
		smallpanel.add(DecafButton);
		smallpanel.add(CappuccinoButton);
		
		this.add(smallpanel);
	}
	
	private class radioButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == RegularCoffeeButton) {
				CoffeePrice = 1.25;
			} else if (e.getSource() == DecafButton) {
				CoffeePrice = 1.25;
			} else if (e.getSource() == CappuccinoButton) {
				CoffeePrice = 2.00;
			} else if (e.getSource() == NoneButton) {
				CoffeePrice = 0;
			}
		}
		
	}
}
