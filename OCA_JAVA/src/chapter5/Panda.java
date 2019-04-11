package chapter5;

public class Panda extends Bear {


	public static void sneeze() { // DOES NOT COMPILE -- eger static olmaz ise hata alır
		System.out.println("Panda bear sneezes quietly");
	}

	@Override
	public void hibernate() { // DOES NOT COMPILE - ege static olursa hata alır
		System.out.println("Panda bear is going to sleep");
	}

	public static void main(String[] args) {

	}
}
