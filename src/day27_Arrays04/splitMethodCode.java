package day27_Arrays04;

public class splitMethodCode {
	public static void main(String[] args) {
		
String words = "java-selenium-cucumber-testng-junit-eclipse-maven-git-github";

	String [] a1 = words.split("-"); 
	
	for (String word : a1) {
		
		System.out.print(word + " ");
	}

	System.out.println("\ntest end");
	String [] asad = words.split("-"); 
	for (String a : asad) {
		System.out.print(a + " %");
	}

	String [] arrWords = words.split("-"); 
	
	for (String str : arrWords) {
		
		System.out.print(str + " ");
	}

System.out.println("\n ===================");



		String[] splittedWords=words.split("-");
		
		System.out.println(splittedWords.length);
		System.out.println(splittedWords[0]);
		
		for(String w : splittedWords) {
			System.out.println(w);
		}
		
		String searchResults = "All categories “wooden spoon” 13,623 Results.";
		//if you have a sentence as a string, how do you find out how many words
		//in it?
		String[] arrResults = searchResults.split(" ");
		System.out.println("Words count : " + arrResults.length);
		
		System.out.println(searchResults.split(" ").length);
		System.out.println(searchResults.split(" ")[0]);
		//extract number of wooden spoon results and print out
		
		System.out.println("Wooden spoon count: " + arrResults[4]);	
		
		
		String aiaz = "Aiaz is a good boy and he pays 130 monthly for his club"; 
		
		String [] arrAiaz = aiaz.split(" "); 
		
		System.out.println("Aiaz Word counts: " + arrAiaz.length);
		
		System.out.println(arrAiaz[0] + " " + arrAiaz[8]);
		
		
		
	}
}
