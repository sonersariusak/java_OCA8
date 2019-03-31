package chapter4;

public class Overloading {

	/*public void fly(int numMiles) {
	}

	// public static void fly(int numMiles) { } // DOES NOT COMPILE static olunca
	// hata alır
	// public int fly(int numMiles) {} does not compile dönüş türü yok
	public void fly(short numFeet) {
	}

	public boolean fly() {
		return false;
	}
*/
	void fly(int numMiles, short numFeet) {
	}

	public void fly(short numFeet, int numMiles) throws Exception {
	}

	public void fly(int numMiles) {

		System.out.println("short");
	}
	public void fly(short numFeet) {

		System.out.println("short");

	}
	
	//autoboxing
	public static void flyy(int numMiles) { }  

	public static void flyy(Integer numMiles) { } 
	
	public static void main(String[] args) {
		flyy(5); // en uygun olan eşleşen metodu cagıır. burda int olan numMiles e gider
	}
	
	public void fly(int[] lengths) { }
	//public void fly(int... lengths) { } yöntem imzaları aynı, varags da bir dizi oldugu icin
}
