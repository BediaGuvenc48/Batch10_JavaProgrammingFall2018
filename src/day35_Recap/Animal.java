package day35_Recap;

public class Animal {
	
	static String color; 
	String breed; 
	double wieght; 
	
	//overloaded the constructors 
	public Animal () {
		
		System.out.println("No Args Constructor is Running");
	}
	
	public Animal (String color) {
		
		
		
		System.out.println("1 Arg Constructor");
	}
	
	public Animal (String color, String breed) {
		
		 
		this.breed = breed; 
		
		System.out.println("2 Args Contructor");
	}
	
	public Animal (String color, String breed, double weight) {
		
		
		this.breed = breed; 
		this.wieght = weight; 
		
		System.out.println("3 Args Constructor");
	}
	
	
	public void Run () {
		
		System.out.println("My dog is running");
	}
	
	public void Run (String donkey) {
		
		System.out.println("Donkey is used to transport items");
	}
	
	public void Run (String donkey, String color) {
		
		System.out.println("My grey donkey is hard working");
	}
	
	public static void Run (String donkey, String color, int age) {
		
		System.out.println("my grey donkey is 15 years old");
	}
	
	
	
	public static void main(String[] args) {
		
		Animal a = new Animal(); 
			a.breed = "Dog"; 
			a.color = "pink"; 
			a.wieght = 44.99; 
			
		System.out.println(a.breed);
		
		Animal b = new Animal ("Red"); 
			
		System.out.println(b.color);
		
		Animal c = new Animal ("Brown", "Cat", 33.55); 
		
			System.out.println(c.breed);
			System.out.println(c.wieght);
			
			System.out.println(b.breed);
			
//		Animal d = new Animal ("Green", "Tiger", 55.99, "Strong");  -> does not compile, since we don't have 4 Args Constructor 
			
			Animal x = new Animal();
			
			x.Run();
			
			x.Run("Lion", "Brown");
			
//			x.Run("xray", "purple", 35);
		
			Animal.Run("cat", "red", 5);
			
			
			
	}
	
	
	
	

}
