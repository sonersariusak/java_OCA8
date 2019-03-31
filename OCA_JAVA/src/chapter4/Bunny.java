package chapter4;

public class Bunny {

	private String color;

	private int height;

	private int length;

	// constracter
	// eğer hiçbir constructer yok ise default olarak java bizim yerimize bos
	// consturcter açar
	public Bunny(int length, int theHeight) {
		length = this.length; // backwards – no good!
		height = theHeight; // fine because a different name
		this.color = "white"; // fine, but redundant
	}

	public Bunny() {}

	public static void main(String[] args) {
		Bunny b = new Bunny(1, 2);
		System.out.println(b.length + " " + b.height + " " + b.color);
	}
}
