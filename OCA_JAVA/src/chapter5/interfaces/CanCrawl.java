package chapter5.interfaces;

public interface CanCrawl { // eğer protected, private olursa hata alır. final olarak isaretlenemez

	// private void dig(int depth); // DOES NOT COMPILE
	// protected abstract double depth(); // DOES NOT COMPILE
	// public final void surface(); // DOES NOT COMPILE
}
