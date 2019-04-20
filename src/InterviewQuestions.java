import java.util.*; 
public class InterviewQuestions {

	public static void main (String [] arg) {
		
//		int num = reversNum(12345); 
//		System.out.println(num);
		
		int nu = sumOfDigits(1111); 
		System.out.println(nu);
		
		boolean b = isPalindron("Level"); 
		System.out.println(b);
		
		int result = sumOfNumbers(12356); 
		System.out.println(result);
		
		String str = charRev("Halil"); 
		System.out.println(str);
		
		String s = "ahmad"; 
		
		char [] ch = s.toCharArray(); 
		
		List<Character> list = new ArrayList<>(); 
		
		for (char c : ch) {
			
			list.add(c); 
		}
		
		Collections.reverse(list);
		
		Object [] arr2 = list.toArray(); 
		
		String st = ""; 
		
		for (int idx = 0; idx < arr2.length; idx++) {
			
			st += arr2[idx]; 
		}
		
		System.out.println(st);
		 
		
		
		
	}
	
	public static int sumDigit(int num) {
		
		int sum = 0; 
		
		while (num > 0) {
			
			sum += num % 10; 
			num = num / 10; 
		}
		return sum; 
	}
	
	
	public static int sumOfNumbers(int num) {
		
		int sum = 0; 
		
		while (num > 0) {	
			sum = sum + num % 10; 
			num = num / 10; 
		}
		return sum; 
	}
	
	public static String reverse(String str) {
		
		String rev = ""; 
		
		for (int idx = str.length()-1; idx >= 0; idx--) {
			
			rev += str.charAt(idx); 
		}
		
		return rev; 
	}
	
	public static String charRev(String str) {
		
		String rev = ""; 
		char [] ch = str.toCharArray(); 
		
		for (int idx = ch.length-1; idx >= 0; idx--) {
			rev += ch[idx]; 
		}
		
		return rev; 
	}
	
	public static boolean isPalindron(String str1) {
		
		String rev = ""; 
		
		for (int idx = str1.length()-1; idx >= 0; idx--) {
			
			rev += str1.charAt(idx); 
		}
		
		if (rev.equals(str1)) {
			return true; 
		}
			return false; 
	}
	
	public static int sumOfDigits(int num) {
		
		int sum = 0; 
		
		for (int i = 0 ; i <= num; i++) {
			
			sum += num % 10; 
			num = num / 10; 
			
		}
		
		return sum; 
	}
	
	
	
		
//	public static int reversNum(int num) {
//		
//		int revers = 0; 
//		int rem = 0; 
//		
//		while (num > 0) {
//			
//			rem = num % 10; 
//			revers = num % 10 * 10 + rem; 
//			num = num / 10; 
//			
//		}
//		
//		return revers; 
//	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
