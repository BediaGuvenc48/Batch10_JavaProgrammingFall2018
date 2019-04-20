package day41_classes_02_encapsulation;

public class Cat {
	
	String gender; 
	String breed; 
	boolean shy; 
	int age; 
	String color; 
	String behaviour; 
	
	
	public Cat (String gender1, String breed1, int age1) {
		
		gender = gender1; 
		breed = breed1; 
		if (age1 < 0) {
			System.out.println("Invalid age");
		}
		age = age1; 
		
	}
	
	
	public Cat(String gender1, String breed1) {
		
		System.out.println("Constructor by default running");
		
		gender = gender1; 
		breed = breed1; 
	}
	
	public void eat() {
		System.out.println("Cat is eating");
	}

}
