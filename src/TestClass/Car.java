package TestClass;

public class Car {
	
	String make; 
	int year; 
	boolean sportEidtion; 
	int mileage; 
	
	
	public void drive() {
		
		System.out.println(year + " " + make + " driving.");
		
		mileage+= 10; 
	}
	
	public void drive (String destination) {
	
		System.out.println(year + " " + make + " driving." + destination);
		
		mileage+= 10; 
		
	}
	
	public void drive (int miles) {
	
		System.out.println(year + " " + make + " driving." + miles + " Miles");
		
	}
	
}
