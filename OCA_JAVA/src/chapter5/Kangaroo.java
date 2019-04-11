package chapter5;

public class Kangaroo extends Marsupial {

	public static boolean isBiped() { // metod gizlemeyi kapatınca (static) bu sefer ekrana true true yazıyor
		return true;
	}

	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs: " + isBiped());
	}

	public static void main(String[] args) {
		Kangaroo joey = new Kangaroo();
		joey.getMarsupialDescription();
		joey.getKangarooDescription();
	}
}
