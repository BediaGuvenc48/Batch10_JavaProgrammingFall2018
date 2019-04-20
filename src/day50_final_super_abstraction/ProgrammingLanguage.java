package day50_final_super_abstraction;

public class ProgrammingLanguage extends Language{
	
	//variable hiding. Hiding of parent class name variable 
	
	public String name = "Programming Language - Java "; 
	
	public void printProgrammingName() {
		
		System.out.println("Language L: " + name);
		
		//System.out.println(super.name);//this will go all the way to the parent verision and use it 
		
		
	}
	
	
	//Hidding static method 
	public static void staticMethod() {
		
		System.out.println("Programming Language - static Method");
		
		
	} 	
	
	public void printName() {
		
		System.out.println("Language: " + name);
		
		staticMethod(); 
	}
	

}
