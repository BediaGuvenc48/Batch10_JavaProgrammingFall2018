package day58_ExceptionHandling02_AkbarClass;

public class UserManagement {
	
	public static void main(String[] args) {
		
		//CreateUserName("ahmad"); 
		CreateUserName("Mark Smith"); 
		
		
	
 }
	
	
	public static void CreateUserName(String name) {
		
		try {
			
			System.out.println("First Letter: " + name.charAt(0));
			
			System.out.println("10th Letter: " + name.charAt(9));	
			
			char [] nameArray = name.toCharArray(); 
			
			for (int idx = 0; idx<nameArray.length; idx++) {
				
				System.out.println(nameArray[9]);
				break; 
			}
			
			
			int number = Integer.parseInt(name.substring(0, 1));
			
			System.out.println(number);
			
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(Exception e1) {
			e1.getMessage(); 
			
		}
	
	}
	
	/*
	 * print the first letter of the name 
	 * print the 10th letter of the name 
	 * turn your name intor char[] then access 10th character 
	 * 
	 * turn first letter into Integer 
	 * 		hint-> you can use Integer 
	 * 
	 * try to create multi try catch block inside method to catch exceptions at run time and print sth useful 
	 */
	

}
