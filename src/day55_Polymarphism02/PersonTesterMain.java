package day55_Polymarphism02;

public class PersonTesterMain {
	
		// Create MainRunner class with main method 
		// Create a method printPerson that take Person return nothing
		// Create overloading method that take object and return nothing
		
		// in main method 
		// Create a Person Object with Object reference 
		// Create a Person object with Person reference 
		
		// try to pass your object to the method and see which one 
		// will be called 
		
		// OPTIONAL : inside your second method try to access
		// person related methods other than toString 
	
	
	public static void printPerson(Person p) {
		System.out.println("Person from the person method");
		System.out.println(p);
	}
	
//	public static void printPerson(Object o) {
//		System.out.println("Object from the printedPerson method");	
//		System.out.println(o);
//		 
//	}
	
	public static void main(String[] args) {
		
	Person p = new Person("John", 23); 
		
//		p.setName("Ab"); 
//		System.out.println(p.getName()); 
//				
//		printPerson(p); 
//		

	Object o = new Person("Serik", 27); //this one is just the reference of the Person 
		
//		printPerson(o); 
//		o.toString(); 
	
	
	//Casting 
	
	Person p3 = (Person) p; 
	
	printPerson(p); 
	//printPerson(o); --> This was not working because we commented the Ojbect method. 
	//now we have to cast it and create the object of Person and then pass that method.   
	
	printPerson(p3); 
	
		
	}	
	
}
