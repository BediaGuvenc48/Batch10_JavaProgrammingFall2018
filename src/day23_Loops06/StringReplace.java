package day23_Loops06;

public class StringReplace {
	
	public static void main(String[] args) {
	
		String sentence = "We are learning Java"; 
			System.out.println(sentence);
			
			sentence = sentence.replace("Java", "paitan");
			
			System.out.println(sentence);
			
			sentence = sentence.replaceAll("are", "is");
			System.out.println(sentence);
			
	
//			sentence = sentence.replace("Java", "C#");
//			System.out.println(sentence);
			
			//can u replace word 'learning' - practicing'
			
			sentence = sentence.replace("learning", "practicing"); // we are using from replace.charAt(oldchar, newcahr)
			System.out.println(sentence);
			
			sentence = sentence.replace("Phython", "Java"); //it will not bring any changes, because there is no Phython in our sentence 
			System.out.println(sentence);
		
		
		String word = "abacdka java selenium";
		
		System.out.println(word.replaceAll("ava", "unit"));//it is replacing all characters to the new one that we assign 
		System.out.println(word);
		
		String result = "123,456,001 results";
		
		//remove ' results ' and commas
 		
		result = result.replace("results", "").replaceAll(",", "");
		System.out.println(result);
	}

}
