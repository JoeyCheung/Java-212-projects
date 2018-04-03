//imported so that we can use JOptionPane
import javax.swing.JOptionPane;
//class
public class Project0 {
	//main program
	public static void main(String[] args) {
		//this is used to read JOptionPane and ask for user input.
		String phrase; 
		//This while loops makes the program ask indefinitely till they type "STOP"
		while (true) {
			//First counter is for lower case e's and second is for upper case
			int counter = 0;
			int counter2 = 0;
			//initializes phrase to JOptionPane.showInputDialog
			phrase = JOptionPane.showInputDialog(null, "Please type in a sentence.\nTo quit type stop.");
			//this loop checks to see if the character is a lower case or upper case e
			for (int i = 0; i < phrase.length(); i++) {
				 //checks for lower case e's then increments counter
				 if (phrase.charAt(i) == 'e')
				 	counter++;
				 //checks for upper case E's then increments counter	
				 if (phrase.charAt(i) == 'E')
				 	counter2++;
				 //Checks to see if they typed stop and ignores different ways to type stop and exits
				 if (phrase.equalsIgnoreCase("stop"))
					System.exit(0);
			} //end of for loop
			//prints out the number of upper case and lower case e's
			JOptionPane.showMessageDialog(null,  "Number of upper case e's: " + counter + "\n" 
					+ "Number of lower case e's: " + counter2);
		}//end of while loop
	}//end of main
}//class