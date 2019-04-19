package bagelshopGUI;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class ToppingsPanel extends JPanel {
	private JCheckBox CreamCheeseCheckBox = new JCheckBox("Cream Cheese");
	private JCheckBox Butter = new JCheckBox("Butter");
	private JCheckBox Jelly = new JCheckBox("Jelly");
	
	public ToppingsPanel() {
		JPanel smallpanel = new JPanel(); 
		TitledBorder title = BorderFactory.createTitledBorder("Coffee");
		smallpanel.setBorder(title);
		smallpanel.setLayout(new BoxLayout(smallpanel, BoxLayout.Y_AXIS));
		
		ButtonGroup radioButtonGroup = new ButtonGroup();
		radioButtonGroup.add(CreamCheeseCheckBox);
		radioButtonGroup.add(Butter);
		radioButtonGroup.add(Jelly);
		
		smallpanel.add(CreamCheeseCheckBox);
		smallpanel.add(Butter);
		smallpanel.add(Jelly);
		
		this.add(smallpanel);
	}
}
