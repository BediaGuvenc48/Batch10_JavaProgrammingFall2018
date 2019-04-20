package day40_customclasses;

public class TMobileCompany {

	public static void main(String[] args) {
		
	TMobile cellPhone = new TMobile(); 
	
		cellPhone.phoneType = "iPhone X"; 
		cellPhone.phonePlan = 55; 
		cellPhone.internetPlan = 6;    
		
		cellPhone.call();
		
		cellPhone.text();
			
		cellPhone.interData();
		
		System.out.println(cellPhone.phoneType + "  " + cellPhone.phonePlan + " " + cellPhone.internetPlan);
		
		
		
	}
}
