package chapter5;

public class Shark extends Fish {

	private int numberOfFins = 8;

	public Shark(int age) {
		super(age);
		super.size = 4; // super() ile super arasındaki fark
		this.size = 4; // this ile super aynı işi yapıyor
		// super(age); sadece kurucuda ilk satırda çalışır
		// super; does not compile
	}

	public void displaySharkDetails() {
		System.out.print("Shark with age: " + getAge());
		System.out.print(" and " + size + " meters long");
		System.out.print(" with " + numberOfFins + " fins");
	}

	public void displaySharkDetailss() {
		System.out.print("Shark with age: " + this.getAge());
		System.out.print(" and " + this.size + " meters long");
		System.out.print(" with " + this.numberOfFins + " fins");
	}

	public void displaySharkDetailsss() {
		System.out.print("Shark with age: " + super.getAge());
		System.out.print(" and " + super.size + " meters long");
		System.out.print(" with " + this.numberOfFins + " fins");
	}

	public void displaySharkDetailssss() {
		System.out.print("Shark with age: " + super.getAge());
		System.out.print(" and " + super.size + " meters long");
		// System.out.print(" with " + super.numberOfFins + " fins"); // DOES NOT COMPILE
	}
}
