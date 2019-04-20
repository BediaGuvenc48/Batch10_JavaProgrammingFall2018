package day18_loops1;

public class warmUpTask1Cars {
	
	public static void main(String[] args) {
		
//		Task 2:
//			Contains method:
//			-Create a String variable garage and
//			Assign following string:
//			"Toyota, Nissan, Honda, BMW, Mazerati, Ford"
//			-convert whole garage into lowercase letters
//			-if garage isEmpty print "no cars in garage"
//			-using contains method check:
//
//			-if garage contains "toyota" or "nissan"
//			print "There is a Japanese car in garage"
//			if not print "No Japanese cars"
//			-if garage has "bmw"
//			print "there is a german car in garage"
//			if not print "no german cars"
//			-if garage has "Mazerati"
//			print "there is an italian car in garage"
//			if not print "no italian cars"
//			- if garage has "jaguar"
//			print "there is an british car in garage"
//			if not print "no british cars"
		
	
	//Common interview question, how do you find 1 String into another string. 
	//The message must be printed inside the System.out.print in order to show the chagnes. 
	
	String garage = "Toyota, Nissan, Honda, BMW, Mazerati, Ford"; // if we remove this line, the first condition will run 
	
		
	//how do you find one String within anohter String 
		//1. CONTAINS method 
		//2. INDEXOF > - 1
	//garage.toLowerCase(); //this will not work, because we didn't assign anything in garage variable 
	
	garage = garage.toLowerCase(); //this is the way how we assign the variable and now if you print out garage, then it will be lowercase.
	
	if (garage.isEmpty()) {
		System.out.println("There is no Japanese car in garage");
		
	}
		
	if (garage.contains("toyota") || garage.contains("nissan")) {
		System.out.println("There is a Japanese car in garage");
	} else {
		System.out.println("No Japanese cars");
	}
	
	if (garage.indexOf("bmw") > -1 ) {
		System.out.println("There is a german car in garage");
	}else {
		System.out.println("There is no german car");
		
	}
	
	if (garage.contains("jaguar")) {
		System.out.println("There is a British car in garage");
	}else {
		System.out.println("there is no Brithis car");
	}
	//String str = "Java is fun"; 
	//System.out.println(str.indexOf("this"));//whenever indexOf find a String, it gives you 0 or a positive number (0 or > 0);  
											//whenever indexOf doesn't find a number, then it gives you -1. 
	
	}
}
