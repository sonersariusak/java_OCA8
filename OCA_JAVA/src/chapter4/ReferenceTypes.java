package chapter4;

public class ReferenceTypes {
	public void fly(String s) {

		System.out.print("string ");

	}
	public void fly(Object o) {
		System.out.print("object ");
	}
	public static void main(String[] args) {

		ReferenceTypes r = new ReferenceTypes();
		r.fly("test"); //string var direk eslesme saglar
		r.fly(56); // int bulamaz ama object var o yüzden autoboxing olur ve onu yazdırır

	}
}
