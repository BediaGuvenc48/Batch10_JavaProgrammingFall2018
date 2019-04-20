import java.util.Arrays;

public class ExtractNum {

	
	public static void main(String[] args) {
		
		String temp = extractNumber("aa2aa3"); 
		System.out.println(temp);
		
	}
	
	
	
	
	// extractNum("aa2aa3") ==> 23 
	
	private static String extractNumber(String str) {
		
		String [] array = str.split(""); 
		System.out.println(Arrays.toString(array));
		
		String temp = ""; 
		
		for (int idx = 0; idx < array.length; idx++) {
			
			if (array[idx]==("[0-9]")) {
				temp += array[idx].contains("[0-9]"); 
			}
		}
		
		return temp; 
		
	}
}
