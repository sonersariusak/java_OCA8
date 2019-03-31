package chapter2;

public class maintest {

	public static void main(String[] args) {

		int x = 20;

		while (x > 0) {

			do {

				x -= 2;

			} while (x > 5);

			x--;
			System.out.print(x + "\t");

		}

		// ----------------------------------------------------------

		int[][] myComplexArray = { { 5, 2, 1, 3 }, { 3, 9, 8, 9 }, { 5, 7, 12, 7 } };

		OUTER_LOOP: for (int[] mySimpleArray : myComplexArray) {

			INNER_LOOP: for (int i = 0; i < mySimpleArray.length; i++) {

				System.out.print(mySimpleArray[i] + "\t");

			}

			System.out.println();

		}

		// --------------------------------------------------------

		int[][] list = { { 1, 13, 5 }, { 1, 2, 5 }, { 2, 7, 2 } };
		int searchValue = 2;
		int positionX = -1;
		int positionY = -1;
		PARENT_LOOP: for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				if (list[i][j] == searchValue) {
					positionX = i;
					positionY = j;
					// break ; //PARENT_LOOP donguden tamamen cikartir
				}
			}
		}
		if (positionX == -1 || positionY == -1) {
			System.out.println("Value " + searchValue + " not found");
		} else {
			System.out.println("Value " + searchValue + " found at: " + "(" + positionX + "," + positionY + ")");
		}

		// --------------------------------------------------------
		
		FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
			for (char c = 'a'; c <= 'c'; c++) {
				if (a == 2 || c == 'b')
					
				System.out.print(" " + a + c);
			}
		}

	}

	public static void a() {
		long x = 5;

		long y = (x = 3);

		System.out.println(x); // Outputs 3

		System.out.println(y); // Also, outputs 3

		System.out.println((y > 5) ? 21 : "Zebra");

		// --------------------------------------------------------

//		int animal = (y < 91) ? 9 : "5"; // DOES NOT COMPILE !!!!

		long a = 10;

		int b = 5;

		a *= b;

		// --------------------------------------------------------

		String deger = null;

		if (deger != null && deger.equals("s")) {
			System.err.println(deger);

		}

		// --------------------------------------------------------

		int dayOfWeek = 5;

		switch (dayOfWeek) {

		default:

			System.out.println("Weekday");

			break;

		case 0:

			System.out.println("Sunday");

			break;

		case 6:

			System.out.println("Saturday");

			break;

		}
	}

}
