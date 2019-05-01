package chapter6;

public class Bunny extends Hopper {

	public static void main(String[] args) {
		try {
			eatCarrot(); // DOES NOT COMPILE çünkü eatCarrot bir exception fırlatır. Ya try içerisine yada throws diyip exception fırlatmalıyız
		} catch (NoMoreCarrotsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			eatCarrot1();
		} catch (RuntimeException e) { // does not compile çünkü eatCarrot1 metodu NoMoreCarrotsException fırlatmıyor. Sadece exception yazılabilir.
			// TODO: handle exception
		}
	}

	@Override
	public void hop() throws IllegalArgumentException {} // DOES NOT COMPILE - CanNotHopException fırlatamayız üst class hopper fırlatmıyor, eğer fırlatırsa fırlatabiliriz.

	private static void eatCarrot() throws NoMoreCarrotsException {}

	private static void eatCarrot1() {}
}
