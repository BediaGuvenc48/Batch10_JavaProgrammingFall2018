package day8_conditionals2;
import java.util.Scanner;
public class chooseALanguage {
	public static void main(String[] args) {
		
		/*
		 * English --> 1
		 * Spanish --> 2
		 * Turkish --> 3 
		 * Russian --> 4 
		 * Uygur --> 5 
		 * Uzbek --> 6
		 * Kyrgyz --> 7 
		 * Dari --> 8 
		 */
		
		
		
//		System.out.println("English --> 1" 
//		+ "\nSpanish --> 2"
//		+ "\nTurkish --> 3" 
//		+ "\nRussian --> 4" 
//		+ "\nUygur --> 5" 
//		+ "\nUzbek --> 6" 
//		+ "\nKyrgyz --> 7" 
//		+ "\nDari --> 8");
//		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Press number beteen 1 - 7 to show greetings");
		int language = scan.nextInt(); 
		
		String greeting="";
		if (language == 1) {
			greeting = ("How are you doing?");
		}else if (language == 2) {
			greeting = ("Hola Komstas");
		}else if (language == 3) {
			greeting = ("Merhaba, Nasilsiniz");
		}else if (language == 4) {
			greeting = ("Kagdila");
		}else if (language == 5) {
			greeting = ("Uygur Greeting");
		}else if (language == 6) {
			greeting = ("Qandaghsin");
		}else if (language == 7) {
			greeting = ("Kergiz greeting");
		}else if (language == 8) {
			greeting = ("Chetoor Hasti?");
		}else {
			System.out.println("We don't have translation for this language");
		}
	
		System.out.println(greeting);
		
		scan.close(); 
	}
	
}