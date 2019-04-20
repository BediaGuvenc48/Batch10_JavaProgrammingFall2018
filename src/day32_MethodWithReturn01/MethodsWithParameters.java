package day32_MethodWithReturn01;

public class MethodsWithParameters {
	
	public static void main(String[] args) {
		
		
		buildEmail("mike", "smith");
		
		String newEmail = buildEmail("Mike", "Smith");
		
		System.out.println(newEmail);
		
		System.out.println(buildEmail("John", "Doe"));
		
		System.out.println(getMax(100, 3));
		
		int myNum = getMax(34, 90); 
		
		System.out.println(myNum);
		
		System.out.println(getMax3(100, 300, 600));
		
		int myNumber = getMax3(10000, 300000, 6000); 
		
		System.out.println(myNumber);
		
		isValidDay("Monday");
		
		boolean valid = isValidDay("Monday");
		System.out.println(valid);
		
		valid = isValidDay("funday");
		System.out.println(valid);
		
		valid = isValidDay("     Sunday      ");
		System.out.println(valid);
		
		 isValidDay1("friday");
		
		boolean valid1 = isValidDay1("friday");
		System.out.println(valid1);
		
		

		
	}
	
	/*
	 * builEmail that will accept firstname name and lastname 
	 * return a full email by adding @gmail.com
	 */
	
	
	public static String buildEmail(String firsName, String lastName) {
		
		String email = firsName.toLowerCase() + "_" + lastName.toLowerCase() + "@gmail.com";
		return email;
	}
	
	/*
	 * Method getMax that accept 2 ints and return larger one 
	 */
	
		public static int getMax(int num1, int num2) {
		
		int getMax = 0; 
		
			if (num1 > num2) {
			return num1; 
			
		} else if (num2 > num1) {
			
			return num2;
		}
		
		return getMax;
	}
		
		/*
		 * Method getMax3 accept 3 ints and returns largest values 
		 */
	
		public static int getMax3(int number1, int number2, int number3) {
			
			int getMax3 = 0; 
			
				if (number1 > number2 && number1 > number3) {
				return number1;  
				
			} else if (number2 > number1 && number2 > number3) {
				
				return number2;
				
			} else if (number3 > number2 && number3 > number1) {
				
				return number3; 
			}
			
			return getMax3;
		}
		
		/*
		 * isValidWeekDay method; accepts a weekdayName, and checks 
		 * if it is a valid one of the 7 days, then return true, otherwise return false
		 */
	
		public static boolean isValidDay(String day) {
		
			//#1 
			
			 day = day.toLowerCase().trim(); 
			 
			 if (day.equals("monday") || day.equals("tuesday") || day.equals("wedensday") 
				|| day.equals("thursday") || day.equals("friday") || day.equals("saturday") || day.equals("sunday")) {
			 
			 return true; 	 
		} else {
			return false;
		}
		
		
		}
		
	
		
		
		
		public static boolean isValidDay1(String day1) {
			String[] weekDay = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday"};
			
			for(int i= 0; i < weekDay.length; i++) {
		    if(day1 == weekDay[i]);			
			return true;
			}
			return false;
			
			}
		
}

