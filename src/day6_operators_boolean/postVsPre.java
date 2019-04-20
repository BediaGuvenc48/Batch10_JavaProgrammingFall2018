package day6_operators_boolean;

public class postVsPre {
	
	public static void main(String [] args) {
		
		int number = 10; 
		int number2 = number++; //1.assign value to variable 
								//2.increase value by one 
		
		System.out.println("number2: " + number2);
		System.out.println("number: " + number); 
		
		int tomatoes = 5; 
		
		int bag = ++tomatoes; 
		
		System.out.println("Tomatoes: " + tomatoes);
		System.out.println("Bags: " + bag);
		
		
		
		
		
	}

}
