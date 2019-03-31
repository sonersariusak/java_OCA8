package chapter4.pond.swan;

import chapter4.pond.shore.Bird;

public class Swan extends Bird{
	public void swim() {
		floatInWater(); // package access to superclass
		System.out.println(text); // package access to superclass
	}

	public void helpOtherSwanSwim() {
		Swan other = new Swan();
		other.floatInWater(); // package access to superclass
		System.out.println(other.text);// package access to superclass
	}

	public void helpOtherBirdSwim() {
		Bird other = new Bird(); //bird farklı bir pakette ve yeni örneği ondan miras almaz oyüzden hata alır.
		//other.floatInWater(); // DOES NOT COMPILE
		//System.out.println(other.text); // DOES NOT COMPILE
	}
}
