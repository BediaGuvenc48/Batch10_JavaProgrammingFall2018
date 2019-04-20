package day40_customclasses;

public class Cars {

	String carName; 
	String model; 
	String VIN; 
	int year; 
	
	public void runCar() {
		
		System.out.println("My car is " + carName + " & the model is: " + model);
		System.out.println("It was made in: " + year + "& the VIN # is: " + VIN );
	}
	
	public void buyCar(double price) {
		
		System.out.println("I am buying " + carName + " with the price of: " + price );
	}
	
	public static void main(String[] args) {
		
		Cars germanCars = new Cars(); 
		
			germanCars.carName = "Benze"; 
			germanCars.model = "Super"; 
			germanCars.year = 2018; 
			germanCars.VIN = "VIN20303VIN2345535"; 
		
		Cars toyota = new Cars(); 
			toyota.carName = "Corolla"; 
			toyota.model = "XLE"; 
			toyota.year = 2017; 
			toyota.VIN = "VIN33254325VIERKSAFJ33"; 
		
		
		toyota.runCar();
		System.out.println();
		germanCars.runCar();
		
		germanCars.buyCar(2000.99);
				System.out.println();
		toyota.buyCar(17009.99);
		
		
		
	}
	

}
