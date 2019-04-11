package chapter5.polymorphism;

public class Peacock extends Bird {

	@Override
	public String getName() {
		return "Peacock";
	}

	public static void main(String[] args) {
		Bird bird = new Peacock(); // Peacock türünden turetildiği için getname override edildi
		bird.displayInformation();
	}
}
