package chapter4;

public class Hamster {
	
	
	private String color;
	private int weight;

	public Hamster(int weight) { // first constructor
		
		
		this.weight = weight;
		color = "brown";
		//Hamster(weight, "brown");     // DOES NOT COMPILE  direk cagırılmaz ama önüne new diyip yeni bir örneğini olusturup cagırılabilir
		//yeni bir örnegini cagırdıgı için bunu istemiyoruz var olan constracter için sunu yapmalıyız
		
		//ancak
		//this(weight, "brown"); bu sadece ilk satırda calısır
		
	}

	//overloading
	public Hamster(int weight, String color) { // second constructor
		this.weight = weight;
		this.color = color;
	}
}
