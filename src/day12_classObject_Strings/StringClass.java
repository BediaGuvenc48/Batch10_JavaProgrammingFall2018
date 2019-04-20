package day12_classObject_Strings;

public class StringClass {

	public static void main(String[] args) {
		
		
	String name = "Khalili"; 
 
	/* 1. declaring a variable -> String name (name and type of variables are being declared  
	 *  	---> variable name is "name" and type is String 
	 *  	---> Hey java, I want you to create a variable called name 
	 *  	---> that can store String Object 
	 *  2. Assign value --> here it is String Object. 
	 *  	---> Anything in double quotes is String object with that value 
	 *  
	 */
	

	
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name);
		
		
		name = name.toUpperCase(); 
		System.out.println(name);
		
	
		String kha = new String ("Nematullah"); 
		
		System.out.println(kha);
		
		System.out.println(name.length());
		System.out.println("java".length()   );
		
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(3));
	
		if (name.charAt(0) == 'K') {
			System.out.println("K is the first letter");
		}else {
			System.out.println("K is not the first letter of your name");
		}
		
			char secondChar = name.charAt(1); 
			System.out.println(secondChar); 	
		
	}
}
