package day40_customclasses;

public class Dog {
	
	
	/*Dog class/templates:  
 		Properties/data/Information: 
 			- breed 
 			- color 
 			- size 
 		
 		Behavior:
 		 	- bark 
 		 	- eat 
 		 	- run */
	
	
	String breed; 
	String color; 
	double size; 
	
	
	public String getBreed() {
		
		return breed; 
	}
	
	public void setBreed(String breed) {
		
		this.breed = breed;
		
	}	
	
//	
//	String breed; 
//	String color; 
//	int size; 
//	
	
	public void bark() {
		
		System.out.println("My dog is barking every day");

		
	}
	
	public void eat() {
		System.out.println("My dog is eating meat");
		
	}
	
	public void run() {
		
		System.out.println("My Dog is running every friday");
	}
	
	
	/*String breed; 
	String color; 
	int size; 
	
	
 
		public void bark(){
			
			System.out.println("Dog is barking Whoof Whoof Java");
		}
		
		public void eat() {
			System.out.println("Dog is eating");
		}
		
		public void run() {
			
			System.out.println("Dog is running");
		}*/

}
