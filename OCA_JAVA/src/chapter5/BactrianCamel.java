package chapter5;

public class BactrianCamel extends Camel {

	// @Override
	// private int getNumberOfHumps() { // DOES NOT COMPILE
	// return 2;
	// }
	// iki sebepten dolayı derlenmez,
	// 1. sebep access modifier az kalıtım alınan metot kadar erişilebilir olmalıdır
	// 2. dönüş tipi kalıtım alınan metoddaki gibi olmalıdır
	
	//Exception kısmında
	// ancak her iki classtaki access modifierlar private olursa, iki metodda gizlendiği için farklı metotlarmıs gibi algılar ve override etmez
}
