package day40_customclasses;

public class DogRunnerTest {
	
	public static void main(String[] args) {
	
		
		Dog myDog = new Dog(); 
		
			myDog.breed = "German Shaper"; 
			myDog.color = "Black"; 
			myDog.size = 50; 
			
		myDog.bark();
		myDog.eat(); 
		myDog.run();
		
		System.out.println(myDog.breed);
		System.out.println(myDog.color);
		System.out.println(myDog.size);
		
		
		
	}

}
