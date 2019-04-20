
	public class Utils{
		  public static String reverseLetters(String word){
				
				String temp= "";
				for(int i = 0; i < word.length(); i++){
				  if(isLetter (word.charAt(i)))
				  temp = word.charAt(i) + temp;
				}
				
				String answer = "";
				int c = 0;
				
				for(int i = 0; i < word.length(); i++){
				  if(isLetter (word.charAt(i))){
				  answer += temp.charAt(c++) ;
				  }
				  else{
				    answer += word.charAt(i);
				  }
				}
				
				return answer;
			}
			
			public static boolean isLetter(char c){
			  return   (64< c  && c < 91) || (96< c  && c < 123);
			}
		}
	
	
	
 
