package chapter5.interfaces;

public class Bunny implements Hop {

	public void printDetails() {
		System.out.println(Hop.getJumpHeight());
		// System.out.println(getJumpHeight()); // DOES NOT COMPILE
	}
}
