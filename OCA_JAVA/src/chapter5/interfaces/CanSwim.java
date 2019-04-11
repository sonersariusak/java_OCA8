package chapter5.interfaces;

public interface CanSwim {

	int MAXIMUM_DEPTH = 100; // deger atanmak zorundadır

	final static boolean UNDERWATER = true;

	public static final String TYPE = "Submersible";

	// değişkenlerde derleyici otomatik olarak bu şekilde tanımlar

	// public static final int MAXIMUM_DEPTH = 100;
	// public static final boolean UNDERWATER = true;
	// public static final String TYPE = "Submersible";

	// private int MAXIMUM_DEPTH = 100; // DOES NOT COMPILE
	// protected abstract boolean UNDERWATER = false; // DOES NOT COMPILE
	// public static String TYPE; // DOES NOT COMPILE
}
