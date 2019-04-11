package chapter5;

public class Zebra extends Animal {

	public Zebra(int age) {
		super(age); // sadece ilk satırda çalışır
	}

	public Zebra() {
		this(4);
	}
}
