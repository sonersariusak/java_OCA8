package chapter5.abstractClass;


public abstract class Bird extends Animal {// abstract olcudug icin extend ettigi classların metodlarını tanımalamasına gerek yoktur

	@Override
	public String getSurname() { // Eger abstract classtan kalıtım alıyorsa o metodları overlading yapabilir.
									// Bu sayede flamingo clasında overload edilmesine gerek yoktur
		return "";
	}
}
