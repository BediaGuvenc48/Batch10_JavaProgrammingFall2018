package day14_StringManipulation;

public class SubStringExamples {

	public static void main(String[] args) {
		
	// sbustrings gets part of a string
	// there are 2 versions, 1: takes 1 int and 1: takes 2 ints
	// if it takes 1 int, it means starting point 
	// we can not give a number bigger then the length, it will through exception
	// if we give number equal to the length, it will return empty string 
//		
//	"01234".substring(1); // if it is like this, it means, the starting point is number 1. 
//	
//	String str = "donaldtheduck@gmail.com";  
//	System.out.println(str.substring(6, 13));
//	//2 int 
//	// first number is where the new string will start from  
//	//second number is is where the new string will end 
//	
//	System.out.println("abc".substring(0, 1));
//		
		
	String zaki = "zakiarshadkhalili@gmail.com"; 
	
	int zak = zaki.length(); 
	System.out.println(zak);
	
	System.out.println(zaki.charAt(25));
	System.out.println(zaki.substring(4, 27));	
	
	System.out.println(zaki.substring(15));
	
	System.out.println(zaki.substring(24, 27));
		
		
		
		
	}
}
