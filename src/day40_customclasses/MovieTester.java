package day40_customclasses;

public class MovieTester {
	
	public static void main(String[] args) {
		
	/*
	  	The values are assigned from here, the template will not show anything until 
	  	you don't assign them from here in main method. 
	 */
		
		Movie internship = new Movie(); 
		
		internship.name = "Internship"; 
		internship.length = 190; 
		internship.buy(10.55);
		
		Movie gladiator = new Movie();
		gladiator.name = "Gladiator"; 
		gladiator.length = 150;
		gladiator.buy(33.99);
		
		Movie starWars = new Movie(); 
		starWars.name = "Star Wars"; 
		starWars.length = 120; 
		starWars.buy(99.99);
		
		System.out.println(internship.name);// the result will be printed null, because we didn't assign value yet
		System.out.println(internship.length);//will be 0 
		System.out.println();
		
		internship.watch();
							System.out.println();
		gladiator.watch();
							System.out.println();
		starWars.watch();
		
	}

}
