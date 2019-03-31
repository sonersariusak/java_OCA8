package chapter4.pond.shore;

public class BirdWatcher {
	public void watchBird() { //extends etmeye grek yok aynı paketteler
		Bird bird = new Bird();
		bird.floatInWater(); // calling protected member
		System.out.println(bird.text); // calling protected member
	}
}
