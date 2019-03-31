package chapter4;

public class TooManyConversions {
	public static void play(Long l) {
	}
	public static void play(Long... l) {
	}
	public static void main(String[] args) {
		//play(4); // DOES NOT COMPILE long primitive olsaydı upCast yapıcaktı ve derlencekti
		play(4L); // calls the Long version

	}
}
