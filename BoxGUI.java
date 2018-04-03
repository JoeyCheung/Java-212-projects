import javax.swing.*; 
import java.awt.*;
//These two are imported to enable use of JFrame to create the GUI
public class BoxGUI extends JFrame{
	/**
	 * myFrame is a JFrame type used to create the JFrame
	 * textArea1 and textArea2 are used to put the lists on the GUI
	 * leftText and RightText are used to read the box arrays
	 */
	JFrame myFrame;
	TextArea textArea1;
	TextArea textArea2;
	Box[] leftText;
	Box[] rightText;
	
	/**
	 * This method is used to create the GUI
	 * @param X this is used to read the unsorted list of box's
	 * @param Y this is used to read the sorted list of box's
	 */
	public void initialize(Box[] X, Box[] Y) {
		textArea1 = new TextArea();
		textArea2 = new TextArea();
		myFrame = new JFrame();
		leftText = X; //sets the unsorted array of box's to the left 
		rightText = Y; //sets the sorted array of box's to the right
		myFrame.setSize(400, 400);
		myFrame.setLocation(200,200);
		myFrame.setTitle("Box GUI");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLayout(new GridLayout(1,2));
		Container box = myFrame.getContentPane();
		box.add(textArea1);
		box.add(textArea2);
		//These two loops append the texts to the GUI in their respective places
		for (int i = 0; i < X.length; i++) {
			textArea1.append(X[i] + "\n");
		}
		for (int j = 0; j < Y.length; j++) {
			textArea2.append(Y[j] + "\n");
		}
		myFrame.setVisible(true); //makes the JFrame visible
	}
}
