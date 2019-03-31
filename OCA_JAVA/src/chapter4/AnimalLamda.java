package chapter4;

public class AnimalLamda {
	private String species;
	private boolean canHop;
	private boolean canSwim;

	public AnimalLamda(String speciesName, boolean hopper, boolean swimmer) {
	species = speciesName;
	canHop = hopper;
	canSwim = swimmer;
	}

	public boolean canHop() {
		return canHop;
	}

	public boolean canSwim() {
		return canSwim;
	}

	public String toString() {
		return species;
	}
}
