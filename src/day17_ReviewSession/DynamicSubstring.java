package day17_ReviewSession;

public class DynamicSubstring {
	
	public static void main(String[] args) {
		
		
		
		
		
		/*
		 * indexOf --> accepts a string and finds the position 
		 * String str = "abc"; 
		 * str.indeOf("b") --> 1 
		 * 
		 */
		
		//Note: when we look for the indexOf, it starts from 0 and it means that which alphabet positions it starts. 
		//if you wanted to chope or cut a part of the word, then find the positions of 2 sides left and write and then put it 
		//in the indexOf (number1, number2); 
		
		
	//	String lan1 = sentence.substring(16, 19); 
		//System.out.println(lan1);
		
//		String sentence = "We are learning Paitan programming";
//		
//		int start = sentence.indexOf("learning"); 
//		int end = sentence.indexOf("programming");
//		
//		
//		start = start + "learning".length(); 
//		
//		String language = sentence.substring(start, end);
//		System.out.println(language.trim());
		
		
		
		String sentence = "We are learning Paitan programming";
		
		int start = sentence.indexOf("learning"); 
		int end = sentence.indexOf("programming"); 
		
		start = start + "learning".length();
		
		System.out.println(sentence.substring(start, end).trim());
		
		
		
		
		
		
		
	}

}
