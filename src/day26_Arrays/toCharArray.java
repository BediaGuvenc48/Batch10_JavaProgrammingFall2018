package day26_Arrays;

public class toCharArray {
	
	public static void main(String[] args) {
	 
		
		String word = "Hello"; // char [] word = ['H', 'e', 'l', 'l','0'] 
		
		 word.toCharArray(); 
		
		char [] a = word.toCharArray(); 
		
		for (char str : a) {
			System.out.print(str + " ");
			
		}
	
		
		char [] arrWord = word.toCharArray(); 
		
		for (char str: arrWord) {
			System.out.println(str);
		}
		

		System.out.println("\n=================");
		
		
		for (int idx = arrWord.length-1; idx >= 0; idx--) {
			
			System.out.print(arrWord[idx] + " ");
		}
		
		System.out.println("\n=================");
		
		
		char [] letters = word.toCharArray();
		
		for ( char letter : letters) {
			System.out.println(letter);

		}
		
		String gift = "Diamond Ring"; 
		
		char [] g1 = gift.toCharArray(); 
		
		for (char g : g1) {
			System.out.println(g);
		}
		
		char [] gift1 = gift.toCharArray();
		
		for (int i = gift1.length - 1; i >= 0; i--) {
			
			System.out.print(gift1[i]);
		}
		
		
		System.out.println();
		
		 String str = "Khalili"; 
		 
		 char [] alphabet = str.toCharArray(); 
		 
		 for (int idx = alphabet.length - 1; idx >= 0; idx--) {
			 System.out.print(alphabet[idx]);
		 } 
		 
		 
		 System.out.println();
		 
		 
		 String aiaz = "Aiaz Khalili"; 
		 
		 char [] mohd = aiaz.toCharArray(); 
		 
		 for (int kh = mohd.length - 1; kh >= 0; kh--) {
			 
			 System.out.print(mohd[kh]);
		 }
		 
		 System.out.println();
		 
		String mola = "Moallah Khalili"; 
		
		char [] moallah = mola.toCharArray(); 
		
		for (int momo = moallah.length - 1; momo >= 0; momo--) {
			
			System.out.print(moallah[momo]);
		}
		 
		 System.out.println();
		 
		 String mitra = "Mitra Khalili"; 
		 
		 char [] motro = mitra.toCharArray(); 
		 
		 for (int id = motro.length - 1; id >= 0; id--) {
			 
			 System.out.print(motro[id]);
			 
			 
		 }
		 		System.out.println("\n=======================");
		 String ahmad = "Ahmadullah"; 
		 
		 char [] ah = ahmad.toCharArray(); 
		 
//		 for (char b : ah) {
//			 	System.out.println(a);
//		 }
		 
		 for (int idx = ah.length-1; idx >= 0; idx--) {
			  
			 System.out.print(ah[idx] + " ");
		 }
		 
	}
	

}
