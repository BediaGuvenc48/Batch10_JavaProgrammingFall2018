package day7_conditionals;
import java.util. *; 
public class IfStatementElse {
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter valid User Name & Password: ");
		
		String userName = input.next(); 
		String password = input.next(); 
		
		String validUserName = "Ahmad"; 
		String validPwd = "asad123"; 
		
		if (userName.equals(validUserName) && password.equals(validPwd)) {
			
			System.out.println("Welcome to your account \nGreat Job: ");
			
			}else {
				
				System.out.println("Invalid Password & User Name \nTry Again:");
				
		}
		
		
		input.close(); 
		
	}

}
