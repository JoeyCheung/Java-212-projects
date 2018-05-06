
public abstract class BoxList {

	/**
	 * these fields are for the linkedlist and increases the length every time 
	 */
	BoxNode first;
	BoxNode last;
	int length;
	
	/**
	 * this Boxlist constructor sets a dummy node
	 */
	public BoxList() {
		BoxNode node = new BoxNode();
		first = node;
		last = node;
		length = 0;
	}
	/**
	 * this abstract method is for the child classes to override
	 * @param b is the parameter that this method takes in to be overrided
	 */
	public abstract void add(Box b);
	
	/**
	 *this to string method is used to add the Nodes to a string for it to be appended on the GUI
	 *@return returns a string for the Linkedlist
	 */
	public String toString() {
		String boxListString = "";
		BoxNode currentNode = first.next;
		while (currentNode != null) {
			boxListString = boxListString + currentNode.data + "\n";
			currentNode = currentNode.next;
		}
		return boxListString;
	}
}
