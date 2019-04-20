package Casting;

public abstract class Employee {

	
	String name; 
	int id; 
	
	public Employee(String name, int idx) {
		
		this.name = name; 
		this.id = id; 
	} 
	
	public String getString() {
		return name; 
	}
	
	public int getId() {
		return id; 
	}
	
 abstract void getPaid(int salary);

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
		
	} 
 
 	final void displayEmployeePolicy() {
 		
 		
 	}
	
	public static void showEmployeeManual() {
		
	}

	
	
}
