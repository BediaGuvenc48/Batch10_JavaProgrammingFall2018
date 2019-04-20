package day17_ReviewSession;
import java.util.Scanner; 
public class TernaryTeachersCode {
	
	public static void main(String[] args) {
	//take a String countryName and abbreviate it by taking first 2 letters
	//countryName -> Bangladesh -> BA , toUppercase()
		
		//ternary conditions using ? :
		//check if abbreviated is 2 chars:
		// if true -> say "2 chars detected"
		// else say "2 chars were not found"


	Scanner input = new Scanner(System.in); 
	System.out.println("Enter a country name: ");
	String countryName = input.nextLine(); 
	String countryAbbreviation = countryName.substring(0, 2).toUpperCase(); 
	System.out.println("Your coutnry's abbreviation is: " +  countryAbbreviation);
	
	countryAbbreviation = (countryAbbreviation.length() == 2) ? "2 chars detected" : "2 chars were not found"; 

		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter country name");
//		String countryName = input.nextLine();
//		
//		String abbreviated = countryName.substring(0, 2).toUpperCase();
//		//abbreviated = abbreviated.toUpperCase();
//		System.out.println(abbreviated);
//		
		//ternary conditions using ? :
		//check if abbreviated is 2 chars:
		// if true -> say "2 chars detected"
		// else say "2 chars were not found"
		
//		
//		System.out.println(abbreviated.length() == 2 ? "2 chars detected" : "2 chars were not detected");
//		
//		String msg1 = "2 chars detected";
//		String msg2 = "2 chars were not found";
//		
//		String result = abbreviated.length() == 2 ? msg1 : msg2;
//		System.out.println(result);
//		
		
		
		/*
		 * Convert this to Ternary:
		 * if 2 chars{
		 * 		if first char is U{
		 * 			say "Maybe USA"
		 *		}else{
		 *			say "Not USA for sure"
		 *		}
		 * }else{
		 * 	 say 2 chars were not found
		 * }
		 */
		
		
//		String str; 
//		
//		str = (str.length() == 2 )  ? (str.charAt(0) == 'U') ? "Maybe USA" : "Not USA for sure" : "2 Chars were not found"; 
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		result = abbreviated.length() == 2 ? 
//				    abbreviated.charAt(0)=='U'? "Maybe USA":"Not USA"
//				 :"2 chars were not found";
//		System.out.println(result);
	
		
		 input.close();
	}
}

	
	
