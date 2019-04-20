package day27_Arrays04;

public class SplitMethod {
	
	public static void main(String[] args) {
		
	String words = "java-selenium-cucumber-testing-eclipse-maven-git-github";	
	

		String [] str = words.split("-"); 
		
		for (int idx = 0; idx < str.length; idx++) {
			
			System.out.print(str[idx] + ", ");
			
		  }
		
		
		}
	
//	
//	String [] aword = words.split("-"); 
//	
//	for (String a : aword) {
//		
//		System.out.print(a + " ");
//	}
//	
//	System.out.println("\n====");
//	
//	
//	String[]splittedWords = words.split("-");
//	 
//		 System.out.println(splittedWords.length);
//		 System.out.println(splittedWords[0]);
//		 
//		 for (String str : splittedWords ) {
//			 
//			 System.out.println(str);
//		 }
//	
//		 //if you have a sentence as a string, how do you find out how many words in it? 
//		 
//		System.out.println("------------------");
//		 String searchResults = "All categories “wooden spoon” 13,623 Results";
//		 
//		 searchResults.split(" ");
//		 
//		 String [] splittedResults =  searchResults.split(" ");
//		 
//		 System.out.println(splittedResults.length);
//		
//		 //extract number of wooden spoon results and print out
//		 
//		 for (String str2 : splittedResults) {
//			 
//			  System.out.println(str2.length());
//			  System.out.print(str2.substring(2, 3));
//			 
//		 } 
//	  }

  }
