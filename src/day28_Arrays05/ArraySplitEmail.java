package day28_Arrays05;


public class ArraySplitEmail {
	
	public static void main(String[] args) {
		
				
		/*Given a String variable email, write code using split method to print email id 
		 * and domain in separate lines.
	
		Example:
		email -> info@cybertekschool.com
		Print:  
		Email id: info
		Email domain: cybertekschool.com
	
	
		If email contains no @ character or multiple @ characters then print invalid email:
	
		email -> hello-gmail.com
		print:  
		invalid email
	
		email -> my@fancy@email.com
		print:  
		invalid email*/
		
		//if you split something from where you split that character or symbol will be disappeared 
		
		
		String email = "info@cybertekschool.com"; 
		
		String [] splitted = email.split("@"); 
		
		if (splitted.length == 2) {
			System.out.println("Email ID is: " + splitted[0]);
			System.out.println("Email Domain is: " + splitted[1]);
			
		} else {
			
			System.out.println("invalid email");
		} 
		
		
		String word = "I am a Java programmer";
		
		String [] arrword = word.split(" ");
		
		for (int i = arrword.length-1; i >= 0; i--) {
			
			System.out.println(arrword[i]);
		}
		
	/*	String email = "info@cybertekschool.com"; 
		
		String [] splitted = email.split("@");
		
		if (splitted.length == 2) {
			System.out.println("Email id: " + splitted[0]);
			System.out.println("Email domain: " + splitted[1]);
		} else {
			System.out.println("invalid email");
		}*/
			
		
//		String str = "Today is Saturday"; 
//		
//		String [] arr = str.split("is"); 
//		
//		System.out.println(arr[0]);
//		System.out.println(arr[1].trim());  
		
		
		
		/*Given a String variable sentence, write code to type each word in separate lines.
		 * 
		 *

		Example:
		sentence -> "Java is fun"
		Print
		Java
		is
		fun*/
		
		/*String sentence = "I am a Java programmer"; 
		String [] arrstr = sentence.split(" "); 
		
		for (int idx = 0; idx < arrstr.length; idx++) {
			
			System.out.println(arrstr[idx]);
		}*/
		
		
		/*Given a String variable sentence, write code to get each word and 
		 * assign to String reversed in reverse order. 

		Example:
		sentence -> "Java is fun"
		reversed -> "fun is Java"*/
		
	/*	String sentence = "Java is fun"; 
		
		String [] arrsent = sentence.split(" "); 
		
		String reversed = ""; 
		
		for (int idx = arrsent.length-1; idx >= 0; idx--) {
			
			reversed = reversed + arrsent[idx]; 
			
			System.out.println(reversed.trim());

				
		}*/
		
		String sentence = "I am a Java programmer"; 
		String [] arrstr = sentence.split(" "); 
		
		for (int idx = arrstr.length-1; idx >= 0; idx--) {
			
			System.out.println(arrstr[idx]);
		}

		
	}

}
