package bagelshopGUI;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * ButtonGroupPanel
 */
public class ButtonGroupPanel extends JPanel {

    private JPanel smallpanel = new JPanel();
    private JButton CalculateButton = new JButton("Calculate");
    private JButton ExitButton = new JButton("Exit");

    public ButtonGroupPanel() {
        smallpanel.add(CalculateButton);
        smallpanel.add(ExitButton);

        this.add(smallpanel);
    }
}