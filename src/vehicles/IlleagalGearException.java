package vehicles;


public class IlleagalGearException extends RuntimeException{
	public IlleagalGearException() {
		System.out.println("Wrong gear!");
	}
	
	public IlleagalGearException(String m) {
		System.out.println(m);
	}
}