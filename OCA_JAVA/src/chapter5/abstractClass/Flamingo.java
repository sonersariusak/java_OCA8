package chapter5.abstractClass;

public class Flamingo extends Bird { // abstract olmayan class miras aldıgı butun abstract classların metodlarını overloading etmesi gerekir

	@Override
	public String getName() {
		return "Flamingo";
	}
}
