package chapter4;

import java.util.*;
import java.util.function.*;

public class PredicateSearch {
	public static void main(String[] args) {
		List<AnimalLamda> animals = new ArrayList<AnimalLamda>();
		animals.add(new AnimalLamda("fish", false, true));

		print(animals, a -> a.canHop());

		List<String> bunnies = new ArrayList<>();
		bunnies.add("long ear");
		bunnies.add("floppy");
		bunnies.add("hoppy");
		System.out.println(bunnies); // [long ear, floppy, hoppy]
		bunnies.removeIf(s -> s.charAt(0) != 'h');  //sadece 1 adet removeIF metdou var
		System.out.println(bunnies); // [hoppy]
	}

	private static void print(List<AnimalLamda> animals, Predicate<AnimalLamda> checker) {
		for (AnimalLamda animal : animals) {
			if (checker.test(animal))
				System.out.print(animal + " ");
		}
		System.out.println();
	}
}
