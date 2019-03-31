package chapter4.pond.duck;

public class BadDuckling {
	public void makeNoise() {
		FatherDuck duck = new FatherDuck();
		//duck.quack(); // DOES NOT COMPILE  private olduğu için erişemeyiz
		//System.out.println(duck.noise);// DOES NOT COMPILE
	}
}
