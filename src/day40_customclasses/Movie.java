package day40_customclasses;

public class Movie {
	
	
	/*
	  	This is a template, you have to run it from a main method and it will pick the values 
	  	from this template and you can call it from the main method. 
	 */
	String name; 
	int length;

	
	public void watch() {
		
		System.out.println("Watching " + name);
		System.out.println("It is " + length + " minutes");
	}
	
	public void buy(double price) {
		
		System.out.println("Buying " + name + " for $" + price);
	}

			 

}
