
public class SortedBoxList extends BoxList {

	/**
	 * This is the SortedBoxList constructor that calls the super method for the parent class
	 */
	public SortedBoxList() {
		super();
	}

	/**
	 * this is the add method that overrides the parent abstract add method and calls insert
	 */
	@Override
	public void add(Box b) {
		insert(b);
	}

	/**
	 * this is the insert method that checks the volumes of each box and inserts them in the correct place
	 * @param b this is the data that will be inserted in the proper place of the linkedlist
	 */
	private void insert (Box b) {
		BoxNode n = new BoxNode(b);
		BoxNode currentNode = first;
		BoxNode nextNode = first.next;
		while (nextNode != null && nextNode.data.volume() < n.data.volume()) {
			currentNode = nextNode;
			nextNode = nextNode.next;
		}
		currentNode.next = n;
		n.next = nextNode;
	}
}
