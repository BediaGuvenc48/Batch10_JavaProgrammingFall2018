package day47_AccessModifiers01;

public class VaCampus {
	
	VA_CampusStudents cmapusStudent; //VA-Campus has-a relation with VaCampus
	

	public static <WebDriver> void main(String[] args) {
		
		Student student = new Student (); 
		student.name = "Serik"; //public 
		//student.ssn; -> not working it is privaten, Only vissible inside class student 
		student.age = 27; 
		student.campus = "Mclean VA"; 

		
	}
	

}
