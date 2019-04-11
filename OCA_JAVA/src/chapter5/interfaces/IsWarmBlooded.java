package chapter5.interfaces;

public interface IsWarmBlooded {

	boolean hasScales(); // aabstract metod

	public default double getTemperature() { // default olarak tanımlanabilir. Default metodda metod body vardır
		return 10.0;
	}

	default void getTempe() {} // bosta olsa bir body gerekli yoksa hata veir. access modifier publictir. Static veya final veya abstract olamaz
}
