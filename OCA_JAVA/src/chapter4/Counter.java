package chapter4;

public class Counter {
	private static int count;   
	
	public Counter() {  
	count++;   //her obje yaratıldıgında count 1 artar  
	} 
	public static void main(String[] args) {     
	Counter c1 = new Counter();  
	Counter c2 = new Counter();     
	Counter c3 = new Counter();     
	System.out.println(count);          // 3   

	}  
}
