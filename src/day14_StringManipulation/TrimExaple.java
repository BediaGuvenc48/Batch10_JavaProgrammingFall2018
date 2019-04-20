package day14_StringManipulation;

public class TrimExaple {

	
	public static void main(String[] args) {
		
	// trim() ---> deletes whitespace in the beginning and end of the string 
	// trim is used usually to remove the space from the programs, 
	// including tab and regular space 
	// spaces can be only at the beginning, or only at the end or in both sides. 
	// Everything will go 
		
		String str = "       blah         "; 
		System.out.println(str);
		// but the value of the str does not change 
		//Chaining is calling method one after another
		System.out.println(str.trim()); 
		//console will print str without the space 
		 	
		System.out.println(str.length());
		System.out.println(str.trim().length());
		
		System.out.println(str); 
		
		str = str.trim(); 
		
		// #################################
		
		System.out.println();
		
		//creat a new variable and gave value ' a ' 
		String mystring = " a "; 
		
		//printing the trimmed version of mystring 
		// this line will not affect the original value of mystring variable 
		
		System.out.println(mystring.trim());
		// prints the value of mystring which still contains spaces 
		System.out.println(mystring);
		
	}
}
