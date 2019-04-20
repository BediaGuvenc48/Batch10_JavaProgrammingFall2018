package day40_customclasses;

public class Employee {
	
	/*
	 * Instance variables
	 * First Name, Last Name, email, Job title and salary 
	 */
	
		String firstName; 
		String lastName; 
		String email; 
		String jobtittle; 
		double hourlySalary;
		
		public void work() {
			
			 System.out.println(firstName + " is working at " + jobtittle);
		}
		
	public static void main(String[] args) {
		
	
		Employee emp1 = new Employee(); 
		emp1.firstName = "Mike"; 
		emp1.lastName = "Smith"; 
		emp1.email = emp1.firstName+emp1.lastName+"@mail.com"; 		
		emp1.jobtittle = "Scrum Master"; 
		emp1.hourlySalary = 33.55; 
		
		System.out.println("First Name: " + emp1.firstName);
		System.out.println("Last Name: " + emp1.lastName);
		System.out.println("Job tittle: " + emp1.jobtittle);
		System.out.println("Email is: " + emp1.email);
		System.out.println("Hourly Salary is: " + emp1.hourlySalary);
		
	}
	

}
