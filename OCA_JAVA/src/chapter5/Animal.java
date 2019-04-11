package chapter5;

public class Animal extends java.lang.Object {

	private int age;

	private String name;

	public Animal(int age) {
		super(); // Animal clasını hiçbir classı extend etmiyor ancak java lang object otomatik olarak extend ediliyor.
		this.age = age;
	}

	public Animal(int age, String name) {
		this.age = age;
		this.name = name;
	}
}
