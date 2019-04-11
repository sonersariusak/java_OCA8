package chapter5.interfaces;

public class Cat implements Walk, Run {

	public static void main(String[] args) {
		System.out.println(new Cat().getSpeed());
	}

	@Override
	public int getSpeed() { // her iki interface te aynı metod var cıktıları farklı, ne cıkıp cıkmayacağı belli olmaz ancak getSpeed override edilmelidir.
		// TODO Auto-generated method stub
		return Run.super.getSpeed();
	}

}
