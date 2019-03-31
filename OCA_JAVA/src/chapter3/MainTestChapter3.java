package chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainTestChapter3 {

	public static void main(String[] args) {
		System.out.println(1 + 2); // 3
		System.out.println("a" + "b"); // ab
		System.out.println("a" + "b" + 3); // ab3
		System.out.println(1 + 2 + "c"); // 3c

//		-----------------------------------------------------------------

		String s = "1"; // s currently holds "1"
		s += "2"; // s currently holds "12"
		s += 3; // s currently holds "123"
		System.out.println(s); // 123

//		-----------------------------------------------------------------
		// String Methods

		String string = "animals";
		System.out.println(string.length()); // 7

		String animals = "animals";
		System.out.println(animals.charAt(0)); // a
		System.out.println(animals.charAt(6)); // s
		// System.out.println(animals.charAt(7)); // throws exception

		String animal = "animal";
		System.out.println(animal.indexOf('a')); // 0
		System.out.println(animal.indexOf("al")); // 4
		System.out.println(animal.indexOf('a', 4)); // 4
		System.out.println(animal.indexOf("al", 5)); // -1

		System.out.println(animals.substring(3)); // mals
		System.out.println(animals.substring(string.indexOf('m'))); // mals
		System.out.println(animals.substring(3, 4)); // m
		System.out.println(animals.substring(3, 7)); // mals

		System.out.println(animals.substring(3, 3)); // empty string
		// System.out.println(animals.substring(3, 2)); // throws exception
		// System.out.println(animals.substring(3, 8)); // throws exception

		System.out.println(string.toUpperCase()); // ANIMALS
		System.out.println("Abc123".toLowerCase()); // abc123

		System.out.println("abc".equals("ABC")); // false
		System.out.println("ABC".equals("ABC")); // true
		System.out.println("abc".equalsIgnoreCase("ABC")); // true

		System.out.println("abc".startsWith("a")); // true
		System.out.println("abc".startsWith("A")); // false
		System.out.println("abc".endsWith("c")); // true
		System.out.println("abc".endsWith("a")); // false

		System.out.println("abc".contains("b")); // true
		System.out.println("abc".contains("B")); // false

		System.out.println("abcabc".replace('a', 'A')); // AbcAbc
		System.out.println("abcabc".replace("ab", "AB")); // ABcABc

		System.out.println(" abc".trim()); // abc
		System.out.println("\t   a b c\n".trim()); // a b c

		// Method Chaining

		String start = "AniMaL   ";
		String trimmed = start.trim(); // "AniMaL"

		String lowercase = trimmed.toLowerCase(); // "animal"
		String result = lowercase.replace('a', 'A'); // "Animal"

		System.out.println(result);

		// Bu kodu method zincirleme ilede yapabiliriz.

		String result1 = "AniMaL   ".trim().toLowerCase().replace('a', 'A');

		System.out.println(result1);

		// immutable örnek

		String a = "abc";
		String b = a.toUpperCase();
		b = b.replace("B", "2").replace('C', '3'); // değer atanır
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		// Stringbuilder

		StringBuilder alpha = new StringBuilder();
		for (char current = 'a'; current <= 'z'; current++)
			alpha.append(current);
		System.out.println(alpha);

		// stringbuilder referans
		StringBuilder ab = new StringBuilder("abc");
		StringBuilder bb = ab.append("de");
		bb = bb.append("f").append("g");
		System.out.println("a=" + ab);
		System.out.println("b=" + bb);

		// charAt(), indexOf(), length(), and substring()
		StringBuilder sb = new StringBuilder("animals");

		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al")); // string e dönüyor ve artık değişmez oluyo

		int len = sb.length();
		char ch = sb.charAt(6); // char için 0 dan başlar

		System.out.println(sub + " " + len + " " + ch);

		StringBuilder sb1 = new StringBuilder().append(1).append('c'); // birden fazla atama işlemi yapılabilir
		sb1.append("-").append(true);
		System.out.println(sb1); // 1c-true

		StringBuilder sb2 = new StringBuilder("animals"); // verilen indexe bir karakter ekle
		sb2.insert(7, "-"); // sb2 = animals
		sb2.insert(0, "-"); // sb2 = -animals
		sb2.insert(4, "-");
		// sb2.insert(15, "-"); // olmayan indexe ekleme yapılmaz exception alırsın
		System.out.println(sb2);

		StringBuilder ssb = new StringBuilder("abcdef");
		ssb.delete(1, 3); //
		// ssb.deleteCharAt(5); // throws an exception

		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		StringBuilder three = one.append("a");
		System.out.println(one == two); // false
		System.out.println(one == three); // true //three one dan referans alıyor bu yüzden ikisi aynı stringBuilder
											// objesi

		String x = "Hello World";
		String z = " Hello World".trim();
		System.out.println(x == z); // false

		String xx = new String("Hello World");
		String yy = "Hello World";
		System.out.println(xx == yy); // false

		String x1 = "Hello World";
		String z1 = " Hello World".trim();
		System.out.println(x1.equals(z1)); // true

		// nesnelerde referans eşitliği kontrol edilir.
		MainTestChapter3 t1 = new MainTestChapter3();
		MainTestChapter3 t2 = new MainTestChapter3();
		MainTestChapter3 t3 = t1;
		System.out.println(t1 == t1); // true
		System.out.println(t1 == t2); // false
		System.out.println(t1.equals(t2)); // false

//		-----------------------------------------------------------------

		// ARRAYS
		// Kullanım şekilleri
		int[] numAnimals;
		int[] numAnimals2;
		int numAnimals3[];
		int numAnimals4[];

		int[] ids, types;

		// int ids[], types; parantez değişince ids sadece dizi oldu

		String[] strings = { "stringValue" };
		Object[] objects = strings;
		String[] againStrings = (String[]) objects;
		// againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
		// objects[0] = new StringBuilder(); // careful! Exception atar

		String[] birds = new String[6];
		System.out.println(birds.length); // 6

		int[] numbers = new int[10]; // 0-9 arasında indexler için
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = i + 5;
		// numbers[10] = 3; //10. index yok
		// numbers[numbers.length] = 5; //number.lenght=10 index yok
		// for (int i = 0; i <= numbers.length; i++) numbers[i] = i + 5; //uzunluk her
		// zaman dizi sayısından bir fazladır.

		int[] numberss = { 6, 9, 1 };
		Arrays.sort(numberss);
		for (int i = 0; i < numberss.length; i++)
			System.out.print(numberss[i] + " ");

		String[] stringss = { "10", "9", "100" }; // harf sıralamasına gore sıralar
		Arrays.sort(stringss);
		for (String str : stringss)
			System.out.print(str + " "); // 10 100 9

		int[] num = { 2, 4, 6, 8 };
		System.out.println(Arrays.binarySearch(num, 2)); // 0
		System.out.println(Arrays.binarySearch(num, 4)); // 1
		System.out.println(Arrays.binarySearch(num, 1)); // -1
		System.out.println(Arrays.binarySearch(num, 3)); // -2
		System.out.println(Arrays.binarySearch(num, 9)); // -5 //bulamazsa hangi sıraye geleceğıni döndürür

		int[] nums = new int[] { 3, 2, 1 }; // sıralı olmadığı için tahmin edilemez sonuclar döndü
		System.out.println(Arrays.binarySearch(nums, 2));
		System.out.println(Arrays.binarySearch(nums, 3));

//		-----------------------------------------------------------------

		int[][] vars1; // 2D array
		int vars2[][]; // 2D array
		int[] vars3[]; // 2D array
		int[] vars4[], space[][]; // a 2D AND a 3D array

		String[][] rectangle = new String[3][2]; // sütun satır

		int[][] differentSize = { { 1, 4 }, { 3 }, { 9, 8, 7 } };

		int[][] argss = new int[4][];
		argss[0] = new int[5];
		argss[1] = new int[3];

		int[][] twoD = new int[3][2];
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++)
				System.out.print(twoD[i][j] + " "); // print element
			System.out.println(); // time for a new row
		}

		for (int[] inner : twoD) { // AYNI İŞLEMİ YAPAR DAHA AZ KARMAŞIK
			for (int num3 : inner)
				System.out.print(num3 + " ");
			System.out.println();

		}

//		-----------------------------------------------------------------		

		ArrayList<String> list4 = new ArrayList<String>();
		ArrayList<String> list5 = new ArrayList<>();

		List<String> list6 = new ArrayList<>();
		// ArrayList<String> list7 = new List<>(); // DOES NOT COMPILE

		ArrayList list = new ArrayList();
		list.add("hawk"); // [hawk]
		list.add(Boolean.TRUE); // [hawk, true]
		System.out.println(list); // [hawk, true]

		ArrayList<String> safer = new ArrayList<>(); // sadece string türünde
		safer.add("sparrow");
		// safer.add(Boolean.TRUE); // DOES NOT COMPILE

		List<String> bird = new ArrayList<>();
		bird.add("hawk"); // [hawk]
		bird.add(1, "robin"); // [hawk, robin]
		bird.add(0, "blue jay"); // [blue jay, hawk, robin]
		bird.add(1, "cardinal"); // [blue jay, cardinal, hawk, robin]
		System.out.println(bird); // [blue jay, cardinal, hawk, robin]

		List<String> brds = new ArrayList<>();
		brds.add("hawk"); // [hawk]
		brds.add("hawk"); // [hawk, hawk]
		System.out.println(brds.remove("cardinal")); // prints false
		System.out.println(brds.remove("hawk")); // prints true
		System.out.println(brds.remove(0)); // prints hawk
		System.out.println(brds); // []

		List<String> birdss = new ArrayList<>();
		birdss.add("hawk"); // [hawk]
		System.out.println(birdss.size()); // 1
		birdss.set(0, "robin"); // [robin]
		System.out.println(birdss.size()); // 1
		// birdss.set(1, "robin"); // IndexOutOfBoundsException

		System.out.println(birdss.isEmpty()); // true
		System.out.println(birdss.size()); // 0
		birdss.add("hawk"); // [hawk]
		birdss.add("hawk"); // [hawk, hawk]
		System.out.println(birdss.isEmpty()); // false
		System.out.println(birdss.size()); // 2

		birdss.clear(); // []
		System.out.println(birdss.isEmpty()); // true
		System.out.println(birdss.size()); // 0

//		-----------------------------------------------------------------

		List<String> br = new ArrayList<>();
		br.add("hawk"); // [hawk]
		System.out.println(br.contains("hawk")); // true
		System.out.println(br.contains("robin")); // false

		List<String> o = new ArrayList<>(); // karşılaştırmayı içindeki elemanları karşılastırıp yapar
		List<String> t = new ArrayList<>();
		System.out.println(o.equals(t)); // true
		o.add("a"); // [a]
		System.out.println(o.equals(t)); // false
		t.add("a"); // [a]
		System.out.println(o.equals(t)); // true
		o.add("b"); // [a,b]
		t.add(0, "b"); // [b,a]
		System.out.println(o.equals(t)); // false

//		-----------------------------------------------------------------

//		wrapper

		int primitive = Integer.parseInt("123");
		Integer wrapper = Integer.valueOf("123");

		// int bad1 = Integer.parseInt("a"); // throws NumberFormatException
		// Integer bad2 = Integer.valueOf("123.45"); // throws NumberFormatException

//		-----------------------------------------------------------------

//		Autoboxing ..  tam anlaşılmadı

		List<Double> weights = new ArrayList<>();
		weights.add(50.5); // [50.5]
		weights.add(new Double(60)); // [50.5, 60.0]
		weights.remove(50.5); // [60.0]
		double first = weights.get(0); // 60.0

		List<Integer> heights = new ArrayList<>();
		heights.add(null);
		// int h = heights.get(0); // NullPointerException

		List<Integer> listNum = new ArrayList<>();
		listNum.add(1);
		listNum.add(2);
		listNum.remove(1);
		System.out.println(listNum);

		List<String> listConvert = new ArrayList<>();
		listConvert.add("hawk");
		listConvert.add("robin");
		Object[] objectArray = listConvert.toArray();
		System.out.println(objectArray.length); // 2
		String[] stringArray = listConvert.toArray(new String[0]);
		System.out.println(stringArray.length); // 2

		String[] array = { "hawk", "robin" }; // [hawk, robin]
		List<String> lst = Arrays.asList(array); // returns fixed size list

		// sorting
		List<Integer> numList = new ArrayList<>();
		numList.add(99);
		numList.add(5);
		numList.add(81);
		Collections.sort(numList);
		System.out.println(numList); // [5, 81, 99]

//		-----------------------------------------------------------------

//		DATE and TIME 

		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());

		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20); // her ikiside aynı tarihi olusturur
		LocalDate date2 = LocalDate.of(2015, 1, 20);

		LocalTime time1 = LocalTime.of(6, 15); // hour and minute
		LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
		LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds

		LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
		LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);

		// LocalDate d = new LocalDate(); // DOES NOT COMPILE

		// LocalDate.of(2015, Month.JANUARY, 32) ;    // throws DateTimeExcept

		// immutable
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);

		System.out.println(date); // 2014-01-20
		date = date.plusDays(2);
		System.out.println(date); // 2014-01-22
		date = date.plusWeeks(1);
		System.out.println(date); // 2014-01-29
		date = date.plusMonths(1);
		System.out.println(date); // 2014-02-28
		date = date.plusYears(5);
		System.out.println(date); // 2019-02-28

		LocalDate dt = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5, 15);
		LocalDateTime dateTime = LocalDateTime.of(dt, time);
		System.out.println(dateTime); // 2020-01-20T05:15
		dateTime = dateTime.minusDays(1);
		System.out.println(dateTime); // 2020-01-19T05:15
		dateTime = dateTime.minusHours(10);
		System.out.println(dateTime); // 2020-01-18T19:15
		dateTime = dateTime.minusSeconds(30);
		System.out.println(dateTime); // 2020-01-18T19:14:30

		LocalDate d = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime times = LocalTime.of(5, 15);
		LocalDateTime dTime = LocalDateTime.of(d, times).minusDays(1).minusHours(10).minusSeconds(30);

		LocalDate lDate = LocalDate.of(2020, Month.JANUARY, 20); // immutable
		date.plusDays(10);
		System.out.println(lDate);

		LocalDate localD = LocalDate.of(2020, Month.JANUARY, 20);
		// localD = localD.plusMinutes(1); // DOES NOT COMPILE

		LocalDate strt = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		performAnimalEnrichment(strt, end);

		LocalDate startt = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate endd = LocalDate.of(2015, Month.MARCH, 30);
		Period period = Period.ofMonths(1); // create a period
		performAnimalEnrichmentPeriod(startt, endd, period);

		Period annually = Period.ofYears(1); // every 1 year
		Period quarterly = Period.ofMonths(3); // every 3 months
		Period everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
		Period everyOtherDay = Period.ofDays(2); // every 2 days
		Period everyYearAndAWeek = Period.of(1, 0, 7); // every year and 7 days

		Period wrong = Period.ofYears(1).ofWeeks(1); // every week

		Period wrng = Period.ofYears(1);
		wrng = Period.ofWeeks(7);

		LocalDate localDate = LocalDate.of(2015, 1, 20);
		LocalTime localTime = LocalTime.of(6, 15);
		LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
		Period prd = Period.ofMonths(1);
		System.out.println(localDate.plus(prd)); // 2015-02-20
		System.out.println(localDateTime.plus(prd)); // 2015-02-20T06:15
		// System.out.println(localTime.plus(prd)); // UnsupportedTemporalTypeException

		// --------------------------------------------------------

		LocalDate de = LocalDate.of(2020, Month.JANUARY, 20);
		System.out.println(de.getDayOfWeek()); // MONDAY
		System.out.println(de.getMonth()); // JANUARY
		System.out.println(de.getYear()); // 2020
		System.out.println(de.getDayOfYear()); // 20

		LocalTime tt = LocalTime.of(11, 12, 34);
		LocalDateTime dtt = LocalDateTime.of(de, tt);
		System.out.println(de.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(tt.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(dtt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

//		2020-01-20
//		11:12:34
//		2020-01-20T11:12:34

		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(shortDateTime.format(de)); // 1/20/20
		System.out.println(shortDateTime.format(de)); // 1/20/20
		// System.out.println(shortDateTime.format(time)); //
		// UnsupportedTemporalTypeException

		LocalDate ld = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime tm = LocalTime.of(11, 12, 34);
		LocalDateTime ldt = LocalDateTime.of(ld, tm);
		DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(shortF.format(ldt)); // 1/20/20 11:12 AM
		System.out.println(mediumF.format(ldt)); // Jan 20, 2020 11:12:34 AM
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
		System.out.println(ldt.format(f)); // January 20, 2020, 11:12
		
		DateTimeFormatter ff = DateTimeFormatter.ofPattern("hh:mm");
		ff.format(ldt);
		//ff.format(ld); exception atar
		ff.format(tm);
		
		
		DateTimeFormatter fff = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate datee = LocalDate.parse("01 02 2015", fff);
		LocalTime timee = LocalTime.parse("11:22");
		System.out.println(datee); // 2015-01-02
		System.out.println(timee); // 11:22
	}

	private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
		LocalDate upTo = start;
		while (upTo.isBefore(end)) { // check if still before end
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plusMonths(1); // add a month
		}
	}

	private static void performAnimalEnrichmentPeriod(LocalDate start, LocalDate end, Period period) { // uses the
																										// generic
																										// period
		LocalDate upTo = start;
		while (upTo.isBefore(end)) {
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plus(period); // adds the period
		}
	}

}
