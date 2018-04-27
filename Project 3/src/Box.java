public class Box {
	
	/**
	 * These fields are used to find the size of the box and the volume
	 * L is the length of the box
	 * W is the width of the box
	 * H is the height of the box
	 */
	private int L;
	private int W;
	private int H;
	
	/**
	 * This is the default constructor for box class that sets L,W, and H to 1
	 */
	public Box() {

		this.L = 1;
		this.W = 1;
		this.H = 1;
	}
	
	/**
	 * This constructor takes in 3 parameters for L,W, and H
	 * @param L this is the length of the box that is passed in
	 * @param W this is the width of the box that is passed in
	 * @param H this is the height of the box that is passed in
	 */
	public Box(int L, int W, int H) {
		//this checks to make sure that the values passed in are not less than one
		//and throws an illegal argument exception if it is
		try {
			setL(L);
			setW(W);
			setH(H);
		} catch (IllegalBoxException e) {
			e.printStackTrace();
			System.out.println("" + L + "" + W + "" + H);
		}
	}
	
	/**
	 * this returns nothing and sets the length of the box
	 * @param L this is the length of the box
	 */
	public void setL(int L) {
		//checks to make sure that length is not less than one
		if(L < 1) {
			throw new IllegalBoxException();
		}
		this.L = L;
	}
	
	/**
	 * this returns nothing and sets the width of the box
	 * @param W this is the width of the box
	 */
	public void setW(int W) {
		//checks to make sure that width is not less than one
		if(W < 1) {
			throw new IllegalBoxException();
		}
		this.W = W;
	}
	
	/**
	 * this returns nothing and sets the height of the box
	 * @param H this is the height of the box
	 */
	public void setH(int H) {
		//checks to make sure that height is not less than one
		if(H < 1) {
			throw new IllegalBoxException();
		}
		this.H = H;
	}
	
	/**
	 * this returns the length of the box
	 * @return this returns an int value for the length
	 */
	public int getL() {
		return L;
	}
	
	/**
	 * this returns the width of the box
	 * @return this returns an int value for the width
	 */
	public int getW() {
		return W;
	}
	
	/**
	 * this returns the height of the box
	 * @return this returns an int value ofr the height
	 */
	public int getH() {
		return H;
	}

	/**
	 * this method is to calculate the volume of the box
	 * @return this returns the product of length, width, and height which is volume
	 */
	public int volume() {
		int volume = L*W*H;
		return volume;
	}
	
	/**
	 * This concatenates the size of the box and the volume into a string and puts it on the GUI
	 */
	public String toString() {
		int V = volume();
		String box = ("L:" + L + " W:" + W + " H:" + H + " (V: " + V + ")");
		return box;
	}
	
	/**
	 * This checks if the other box is less than or equal to the current box to sort the list
	 * @param other this is the other box variable
	 * @return this returns boolean to check if the volume of the box is equal to the volume of the other box
	 */
	public boolean equals(Box other) {
		if (L*W*H == other.volume()) {
			return true;
		}
		else return false;
	}
}
