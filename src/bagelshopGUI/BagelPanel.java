package bagelshopGUI;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class BagelPanel extends JPanel{
	private JRadioButton plainButton = new JRadioButton("Plain");
	private JRadioButton everythingButton = new JRadioButton("Everything");
	private ButtonGroup radioButtonGroup;
	
	public BagelPanel() {
		JPanel smallpanel = new JPanel(); 
		TitledBorder title = BorderFactory.createTitledBorder("Bagel");
		smallpanel.setBorder(title);
		smallpanel.setLayout(new BoxLayout(smallpanel, BoxLayout.Y_AXIS));
		
		radioButtonGroup = new ButtonGroup();
		radioButtonGroup.add(plainButton);
		radioButtonGroup.add(everythingButton);
		
		smallpanel.add(plainButton);
		smallpanel.add(everythingButton);
		
		this.add(smallpanel);
	}
}
