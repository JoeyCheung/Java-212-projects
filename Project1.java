import java.util.*;
//This is used to access String Tokenizer
public class Project1 {
    
	public static void main (String[] args) {
		/*
		 * used to debug class box, sizeOfArray and inputFromFile methods
		
		Box box = new Box(5,5,5);
		System.out.println(box.toString());
		
		System.out.println(sizeOfArray("text.txt"));
		
		for (int i = 0; i < unsortedArray.length; i++) {
			System.out.println(unsortedArray[i]);
		}
		*/
		int size = sizeOfArray(args[0]); //takes in a file and calculates the size
		// made a new unsorted array because the old one gets deleted when passed into selection sort
		Box[] newUnsortedArray = new Box[size]; //the size of the array
		Box[] unsortedArray = inputFromFile(args[0]); //reads in the file and stores them in this array
		//this loop stores the box's in the original array into the new array
		for (int i = 0; i < unsortedArray.length; i++) {
			newUnsortedArray[i] = unsortedArray[i];
		}
		Box[] sortedArray = selectionSort(unsortedArray); //creates a sorted array
		BoxGUI gui = new BoxGUI(); //instantiates GUI
		gui.initialize(newUnsortedArray, sortedArray); //creates the GUI with unsorted and sorted
	}
	
	/**
	 * This reads the file and stores the values into a box array
	 * @param fileName this is the file that gets passed in
	 * @return this returns an array of box's for the sorted/unsorted list
	 */
	public static Box[] inputFromFile(String fileName) {
		
		int size = sizeOfArray(fileName); //gets the size of the file
		Box[] box = new Box[size];
		TextFileInput file = new TextFileInput(fileName);
		String line = file.readLine();
		
		int count = 0; // this counter is used to iterate through the box different boxes
		while (line != null) {
			
			int[] values = new int[3]; // used to store the 3 values into the array
			StringTokenizer myTokens = new StringTokenizer(line, ","); //used to read the ; tokens
			int commas = myTokens.countTokens(); //used as a counter for the tokens in the list
			
			for (int i = 0; i < commas; i++) { 
				values[i] = Integer.parseInt(myTokens.nextToken(","));
			}//this loop goes through the list and parse's all the values then moves on to the next token
			box[count] = new Box(values[0],values[1],values[2]); //these values will be the values of the box
			count++;
			line = file.readLine(); //goes to next line
		}
		return box;
	}

	/**
	 * This is used to check the size of the array
	 * @param fileName this is the file that is passed in to this method and checks the size
	 * @return returns a value of int for the size of the file
	 */
	public static int sizeOfArray(String fileName) {
		TextFileInput file = new TextFileInput(fileName);
		int count = 0;
		String Line = file.readLine();
		while (Line != null) {
			count++;
			Line = file.readLine();
		}
		file.close();
		return count;
	}
	
	/**
	 * this method sorts the Box array 
	 * @param x this takes in a box array to sort
	 * @return this returns a box array sorted by volume
	 */
	public static Box[] selectionSort(Box[] x) {
		for (int i = 0; i < x.length - 1; i++) { 
	         int indexLowest = i; 
	         for (int j = i + 1; j < x.length; j++) {
	        	 if (x[j].volume() < (x[indexLowest]).volume()) //compares volume of boxes
	        		 indexLowest = j;
	         }  // if	  
	         //this checks the box and compares it to see if it's equal then arranges it
	         if (!x[indexLowest].equals(x[i])) { 
	        	 Box temp = x[indexLowest];
	        	 x[indexLowest] = x[i];
	        	 x[i] = temp;
	         }
	    } // for i 
		return x;
	}
}