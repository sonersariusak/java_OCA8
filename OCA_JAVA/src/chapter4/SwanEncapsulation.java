package chapter4;

public class SwanEncapsulation {
	private int numberEggs; // private

	public int getNumberEggs() { // getter
		return numberEggs;
	}

	public void setNumberEggs(int numberEggs) { // setter
		if (numberEggs >= 0) // guard condition
			this.numberEggs = numberEggs;
	}
	
	//javaBeans kuralı
	
	private boolean playing;
	private String name;
	public boolean getPlaying() { return playing; } //	Satır boolean olduğu için isPlaying() olmalıdır. 
	public boolean isPlaying() { return playing; }
	public String name() { return name; } //	Satır uymaz getName olarak adlandırılmalıdır. 
	public void updateName(String n) { name = n; } //satırlarda setName olarak adlandırılmalıdır. 
	public void setname(String n) { name = n; } //satırlarda setName olarak adlandırılmalıdır. 
	

}
