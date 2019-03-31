package chapter4;

public class PassByValue {

	public static void main(String[] args) {
		int num = 4;
		newNumber(5);
		System.out.println(num); // 4
		String name = "Webby";
		speak(name);
		System.out.println(name);
		
		
		int original1 = 1;
		int original2 = 2;
		swap(original1, original2);
		System.out.println(original1); // 1
		System.out.println(original2); // 2
	}

	public static void swap(int a, int b) {
		int temp = a; //temp 1
		a = b; // a 2
		b = temp; //b 1
	}

	public static void speak(String name) {
		name = "Sparky";
	}

	public static void newNumber(int num) {
		num = 8; // num aynı ada sahip ama aynı degisken degil
	}

}
