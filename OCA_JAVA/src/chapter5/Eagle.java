package chapter5;

public class Eagle extends Bird {

	public int fly(int height) {
		System.out.println("Bird is flying at " + height + " meters");
		return height;
	}
	/*
	 * @Override ettiği için aynı yöntem imzasına sahip olmalıdır ve access modifier ı child olan erişebilecek şekilde olmalı
	 * public int eat(int food) { // DOES NOT COMPILE
	 * System.out.println("Bird is eating " + food + " units of food");
	 * // return food;
	 * }
	 */
}
