package chapter4;

public class MainTestChapter4 {

	public static void main(String[] args) {
		c(1);                    // 0 
		c(1, 2);                 // 1 
		c(1, 2, 3);                 // 2  
		c(1, new int[] {4, 5});     // 2  
		//c(1, null); null gönderebiliriz ancak int olduğu için exception atar
		
		run(11,22); //22

	}
	
	public void walk1() {}
	public final void walk2() {}
	public static final void walk3() {}
	public final static void walk4() {}
	//public modifier void walk5() {} // DOES NOT COMPILE
	//public void final walk6() {} // DOES NOT COMPILE
	final public void walk7() {}
	static private void walk8() {
		return;
	}
	
	static private String a() {
		return"";
	}

	private static int b() {
		int temp = (int) 9L; // DOES NOT COMPILE  int değere atama yapamazsın , ama cast edebilirsin
		return temp;  
		
	}
	
	public void w1() { }  
	//public void w2 { } // DOES NOT COMPILE  
	public void w3(int a) { }  
	//public void w4(int a; int b) { }  // DOES NOT COMPILE  
	public void w5(int a, int b) { } 
	
	
	public void zeroExceptions() { }
	public void oneException() throws IllegalArgumentException { }
	public void twoExceptions() throws
	IllegalArgumentException, InterruptedException { }
	
	public void walk1(int... nums) { }
	public void walk2(int start, int... nums) { }
	//public void walk3(int... nums, int start) { } // DOES NOT COMPILE
	//public void walk4(int... start, int... nums) { } // DOES NOT COMPILE varargs en sonda olmalı
	
	
	public static void c(int start, int... nums) {  
		System. out .println(nums.length);  
	}  
	
	 public static void run(int... nums) { 
		 System.out.println(nums[1]);  
	 }  
}
