package chapter4;

//import static java.util.Arrays; // DOES NOT COMPILE //static olmamalı zaten static
import static java.util.Arrays.asList;

//static import java.util.Arrays.*; // DOES NOT COMPILE sıra yanlıs
public class BadStaticImports {
	public static void main(String[] args) {
//		Arrays.asList("one"); // DOES NOT COMPILE zaten aslist i ekledik ancak burda tekrar Arrays i cagırdımız icin hata alıyoruz
	}
}
