import java.awt.event.*;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class ToolsMenuHandler implements ActionListener{
	/**
	 * this checks the action
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String toolMenuName = e.getActionCommand();
		String result;
		if(toolMenuName.equals("Search")) {
			try {
			result =JOptionPane.showInputDialog(null, "Enter a length, width, height separated by commas.");
			int [] values = new int [3];
			StringTokenizer st = new StringTokenizer(result,",");
			for(int i = 0; i < 3; i++) {
				values[i]= Integer.parseInt(st.nextToken(","));
			}
			NewGUI gui = new NewGUI(values[0],values[1],values[2]);
			} catch(NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Not a valid input");
			}
		}
	}
}