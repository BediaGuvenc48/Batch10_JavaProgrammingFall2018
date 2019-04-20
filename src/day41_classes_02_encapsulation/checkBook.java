package day41_classes_02_encapsulation;

public class checkBook {
	
	/*
	 * Step 1: 
	 * Create 3 local variables that can hold String name, int Date, double $Amount;
	 * make sure it is encapsulated  
	 * 
	 * Step 2: 
	 * - use the metho Geter & Setter to access your private information 
	 */
	
	private String name; 
	private int date; 
	private double $Amount; 
	
	
	public String getName() {
		
		return name;   
	}
	
	public void setName(String newName) {
		
		name = newName; 
	}
	
	public int getDate() {
		
		return date; 
	}
	
	public void setDate(int newDate) {
		
		date = newDate; 
	}
	
	public double get$Amount() {
		
		return $Amount; 
	}
	
	public void set$Ammount(double new$Amount) {
		
		$Amount = new$Amount; 
	}

	
	
}
