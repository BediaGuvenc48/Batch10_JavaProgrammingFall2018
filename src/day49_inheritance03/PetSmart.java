package day49_inheritance03;

public class PetSmart extends Store {

	 public PetSmart () {
		 
		 super("Petshop", 155.99); 
		 	System.out.println("PetSmart no Args constructor");
		 
	 }
	 
	 
	 public PetSmart (double rent) {
		 
		 super ("PetStore"); 
		 
		
		// this(); -> not good. this(), super() both are designed to the at the top and if both of them are together, then will not work.
		 
		System.out.println("PetSmart constructor with rent: " + rent); 
		 
	 }
	 
	 
	 
	 
}
