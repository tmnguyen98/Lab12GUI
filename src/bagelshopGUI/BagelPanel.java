package bagelshopGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class BagelPanel extends JPanel{
	private JRadioButton plainButton = new JRadioButton("Plain");
	private JRadioButton everythingButton = new JRadioButton("Everything");
	private ButtonGroup radioButtonGroup;
	public static double BagelPrice = 0;
	
	public BagelPanel() {
		JPanel smallpanel = new JPanel(); 
		TitledBorder title = BorderFactory.createTitledBorder("Bagel");
		smallpanel.setBorder(title);
		smallpanel.setLayout(new BoxLayout(smallpanel, BoxLayout.Y_AXIS));
		
		plainButton.addActionListener(new radioButtonListener());
		everythingButton.addActionListener(new radioButtonListener());
		
		radioButtonGroup = new ButtonGroup();
		radioButtonGroup.add(plainButton);
		radioButtonGroup.add(everythingButton);
		
		smallpanel.add(plainButton);
		smallpanel.add(everythingButton);
		
		this.add(smallpanel);
	}
	
	private class radioButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == plainButton) {
				BagelPrice = 1.25;
			} else if (e.getSource() == everythingButton) {
				BagelPrice = 1.5;
			}
		}
		
	}
}
