package bagelshopGUI;

import javax.swing.*;

public class MainBagelCalculator extends JFrame{
	
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 300;
	
	public MainBagelCalculator() {
        // Set the title bar text
        setTitle("Order Calculator");

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Specify an action for the close button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Build the panel and add it to the frame
        buildPanel();

        //Display the window
        setVisible(true);
	}
	
	private void buildPanel() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		new MainBagelCalculator();
	}
}
