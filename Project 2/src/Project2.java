import java.util.StringTokenizer;

public class Project2 {
	/**
	 * These two fields are just instaniated boxlists
	 */
	public static BoxList unsorted = new UnsortedBoxList();
	public static BoxList sorted = new SortedBoxList();

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
		inputFromFile(args[0]);
		BoxGUI gui = new BoxGUI(); //instantiates GUI
		gui.writeToLeftSide(unsorted); //puts the unsorted list on the left side
		gui.writeToRightSide(sorted); //puts the sorted list on the right side
	}
	
	/**
	 * This reads the file and stores the values into a box array
	 * @param fileName this is the file that gets passed in
	 * @return this returns an array of box's for the sorted/unsorted list
	 */
	private static void inputFromFile(String fileName) {
		
		TextFileInput file = new TextFileInput(fileName);
		String line = file.readLine();
		
		while (line != null) {
			int[] values = new int[3]; // used to store the 3 values into the array
			StringTokenizer myTokens = new StringTokenizer(line, ","); //used to read the ; tokens
			int commas = myTokens.countTokens(); //used as a counter for the tokens in the list
			
			for (int i = 0; i < commas; i++) { 
				values[i] = Integer.parseInt(myTokens.nextToken(","));
			}//this loop goes through the list and parse's all the values then moves on to the next token
			Box box = new Box(values[0],values[1],values[2]); //these values will be the values of the box
			unsorted.add(box); //this is used now to add the box to the left side of the list
			sorted.add(box); //this is used now to add the box to the right side of the list
			line = file.readLine(); //goes to next line
		}
	}
	
	/**
	 * This is used to check the size of the array
	 * @param fileName this is the file that is passed in to this method and checks the size
	 * @return returns a value of int for the size of the file
	 */
	/*
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
	*/
	/**
	 * this method sorts the Box array 
	 * @param x this takes in a box array to sort
	 * @return this returns a box array sorted by volume
	*/
	/*
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
	*/
}
