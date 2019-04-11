package chapter5.interfaces;


public class Bear implements HasTail, HasWhiskers { // eger interfaceslerde aynı metod tanımlı olsa bile hata vermez bir kopya olarak görür

	@Override
	public int getNumberOfWhiskers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTailLength() {
		return 0;
		// TODO Auto-generated method stub

	}

	@Override
	public int getNumberOfWhiskers(int a) { // eger yöntem imzaları farklı isede override eder. Interfacelere bak
		// TODO Auto-generated method stub
		return 0;
	}
}
