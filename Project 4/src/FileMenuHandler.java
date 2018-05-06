import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class FileMenuHandler implements ActionListener{
	/**
	 * Field for jframe
	 */
	JFrame jframe;
	
	/**
	 * Constructor for file menu handler
	 * @param jf
	 */
	public FileMenuHandler (JFrame jf) {
	      jframe = jf;
	}
	
	/**
	 * Checks the action
	 */
	@Override
	public void actionPerformed(ActionEvent event) {
		String  menuName;
	    menuName = event.getActionCommand();
	    if (menuName.equals("Open"))
	    	openFile(); 
	    else if (menuName.equals("Quit"))
	        System.exit(0);
	    else if (menuName.equals("Search"))
	    	JOptionPane.showInputDialog(null, "Enter the width");
	} //actionPerformed

	/**
	 * Called when you open the file
	 */
	private void openFile() {
		JFileChooser chooser;
	    int status;
	    chooser = new JFileChooser( );
	    status = chooser.showOpenDialog(null);
	    if (status == JFileChooser.APPROVE_OPTION) {
	    	readSource(chooser.getSelectedFile());
	    } else 
	        JOptionPane.showMessageDialog(null, "Open File dialog canceled");
	} //openFile
	  
	/**
	 * Reads the file chosen
	 * @param chosenFile reads the file
	 */
	private void readSource(File chosenFile) {
		String chosenFileName = chosenFile.getName();
	    TextFileInput inFile = new TextFileInput(chosenFileName);
	    String GUI;
	    int subscript = 0;
	    Container myContentPane = jframe.getContentPane();
	    TextArea myTextArea = new TextArea();
	    TextArea mySubscripts = new TextArea();
	    myContentPane.add(myTextArea, BorderLayout.EAST);
	    myContentPane.add(mySubscripts, BorderLayout.WEST);
	    GUI = inFile.readLine();
	    while (GUI != null) {
	    	try {
	    		mySubscripts.append(Integer.toString(subscript++)+"\n");
	    		myTextArea.append(GUI+"\n");
	    	} catch (IllegalBoxException ibe){
	    		System.out.println(ibe.getMessage());
	    	} finally {
	    		GUI = inFile.readLine();
	    	}
	    } //while
	    jframe.setVisible(true);  
	}
}