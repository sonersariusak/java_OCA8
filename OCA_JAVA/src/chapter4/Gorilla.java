package chapter4;

public class Gorilla {
	public static int count;
	public static void addGorilla() { count++; }
	public void babyGorilla() { count++; }
	public void announceBabies() { //static metodlar, static olmayan metodlardan cagırabilir ancak tam tersi olamaz
	addGorilla();
	babyGorilla();
	}
	public static void announceBabiesToEveryone() {
	addGorilla();
	//babyGorilla(); // DOES NOT COMPILE because static değil
	}
	public int total;
	//public static average = total / count; // DOES NOT COMPILE //total instance varible oldugu icin derlenmez
}
