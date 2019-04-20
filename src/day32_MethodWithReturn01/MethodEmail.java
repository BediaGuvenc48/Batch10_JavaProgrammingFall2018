package day32_MethodWithReturn01;

public class MethodEmail {
	
public static void main(String[] args) {
	
		
	String firstName = getFirstName(); 
	String lastName = getLastName(); 
	String email = firstName + "_" + lastName + "@gmail.com";
	System.out.println(email);
	
	email = firstName + "_" + lastName + "11@yahoo.com";
	
	System.out.println(email);
	
}

/*
 * Method getFirstName, getLastName 
 * main you will call these methods and build an email. 
 * 
 * [firstname] _[lastname]@gamil.com
 */

		public static String getFirstName() {
		
			return "Mike"; 	
	}
	
		public static String getLastName() {
		
			return "Smith"; 
	
	}

}
