package Casting;

public class SalaryEmployee extends Employee {

	int salary; 

	public SalaryEmployee(String name, int idx, int salary) {
		super(name, idx);
		this.salary = salary; 
	}
	
	public int getSalary() {
			return salary;
	}
	
	@Override
	void getPaid(int salary) {
		
	}

	@Override
	public String toString() {
		return "SalaryEmployee [salary=" + salary + ", name=" + name + ", id=" + id + "]";
	}

	public int CalculateYearlIncom(int salary, int hours) {
		
		
		int wage = salary * hours; 
		
		return wage;
	}
	
	
}
