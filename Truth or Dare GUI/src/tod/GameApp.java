package tod;
import java.awt.Color;

import javax.swing.JFrame;
public class GameApp {

	public static void main(String[] args) {
		// display the GUI
    Game gui = new Game();
    gui.setTitle("Truth or Dare by Pope");
    gui.setLocationRelativeTo(null);
    gui.setSize(300,200);
    gui.setVisible(true);
    gui.setBackground(Color.GRAY);
    
    gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
