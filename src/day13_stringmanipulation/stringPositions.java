package day13_stringmanipulation;

public class stringPositions {

	public static void main(String[] args) {
		
		
	String name = "nematullahkhalili";  		// --> NematullahKhalili
	
	StringBuilder stb = new StringBuilder(); 
	
	stb.append(name);  
	
	stb.replace(0, 1, "N"); 
	stb.replace(10, 11, "K"); 
	stb.insert(10, " "); 
	
	System.out.println(stb.toString());
	
	
	
	
	
//	
//	char [] array = name.toCharArray(); 
//	
//	for (int idx = 0; idx < array.length; idx++) {
//		
//		if (array[idx] == 'n') {
//		 
//		}
//	}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//	String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 	
//		
		

	
		
//	System.out.println(alphabet.indexOf("A"));
//		
//	int pPosition = alphabet.indexOf("P");	
//		System.out.println("P is at index " + pPosition);
//		
//	int hijLocation = alphabet.indexOf("HIJ");
//	System.out.println("HIJ are at index " + hijLocation);
//	
//	String sentence = "Today is Sunday and tomorow is Monday"; 
//	
//	
//	System.out.println(sentence.indexOf("Sunday"));
//	System.out.println(sentence.indexOf("a"));
//	
//	System.out.println(sentence.lastIndexOf("a"));
//	System.out.println(sentence.indexOf("y", 6));
//	System.out.println(sentence.indexOf("m", 19));
//	System.out.println(sentence.indexOf("tomorow"));	
//	System.out.println(sentence.indexOf("tomor"));
//	
//	if (sentence.indexOf("and") >= 0) {
//		System.out.println("Word is there");
//	}else {
//		System.out.println("Word is not there");
//	}
//	
//	String searchResults= "1-24 of over 50,000 results for Electronics : speakers";
//	int pos = searchResults.indexOf("of");
//	if(pos == 5) {
//	System.out.println("PASS");
//	}else {
//	System.out.println("FAIL");
//	}
			
	
	

	}
}
