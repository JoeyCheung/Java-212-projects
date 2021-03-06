import javax.swing.*; 
import java.awt.*;
//These two are imported to enable use of JFrame to create the GUI
public class BoxGUI extends JFrame{
	/**
	 * myFrame is a JFrame type used to create the JFrame
	 * textArea1 and textArea2 are used to put the lists on the GUI
	 */
	JFrame myFrame;
	TextArea textArea1;
	TextArea textArea2;
	
	/**
	 * This constructor is used to call the initialize method
	 */
	public BoxGUI () {
		initialize();
	}
	
	/**
	 * This method is used to create the GUI
	 */
	public void initialize() {
		textArea1 = new TextArea();
		textArea2 = new TextArea();
		myFrame = new JFrame();
		myFrame.setSize(400, 400);
		myFrame.setLocation(200,200);
		myFrame.setTitle("Box GUI");
		createMenu();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLayout(new GridLayout(1,2));
		Container box = myFrame.getContentPane();
		box.add(textArea1); //adds left text area
		box.add(textArea2); //adds right text area
		myFrame.setVisible(true); //makes the JFrame visible
	}
	
	/**
	 * this creates the menu
	 */
	private void createMenu() {
	    JMenuItem item1;
	    JMenuItem item2;
	    JMenuItem item3;
	    JMenuBar menuBar  = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu toolsMenu = new JMenu("Tools");
        FileMenuHandler fmh  = new FileMenuHandler(this);
        ToolsMenuHandler tmh = new ToolsMenuHandler();
	    item1 = new JMenuItem("Open");    //Open...
	    item1.addActionListener(fmh);
	    fileMenu.add( item1 );
	    fileMenu.addSeparator();           //add a horizontal separator line
	    item2 = new JMenuItem("Quit");       //Quit
	    item2.addActionListener(fmh);
	    fileMenu.add( item2 );
	    item3 = new JMenuItem("Search");
	    item3.addActionListener(tmh);
	    toolsMenu.add( item3 );
	    menuBar.add(fileMenu);
	    menuBar.add(toolsMenu);
	    myFrame.setJMenuBar(menuBar);
	    
	} //createMenu
	
	/**
	 * This method was created to append the data to the linked list and convert it to a string
	 * @param Unsorted is for BoxList 
	 */
	public void writeToLeftSide(BoxList Unsorted) {
		textArea1.append(Unsorted.toString());
	}
	
	/**
	 * This method was created to sort the data based on volume from highest to lowest on the linked list
	 * @param Sorted is for BoxList
	 */
	public void writeToRightSide(BoxList Sorted) {
		textArea2.append(Sorted.toString());
	}
}
