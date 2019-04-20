package day58_ExceptionHandling02;

public class ThrowDemo {

	
	public static void main(String[] args) {
		
		//throw new RuntimeException(); 
		
		//Manuallay/programmatically throw an exception 
		
		//throw new IllegalArgumentException("Invalid input"); 
		
		//throwing a message 

		vote( new Citizen("John Smith", 45)); 
		
		try {
		vote( new Citizen("Sarah Smith", 17)); 
		
		} catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void vote(Citizen citizen) {
		
		if (citizen.getAge() < 18) {
			throw new ArithmeticException(citizen.getName() + " is not eligible for voting"); 
			 
	   }
	
			System.out.println(citizen.getName() + " is eligible to vote");
	}
	
	
	/*
	 
	 throw 
	 
	 
	 */
	
	
}
