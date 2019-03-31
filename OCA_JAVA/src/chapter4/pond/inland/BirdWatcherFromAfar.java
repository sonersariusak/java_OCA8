package chapter4.pond.inland;

import chapter4.pond.shore.Bird;

public class BirdWatcherFromAfar { //extends etsen bile bird bird =new bird olduğu için kalıtım işe yaramaz. kalıtım yaparsan bird yeni bir örneğini yaratamazsın
	public void watchBird() {
		Bird bird = new Bird(); 
		//bird.floatInWater(); // DOES NOT COMPILE
		//System.out.println(bird.text); // DOES NOT COMPILE
	}
}
