package day14_StringManipulation;

public class StringAndValues {
	
	static String str; 
	
	// we are putting a main method, it is the start of java machine 
	public static void main (String [] args) {
		
	String str; 
	//declaring a variable without any value 
	// java will put null value by default 
	//will print null because no value assigned 
		str = "a"; 
	//assigning value into str 
	str.length(); 
	System.out.println(str);
	
	str	= "b"; 
	
	System.out.println(str);
	
	System.out.println(str + "AAA");
	
	System.out.println(str);
	
	str = str + "AAA"; 
	
	System.out.println(str);
		
	// ---------------------------
	
	String mystring = " a "; 
	
	System.out.println(mystring.trim()); 
	
	System.out.println(mystring); 
		
		
		
		
		
		
		
		
	}

}
