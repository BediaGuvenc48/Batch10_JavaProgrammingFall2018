package day42_classes_03_Canstructor;

public class carMax extends Car {
	
	public static void main(String[] args) {
		
		Car carOne = new Car (); 
		
		
		
		
			carOne.setMake("Accura");
			carOne.setMake("ILX");
			carOne.setType("Sedan");
			carOne.setSpeed(35);
			
		System.out.println("Make: " + carOne.getMake());
		System.out.println("Current Speed: " + carOne.getSpeed());
		
			carOne.accelerate(30);
		System.out.println("Current Speed: " + carOne.getSpeed());
		
		Car carTwo = new Car(); 
			System.out.println("Car 2 make: " + carTwo.getMake());
			System.out.println("Car 2 model: " + carTwo.getModel()); 
			System.out.println("Car 2 type: " + carTwo.getType());
			
		Car carThree = new Car("Coupe", "Ford", "Mustang"); 
		
			System.out.println("Car 3 Type: " + carThree.getType());
			System.out.println("Car 3 Make: " + carThree.getMake());
			System.out.println("Car 3 Model: " + carThree.getModel());
			

		
			 
	}
	
	
	
	
	
	

}
