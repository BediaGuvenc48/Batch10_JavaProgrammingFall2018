package day60_DataStructor_Set;
import java.util.*;

public class EmployeeSet {
	
	public static void main(String[] args) {
		
		Set<Employee> employees = new HashSet<>(); 
		
		employees.add(new Employee(123, "Shaun")); 
		employees.add(new Employee(123, "Patel")); 
		employees.add(new Employee(123, "Patel")); 
		
		System.out.println(employees);
		
		Employee emp1 = new Employee(33, "Bob"); 
		Employee emp2 = new Employee(3, "Maria"); 
		Employee emp3 = new Employee(1, "Bob"); 
		Employee emp4 = new Employee(6, "Maria"); 
		
			System.out.println(emp1.compareTo(emp2));
		
		List<Employee> emps = new ArrayList<>(); 
			emps.add(emp1); 
			emps.add(emp2); 
			emps.add(emp3); 
			emps.add(emp4); 
		
		System.out.println(emps);
		
		Collections.sort(emps); 
		
		System.out.println(emps);
		
		
	}

}
