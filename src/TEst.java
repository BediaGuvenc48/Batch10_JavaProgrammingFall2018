import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*; 
public class TEst {
	
	
	public static void main(String[] args) {
		
	
		String str = "se+se=2se"; 
		
		System.out.println( countme(str, "se") ); 
		
//		String str = "I love you"; 
//		
//		String [] array = str.split(" "); 
//		
//		List <String> list = Arrays.asList(array); 
//		
//		Collections.reverse(list); 
//		
//		for (String l : list) {
//			
//			System.out.print(l + " ");
//		}
		
		
	}
	
	
	public static int countme(String str, String sub){
        Pattern pattern = Pattern.compile ( sub);
        Matcher match = pattern.matcher ( str );
        int count = 0;
        while(match.find()) {
            System.out.println ( "substring found at index " + match.start ( ) + " to " + match.end ( ) );
            count++;
        }
        return count;
    }


}
