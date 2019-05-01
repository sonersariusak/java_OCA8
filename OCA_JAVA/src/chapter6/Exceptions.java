package chapter6;


public class Exceptions {

	public static void main(String[] args) {
		// // Runtime Exception
		// // Aritmetic exception
		// int answer = 11 / 0;
		//
		// // ArrayIndexOutOfBoundsException
		// int[] countsOfMoose = new int[3];
		// System.out.println(countsOfMoose[-1]);
		
		// ClassCastException
		// String type = "moose";
		// Integer number = (Integer) type; // DOES NOT COMPILE
		doNotCodeThis(1);

		String type = "moose";
		Object obj = type;
		Integer number = (Integer) obj;

		// IllegalArgumentException
		Exceptions e = new Exceptions();
		// e.setNumberEggs(2);
		e.printLength();

		// NumberFormatException
		Integer.parseInt("abc");

		// Checked Exceptions
		// FileNotFoundException : Bir dosyayı okurken veya yazarken bir sorun olduğunda programlı olarak atılır
		// IOException : Dosya okunurken veya yazarken bir sorun olduğunda programlı olarak atılır.



	}

	// Errors
	// ExceptionInInitializerError
	static {
		int[] countsOfMoose = new int[3];
		int num = countsOfMoose[-1];
	}

	// StackOverflowError
	public static void doNotCodeThis(int num) {
		doNotCodeThis(1);
	}

	private int numberEggs;

	public void setNumberEggs(int numberEggs) {
		if (numberEggs < 0) {
			throw new IllegalArgumentException("# eggs must not be negative");
		}
		this.numberEggs = numberEggs;

	}

	// NullPointerException
	public void printLength() throws NullPointerException {
		String name = null;
		System.out.println(name.length());
	}

}
