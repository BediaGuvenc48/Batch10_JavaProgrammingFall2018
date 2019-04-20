package day50_final_super_abstraction;

public class LanguageTests {
	
	public static void main(String[] args) {
		
		ProgrammingLanguage pl = new ProgrammingLanguage(); 
		
		System.out.println(pl.name);
		
			pl.printProgrammingName(); 
			
			pl.staticMethod(); 
			
			pl.printName(); //it will print whatever class is close to it. 	
							//Language: General Language will be printed, printName is running from Parent class 
			
		
	}

}
