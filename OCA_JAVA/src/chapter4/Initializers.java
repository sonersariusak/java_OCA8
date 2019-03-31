package chapter4;

import java.util.ArrayList;

public class Initializers {
	private static final int NUM_BUCKETS = 45;
	private static final ArrayList<String> values = new ArrayList<>(); //

	private static final int NUM_SECONDS_PER_HOUR;
	static {
		int numSecondsPerMinute = 60;
		int numMinutesPerHour = 60;
		NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
		// NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour; ikinci kez
		// atama yapılamaz
	}

	private static int one;
	private static final int two;
	private static final int three = 3;
	//private static final int four; // DOES NOT COMPILE baslangıcda deger atanmazsa static icerisinde atanması gerekir
	static {
		one = 1;
		two = 2;
		//three = 3; // DOES NOT COMPILE
		//two = 4; // DOES NOT COMPILE //Final değişkenler sadece bir kere initialize edilir
		//four = 4;
	}

	public static void main(String[] args) {
		// NUM_BUCKETS = 5; // DOES NOT COMPILE final oldugu icin sadece bir kez atama
		// yapılabilir sonradan deger degistirlemez
		values.add("changed");
		values.add("abc");
		System.out.println(values);
	}
}
