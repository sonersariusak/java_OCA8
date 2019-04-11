package chapter5;

public class Gorilla extends Animal {

	public Gorilla(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}

	public Gorilla(int age, String name) {
		super(age, name); // extend edilen classın kurucusunu çağırmalıdır.
	}
}
