package bagelshopGUI;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class ToppingsPanel extends JPanel {
	private JCheckBox CreamCheeseCheckBox = new JCheckBox("Cream Cheese");
	private JCheckBox Butter = new JCheckBox("Butter");
	private JCheckBox Jelly = new JCheckBox("Jelly");
	private JCheckBox Jam = new JCheckBox("Jam");
	
	public ToppingsPanel() {
		JPanel smallpanel = new JPanel(); 
		TitledBorder title = BorderFactory.createTitledBorder("Coffee");
		smallpanel.setBorder(title);
		smallpanel.setLayout(new BoxLayout(smallpanel, BoxLayout.Y_AXIS));
		
		smallpanel.add(CreamCheeseCheckBox);
		smallpanel.add(Butter);
		smallpanel.add(Jelly);
		smallpanel.add(Jam);
		
		this.add(smallpanel);
	}
}
