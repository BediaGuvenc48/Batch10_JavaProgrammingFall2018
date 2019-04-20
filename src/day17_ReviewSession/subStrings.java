package day17_ReviewSession;
 
public class subStrings {
 
	public static void main(String[] args) {
	
		/*
		 * Create a variable diceResults 
		 * assign 1 - 30 of 1,367 positions 
		 * using substring extract number of open positions 
		 */
		
		String diceResults =  "1 - 30 of 1,367 positions ";
		String result = diceResults.substring(10, 15); 
		
		System.out.println(result); 
		
		String languages = new String ("Java, Fotrun, English, Cobol, Ruby, C#; ");
		
		String lan1 = languages.substring(0, 4);
		System.out.println(lan1);
		
		String lan2 = languages.substring(6, 12);
		System.out.println(lan2);
		
		String lan3 = languages.substring(14, 21);
		System.out.println(lan3);
		
		String lan4 = languages.substring(23, 28);
		System.out.println(lan4);
		
		String lan5 = languages.substring(30, 34);
		System.out.println(lan5);
		
		String lan6 = languages.substring(36, 38);
		System.out.println(lan6);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
