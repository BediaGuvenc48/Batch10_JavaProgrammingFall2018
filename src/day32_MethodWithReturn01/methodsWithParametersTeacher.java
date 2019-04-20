package day32_MethodWithReturn01;

public class methodsWithParametersTeacher {
	
	public static void main(String[] args) {
//		String newEmail = buildEmail("Mike","Smith");
//		System.out.println(newEmail);
//		
//		System.out.println( buildEmail("John" , "Doe") );
//		
//		
//		System.out.println( getMax(100, 3) );
//		int myNum = getMax(34, 90);
//		System.out.println("MyNum " + myNum);
//		
//		
//		int max = getMax3(10, 5, 3);
//		System.out.println(max);
//		
//		max = getMax3(10, 10, 3);
//		System.out.println(max);
//		
//		boolean valid=isValidDay("Monday");
//		System.out.println(valid);
//		
//		valid=isValidDay("funday");
//		System.out.println(valid);
//		
//		valid=isValidDay("   SaTurDay  ");
//		System.out.println(valid);
		
		
		System.out.println( getMax(25, 35, 55) ); 
		
		
	}
	
	//Method getMax3 that accepts 3 ints and returns largest value
	
	
	public static int getMax(int n1, int n2, int n3) {
		
		if (n1 > n2 && n1 > n3) {
			return n1; 
		} else if (n2 > n1 && n2 > n3) {
			return n2; 
		}  
		
		return n3; 
	}

	
	public static int getMax3 (int num1, int num2, int num3) {
		
		if(num1 >= num2 && num1 >= num3) {
			return num1;
		}else if(num2 >= num1 && num2 >= num3) {
			return num2;
		}else {
			return num3;
		}
	}

	//buildEmail that will accept 2 String parms: firstname and lastname and
	//return a full email by adding @gmail.com
	
	
		public static String Email(String firstN, String lastN) {
			
			return firstN.toLowerCase() + "_" + lastN.toLowerCase()+"@gmail.com"; 
		
		}
	
	public static String buildEmail(String firstName, String lastName) {
		String email = firstName.toLowerCase() +"_" + lastName.toLowerCase() + "@gmail.com";
		return email;
	}
	
	//Method getMax that accepts 2 ints and return larger one
	
	public static int getMax(int num1, int num2) {
		int largest;
		if(num1 > num2) {
			largest = num1;
		}else {
			largest = num2;
		}
		
		return largest;
	}
	
	//isValidDay method: accepts a weekdayName, and checks 
	//if it is a valid one of 7 days then return true, otherwise return false.
	/*
	 * boolean valid=isValidDay("Monday");
	   System.out.println(valid);
	 */
	public static boolean isValidDay(String day) {
		day = day.toLowerCase().trim();
		
		//#1
//		if(day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || 
//		   day.equals("thursday") || day.equals("friday") || day.equals("saturday") ||
//		   day.equals("sunday")) {
//			return true;
//		}else {
//			return false;
//		}
		
		//#2
		if(day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || 
		   day.equals("thursday") || day.equals("friday") || day.equals("saturday") ||
		   day.equals("sunday")) {
			return true;
		}
		
		return false;
		
		//3
//		return (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || 
//				   day.equals("thursday") || day.equals("friday") || day.equals("saturday") ||
//				   day.equals("sunday"));
		
	}
	
	
	
	
	

}
