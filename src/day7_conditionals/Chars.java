package day7_conditionals;

public class Chars {
	
	public static void main(String[] args) {
		
		char letter = 'a'; 
		letter++; 
		
		System.out.println(letter);
		
		int ascii = letter; 
		System.out.println(ascii);
		
		char myChar = 002; 
		System.out.println(myChar);
		
		char asad = 'B'; 
		System.out.println(asad);
		
		char symbol = '(';
		symbol--;
		System.out.println(symbol);
		
		boolean b = doubleX("axzxabax"); 
		System.out.println(b);
		
		Chars ch = new Chars(); 
		
		
		String str = ch.stringBits("Hello"); 
		System.out.println(str);
		
	}
	
	static boolean doubleX(String str) {
		  
		  for (int idx = 0; idx < str.length()-1; idx++){
		    
		    if (str.charAt(idx) == 'x' && str.charAt(idx+1) == 'x') return true; 
		  }
		    return false;
		}

	public String stringBits(String str) {
		  
		  String temp = ""; 
		  
		  for (int idx = 0; idx < str.length(); idx+=2 ){
		    
		    if (str.length() <=1){
		      return str; 
		    } else {
		      
		      temp += str.charAt(idx); 
		    }
		    
		  }
		  return temp; 
		}

}
