package chapter4;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {
	public static void main(String[] args) {
		List<AnimalLamda> animals = new ArrayList<AnimalLamda>(); // list of animals
		 animals.add(new AnimalLamda("fish", false, true));
		 animals.add(new AnimalLamda("kangaroo", true, false));
		 animals.add(new AnimalLamda("rabbit", true, false));
		 animals.add(new AnimalLamda("turtle", false, true));
		
		 //print(animals, new CheckIfHopper()); // pass class that does check
		 print(animals, a -> a.canHop()); // lamda ifadesi
		 print(animals, a -> a.canSwim()); // lamda ifadesi
		 print(animals, a -> ! a.canSwim());  // lamda ifadesi
		 }
		 private static void print(List<AnimalLamda> animals, CheckTrait checker) {
		 for (AnimalLamda animal : animals) {
		 if (checker.test(animal)) // the general check
		 System.out.print(animal + " ");
		 }
		 System.out.println();
		 
		 
//		 print(() -> true); // 0 parameters
//		 print(a -> a.startsWith("test")); // 1 parameter
//		 print((String a) -> a.startsWith("test")); // 1 parameter
//		 print((a, b) -> a.startsWith("test")); // 2 parameters
//		 print((String a, String b) -> a.startsWith("test")); // 2 parameters
		 
//		 print(a, b -> a.startsWith("test")); // DOES NOT COMPILE
//		 print(a -> { a.startsWith("test"); }); // DOES NOT COMPILE
//		 print(a -> { return a.startsWith("test"); }); // DOES NOT COMPILE
		 
		 //(a, b) -> { int a = 0; return 5;}     // DOES NOT COMPILE  int a diye tanımlayamıyoruz
		 //(a, b) -> { int c = 0; return 5;}
		}
}
