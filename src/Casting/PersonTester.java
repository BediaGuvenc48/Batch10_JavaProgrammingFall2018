package Casting;

public class PersonTester {

	
	public static void main(String[] args) {
		
		Person p1 = new Person("Ahmad", 25); 
			p1.age = 16; 
			p1.name = "Sule"; 
			p1.toString(); 
			
		System.out.println( p1 );
			
		Object o1 = new Object (); 	
			o1.toString(); 
		
		Person p2 = (Person) o1; 
		
		
		Engineer e1 = new Engineer("Aiaz", 38, "a2000"); 
		
			e1.age = 30; 
			e1.name = "Jamil"; 
			e1.traingingID = "B38383"; 
			e1.toString(); 
		
		Person e2 = new Engineer("Adam", 23, "b3333"); 
		
			e2.age = 75; 
			e2.name = "Fawad"; 
			e2.toString(); 
			
		Engineer e4 = (Engineer) e2; 
			e4.design("Falcon Sketch");
		
		
		Object e3 = new Engineer("John", 26, "c888"); 
		Engineer e5 = (Engineer) e3;
			
		Engineer c1 = (Engineer) e2; 
		
	
		
		
		
	}
	

}
