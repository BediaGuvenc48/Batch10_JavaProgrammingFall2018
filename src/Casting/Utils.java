package Casting;

public class Utils{
	
	/*
	   	Reverse a string without affecting special characters
	   	Given a string, that contains special character together 
	   	with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the string
	   	in a way that special characters are not affected.
	   	Input:   str = "a,b$c"
		Output:  str = "c,b$a"
		Note that $ and , are not moved anywhere.  
		Only subsequence "abc" is reversed.
			[^ 'A' - 'Z' && 'a' - 'z'] 
		Input:   str = "Ab,c,de!$"
						__,_,__!$
		Output:  str = "ed,c,bA!$"

		Input:   str = "----qwe--r--tyf...gd.---" 
		Output:  str = "----dgf--y--tre...wq.---" */
	 
		    public static void main(String[] args) {
		    
		    String result = Utils.reverseLetters("..zxcv..d");
		    System.out.println(result.equals("..dvcx..z")); //true
		    
		    String result2 = Utils.reverseLetters("---abmkl.o-");
		    System.out.println(result2.equals("---olkmb.a-")); //true
		    
		    String result3 = Utils.reverseLetters("---abmkl.o-");
		    System.out.println(result3.equals("-o.lkmba---")); //false
		    	
		    	
		    	String temp = reverseLetters("khalili"); 
		    	System.out.println(temp);
		    	
		    	boolean b = isAlphabit('A'); 
		    	System.out.println(b);
		    	
		    
		    	
		    	char [] str = {'A', 'b','d','e','!','$'}; 
		    	
		    	reverse(str);	
		    
		  }
		    
//		    public void reverse(char str[]) {
//		    	
//		    	
//		    	int r = strlen(str) - 1, l = 0; 
//		    	
//		    	while (l < r) {
//		    		
//		    		if ()
//		    	}
//		    	
//		    }
//		    
//		    
//	
//		  private int strlen(char[] str) {
//				// TODO Auto-generated method stub
//				return 0;
//			}

		public static String reverseLetters(String word){
		 
		char [] temp = word.toCharArray(); 
		
		String str = "";  
		
		for (int idx = temp.length-1; idx >= 0; idx--) {

			str += temp[idx]; 
			
		}    
			return str ;
		}
		
		
		public static boolean isAlphabit(char x) {
			
			if ( (x >= 'A' && x <= 'Z')) {
				return true; 
			} else if ((x >= 'a' && x <= 'z')) {
				return true; 
			} else 
			
				return false;	
		}		
	  
		
		public static void reverse(char str[]) {
			
			int r = str.length -1, l = 0; 
			
			while (l < r) {
				if (!isAlphabit(str[l])) {
					l++; 
				} else if (!isAlphabit(str[r])) {
					r++; 
				}else 
					
					swap(str[l], str[r]); 
					l++; 
					r--; 
			}
			
			for (char st : str) {
				System.out.print(st);
				 
			}
			
		}

		private static void swap(char c, char d) {
			 
			
		}
		
		
		
	}






