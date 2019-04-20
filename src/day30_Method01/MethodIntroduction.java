package day30_Method01;

public class MethodIntroduction {
	
	public static void main (String [] args) {

		sayHello(); // calling sayHello method 
		askHowRU();
		sayHello();
		reply(); 
		System.out.println("I am doing great, thanks");
		sayBye(); 
	}

public static void sayHello() {
		
		System.out.println("Hello");
	
	}
	
/*
 * write a method askHowRU that ask "how are you doing?" 
 */

/*
 * write a method reply. that prints "I am doing well, how about you?"
 */

/*
 * write at method that sayBye. that say "Bye! Have a good day!"
 */

public static void askHowRU() {
	
	System.out.println("how are you doing?"); 
}

public static void reply() {
	
	System.out.println("I am doing well, how about you?"); 
}

public static void sayBye() {
	
	System.out.println("Bye! Have a good day!"); 
	
}



}