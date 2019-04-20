package day41_classes_02_encapsulation;

public class HouseTester {
	
	public static void main(String[] args) {
		
		//Step 1) --> Create House Object and assign data to fields/instance variables 
		
		House yourHouse = new House(); 
			yourHouse.type = "Casttle"; 
			yourHouse.address = "100 Massachusets ave, Washington DC, 22300"; 
			yourHouse.bedrooms = 250; 
			yourHouse.year = 1990; 
		
		//Step 2) --> pass your house objects to printHouseInfo method. 
			
			printHouseInfo(yourHouse); 
			
		//Create one more object of House and pass it to method 
		
		
		House myHouse = new House(); 
			myHouse.type = "Town House"; 
			myHouse.address = "4000 Brussels Way, Woodbridge, VA, 22192"; 
			myHouse.bedrooms = 3; 
			myHouse.year = 2000; 
		
			printHouseInfo(myHouse); 
		
		House arshad = new House(); 
		
			arshad.type = "Single Family House"; 
			arshad.address = "5000 King Street, Alexandria, VA, 22003"; 
			arshad.bedrooms = 5; 
			arshad.year = 2015; 
		
			printHouseInfo(arshad); 
			 
		House h = buildAHouse("mahmood", "ahmad", 4, 2015); 
		
		System.out.println(h.address);
		System.out.println(h.type);
		System.out.println(h.bedrooms);
		System.out.println(h.year);
		
	}
	
	public static void printHouseInfo(House house) {
		
		System.out.println("===================");
		System.out.println("Type: " + house.type);
		System.out.println("Address: " + house.address);
		System.out.println("Bedrooms: " + house.bedrooms);
		System.out.println("Year: " + house.year);
		System.out.println("===================");
	
	}
	
/* Method buildAHouse: 
 - Params: 4 -> 2 Strings / 2 ints 
 - Return type: House 
 
 - In the method, using the values of the parameters build a new House object and return that
 
 
 */
	
	public static House buildAHouse(String type, String address, int rooms, int year) {
		
		House AiazHouse = new House(); 
		
		AiazHouse.type = "Single Family House"; 
		AiazHouse.address = "5000 Jone Smith Blvd, DC, 22003"; 
		AiazHouse.bedrooms = 4; 
		AiazHouse.year = 2010;
		
		return AiazHouse; 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

