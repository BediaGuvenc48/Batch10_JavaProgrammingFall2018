package day40_customclasses;

public class DogPractice {
	
	
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
	int size; 
	
	
	public void bark() {
		
		System.out.println("My dog is barking ever day !!!");
	}
	
	public void eat() {
		
		System.out.println("My dog is eating meat !!!");
	}
	
	public void run() {
		
		System.out.println("My dog is does not run !!!");
	}
	
	
	public static void main(String[] args) {
		
		DogPractice d = new DogPractice(); 
			d.breed = "German Sheeper"; 
			d.color = "Brown"; 
			d.size = 55; 
			
		d.bark(); 
		d.eat(); 
		d.run(); 
		System.out.println(d.breed);
		
	}
	
	
	

}
