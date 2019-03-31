package chapter4;

public class KoalaTester {
	public static void main(String[] args) {
		System.out.println(Koala.count);
		Koala.main(new String[0]); // call static method //mainde bir static metot olduğu için direk çağırabiliriz

		Koala k = new Koala();
		System.out.println(k.count); // k is a Koala tamamen yasaldır hata vermez. New diye class yaratıp çağırabiliriz
		k = null;
		System.out.println(k.count); // k is still a Koala
		
		Koala.count = 4;
		Koala koala1 = new Koala();
		Koala koala2 = new Koala();
		koala1.count = 6;
		koala2.count = 5;  //yeni bir nesne yatarıp static yönteme atama yaptığımızda en son atanan degeri yazdırır. hepsi aynı count degiskenini degistirir
		System.out.println(Koala.count); //5
	}
}
