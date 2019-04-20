package day46_this_isa;

public class PracticeRunner {
	
	public static void main(String[] args) {
		
		
		Practice eml = new Practice("Hi from CyberTek", "Mr. Muradil", "Khalili"); 
		
		Practice eml1 = new Practice("Hi from CyberTek", "Mr. Muradil"); 
			
		Practice eml2 = new Practice("Hi from CyberTek"); 
		
		Practice eml3 = new Practice(); 
		
			System.out.println(eml.toString());
			System.out.println(eml1.toString());
			System.out.println(eml2.toString());
			System.out.println(eml3.toString());
		
	}

}
