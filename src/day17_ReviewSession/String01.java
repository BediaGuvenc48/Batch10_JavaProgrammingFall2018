package day17_ReviewSession;

public class String01 {
	public static void main(String[] args) {
		
	    //String is a combination of chars
        String greeting = "Hello World!";
        //print number of characters
        System.out.println(greeting.length());
        int len = greeting.length();
        System.out.println("Length:" + len);
        
        //print the first character
        //charAt method
        System.out.println(greeting.charAt(0));
        char firstCh = greeting.charAt(0);
        System.out.println("First char:" + firstCh);
        
        //print last character. try to use
        //len variable. Or dont use len variable
        System.out.println(greeting.charAt(11));
        //StringIndexOutOfBoundsException
        //System.out.println(greeting.charAt(len));//
        System.out.println(greeting.charAt(len-1));
        
        greeting = greeting + " I hope everyone is well";
        
        char lastCh = greeting.charAt( greeting.length() - 1 );
        
        System.out.println("Last char: " + lastCh);
		
		
		
//		//String is just a combination of chars. 
//		
//		String greeting = "Hello World!"; 
//		String str = "HappyBirthDay"; 
//		//Print number of characters 
//		
//		int len = greeting.length(); 
//		
//		System.out.println(greeting.length());
//		System.out.println(greeting.toUpperCase());
//		System.out.println(greeting.toLowerCase());
//		System.out.println(greeting.charAt(0));
//		System.out.println(greeting.charAt(5));
//		System.out.println(greeting.substring(0, 5));
//		System.out.println(greeting.charAt(0));
//		
//		System.out.println(greeting.charAt(11));
//		System.out.println(greeting.charAt(len-1)); 
//		
//		char lastCh = greeting.charAt( greeting.length() - 1);
//	
//		
//		System.out.println("Last char: " + lastCh);
//		
//		
		String word1 = "Goodbye";
		String word2 = "Welcome"; 
		
		System.out.println(word1.equals(word1)); 
		System.out.println(word1);
		System.out.println(word2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
