package vehicles;



public class Toyota implements Vehicle {
	int speed = 0;
	int gear = 1;
	
	@Override
	public void changeGear(int value) {
		if(value > 0 && value < MAX_GEARS) {
			gear = value;
		} else {
			throw new IlleagalGearException();
		}
	}

	@Override
	public void speedUp(int value) {
		speed = speed + value;
		if(value > MAX_SPEED) {
			throw new IlleagalSpeedException();
		}
	}

	@Override
	public void applyBreaks(int value) {
		speed = speed - value;
	}
	
	public void printStates() {
		System.out.println("speed : "+speed);
		System.out.println("gear : "+gear);
	}
	
	public void openTrunk() {
		System.out.println("From Toyota");
		System.out.println("Trunk is opened!");
	}
	

}