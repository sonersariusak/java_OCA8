package chapter4.pond.goose;

import chapter4.pond.shore.Bird;

public class Gosling extends Bird {
	public void swim() {
		floatInWater(); // calling protected member
		System.out.println(text); // calling protected member
	}
}
