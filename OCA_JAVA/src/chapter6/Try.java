package chapter6;

public class Try {

	public static void main(String[] args) {
		// try { // DOES NOT COMPILE
		// fall();
		// } finally {
		// System.out.println("all better");
		// }
		// catch (Exception e) {
		// System.out.println("get up");
		// }
		// sırası önemli, ayrıca sadece Try yazılamaz finally veya catch olmalıdır
		String s = "";
		try {
			s += "t";
		} catch (Exception e) {
			s += "c";
		} finally {

			s += "f";
		}
		s += "a";
		System.out.print(s);
		System.exit(0); // javayı durdurur
		 try {
			 fall();
			 } 
		 finally {
			 System.out.println("all better");
			}
	}

	void explore() {
		try {
			fall();
			System.out.println("never get here");
		} catch (RuntimeException e) {
			// getUp();
		}
		// seeAnimals();
	}

	static void fall() {
		throw new RuntimeException();
	}
}
