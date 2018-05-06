public class IllegalBoxException extends IllegalArgumentException{
	
	/**
	 * This constructor for IllegalBoxException calls the super constructor from IllegalArgumentException
	 * @param b
	 */
	public IllegalBoxException() {
		System.out.println("Can't be less than one.");
	}	
}