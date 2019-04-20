package day43_classes_static_constructor02;

public class CampusTester {
	
	public static void main(String[] args) {
		
		Campus.city = "Mclean"; 
		
		Campus.aboutCmapus(); 
		
		
		 Campus c = new Campus(); 
		 
		 c.aboutCmapus(); 

		
	}

}
