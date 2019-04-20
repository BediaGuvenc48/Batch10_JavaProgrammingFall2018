package day40_customclasses;

public class Company {
	
	public static void main(String[] args) {
		
		Employee emp2 = new Employee(); 
		
		emp2.firstName = "Ahmad"; 
		emp2.lastName = "Zahid"; 
		emp2.email = emp2.firstName+emp2.lastName+"@gmail.com";
		emp2.jobtittle = "Web-Developer"; 
		emp2.hourlySalary = 55.99; 
		
		System.out.println("First Name is: " + emp2.firstName);
		System.out.println("Last Name is: " + emp2.lastName);
		System.out.println("Email is: " + emp2.email);
		System.out.println("Job Tittle is: " + emp2.jobtittle);
		System.out.println("Hourly Salary is: " + emp2.hourlySalary);
	}

}
