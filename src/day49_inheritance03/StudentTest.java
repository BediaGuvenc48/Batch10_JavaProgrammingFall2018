package day49_inheritance03;

public class StudentTest {
	
	public static void main(String[] args) {
		
		
		Student student = new Student(); 
		
		OnlineStudent onlineStudent = new OnlineStudent(); 
		
		onCampusStudent onCampusStudent = new onCampusStudent(); 
		
			student.attendAclass();
			onlineStudent.attendAclass();
			onCampusStudent.attendAclass();
	}

}
