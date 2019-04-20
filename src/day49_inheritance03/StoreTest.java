package day49_inheritance03;

public class StoreTest {
	
	public static void main(String[] args) {
		
		//there are 3 ways of creating object, 1. passing type, 2. passing rent 3. passing type & rent
		//we can not add an empty contructor, because we already created Constructor with Arguments and the compiler doesn't let 
		// us to create an empty constructor. 
		
		//Store store = new Store (); -> this will not compile, becasue of above explaination. 
		Store store1 = new Store ("Grocery"); 
		
		Store store2 = new Store (1000.49); 
		
		Store store3 = new Store ("Computer Store", 12335.55);  
		
		
		System.out.println(">>>>>>>>>>>>>PetSmart Object>>>>>>>>>>>>>>>");
		
		PetSmart petSmart1 = new PetSmart(); 
		
		//when we run it, it will go to the parent class, look for the contructor which accepts a String, run and then print whatever statement we have. 
		
		System.out.println(">>>>>>>>>>>>>PetSmart with Rent Object Creation>>>>>>>>>>>>>>>");
		PetSmart petSmart2 = new PetSmart(30885.99);
		
		System.out.println("Petsmart1 type " + petSmart1.getType());
		System.out.println("Petsmart2 type " + petSmart2.getType());
		
		System.out.println("Petsmart1 rent " + petSmart1.getRent());
		System.out.println("Petsmart2 rent " + petSmart2.getRent());
////		
		
		
		
		
	}

}
