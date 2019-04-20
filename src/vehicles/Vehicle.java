package vehicles;



public interface Vehicle {
	final int MAX_GEARS = 8;
	final int MAX_SPEED = 150;
	
	public void changeGear(int value);
	public void speedUp(int value);
	public void applyBreaks(int value);
	public void printStates();
	
	default void openTrunk() {
		System.out.println("From Vehicle");
		System.out.println("Trunk is opened!");
	}
	
	static void openHood() {
		System.out.println("Hood is opened!");
	}
}