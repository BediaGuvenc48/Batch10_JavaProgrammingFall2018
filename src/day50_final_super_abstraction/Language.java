package day50_final_super_abstraction;

public class Language {
	
	public String name = "General Language"; 
	
	public static  void staticMethod() {
		
		System.out.println("Language - static Method");
		
	}
	
	public void printName() {
		
		System.out.println("Language: " + name); 
		
		staticMethod(); //this possible to put static method inside the printName method 
		
	}

}
