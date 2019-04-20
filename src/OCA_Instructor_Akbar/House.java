package OCA_Instructor_Akbar;

public class House {

	

	int houseNum; 
	static String neibourhoodName ; 
	
	public House(int houseNum) {
		this.houseNum = houseNum; 
	}
	
	public static void main(String[] args) {
		
		neibourhoodName = "CyberTek Ave" ;
		
		House h1 = new House(101);
		House h2 = new House(102);
		House h3 = new House(103);
		
		System.out.println(neibourhoodName);
		System.out.println(House.neibourhoodName); //should be like this, because it is static and should be accessed directly 
		System.out.println(h1.neibourhoodName);
		
		h1.neibourhoodName = "CyberTek Tower" ; 
		System.out.println(h3.neibourhoodName);
			
		
	}
	
	
}
