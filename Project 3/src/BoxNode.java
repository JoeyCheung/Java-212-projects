public class BoxNode {
	
	/**
	 * These two fields use a protected modifier for both and the data is Box and the other uses a BoxNode data next
	 */
	protected Box data;
	protected BoxNode next;
	
	/**
	 * this is a one argument constructor for adding the boxNode data
	 * @param d is a Box type input to append to the linkedlist
	 */
	public BoxNode(Box d) {
		this.data = d;
		this.next = null;
	}
	
	/**
	 * This is the default constructor for BoxNode, which sets everything to null
	 */
	public BoxNode() {
		this.data= null;
		this.next = null;
	}
	
}
