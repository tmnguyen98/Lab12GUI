package bagelshopGUI;

import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * ButtonGroupPanel
 */
public class ButtonGroupPanel extends JPanel {

    private JPanel smallpanel = new JPanel();
    private JButton CalculateButton = new JButton("Calculate");
    private JButton ExitButton = new JButton("Exit");

    public ButtonGroupPanel() {
    	
    	ExitButton.addActionListener(new ExitListener());
    	CalculateButton.addActionListener(new CalculationListener());
    	
    	smallpanel.add(CalculateButton);
        smallpanel.add(ExitButton);

        this.add(smallpanel);
    }
    
    private class ExitListener implements ActionListener {
    	
    	@Override
    	public void actionPerformed(ActionEvent e) {
    		System.exit(0);
    	}
    }
    
    private class CalculationListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			double total = BagelPanel.BagelPrice + CoffeePanel.CoffeePrice;
			
			// Display the conversion
			JOptionPane.showMessageDialog(null, "total price is " + total);
		}
    	
    }
}