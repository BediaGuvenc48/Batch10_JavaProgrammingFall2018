package Casting;

public class HourlyEmployee extends Employee{

	int wage; 
	int hours; 
	
	public HourlyEmployee(String name, int idx, int wage, int hours) {
		super(name, idx);
		this.wage = wage; 
		this.hours = hours; 
	 
	}
	
	public int getWage() {
		return wage;
	}


	public int getHours() {
		return hours;
	}

	@Override
	void getPaid(int salary) {
		 
		
	}

	
	
}
