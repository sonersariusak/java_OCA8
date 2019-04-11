package chapter5.interfaces;

public interface Walk {

	public default int getSpeed() {
		return 5;
	}
}
