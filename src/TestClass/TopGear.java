package TestClass;

public class TopGear {
	
	public static void main(String[] args) {
		
		Car c = new Car(); 
		c.make = "Lexux"; 
		c.sportEidtion = false; 
		c.mileage = 15000; 
		c.year = 2018; 
		System.out.println(c.mileage);
			c.drive();
		System.out.println(c.mileage);
			c.drive();
		System.out.println(c.mileage);
		
		
	}

}
