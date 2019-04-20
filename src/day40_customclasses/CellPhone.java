package day40_customclasses;

public class CellPhone {
	
	
	 
	// Properties/Data/Information: before it was inside our main method and now we generate it inside our class
	 
	String brand; 
	String color; 
	double price; 
	
	//behavior / methods; 
	
	public void call() {
		
		System.out.println("Calling ****");
	}
	 
	public void text() {
		
		System.out.println("Sending a text message");
	}

}
