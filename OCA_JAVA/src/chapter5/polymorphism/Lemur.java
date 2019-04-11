package chapter5.polymorphism;

public class Lemur extends Primate implements HasTail {

	@Override
	public boolean isTailStriped() {
		return false;
	}

	public int age = 10;

	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		System.out.println(lemur.age);
		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStriped());
		Primate primate = lemur; // new Primate diye sadeceprimate nesnesinden oluşsaydı cast işlemini yapamaz classcast exception alırız
		System.out.println(primate.hasHair());
		// Lemur l = primate; does not compile

		Lemur lemur3 = (Lemur) primate; // cast islemi yapılarak atanabilir
		System.out.println(lemur3.age);
	}
}
