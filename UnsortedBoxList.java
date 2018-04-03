
public class UnsortedBoxList extends BoxList{

	/**
	 * this is the default constructor which uses super to call the constructor of the parent class
	 */
	public UnsortedBoxList() {
		super();
	}
	/**
	 * This overrides the add method for the parent class and calls the append method
	 */
	@Override 
	public void add(Box b) {
		append(b);
	}
	
	/**
	 * this is the append method for the UnsortedList that appends the data to the end of the list
	 * @param b is the box data that's going to be appended
	 */
	private void append(Box b) {
		BoxNode n = new BoxNode(b);
		last.next = n;
		last = n;
		length++;
	}
	
}
