package vehicles;


public class IlleagalSpeedException extends RuntimeException{
	public IlleagalSpeedException() {
		System.out.println("Illeagal speed!");
	}
}