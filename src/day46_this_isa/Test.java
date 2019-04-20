package day46_this_isa;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		Laptop myLaptop = new Laptop(); 
			myLaptop.color = "Silver"; 
			myLaptop.year = 2018; 
		
		
		SchoolBuilding school = new SchoolBuilding(); 
			school.address = "7525 Jone Branch Drive, McLean, VA"; 
			school.distanceInMiles = 45;  
		
		
		School cybertek = new School(); 
		
			cybertek.studentList = new ArrayList<Student>(); 
			cybertek.student = new Student[5]; 
				
			
			
		Student onlineStudent = new Student(); 
		
			onlineStudent.grade = 12; 
			onlineStudent.type = "Local"; 
			onlineStudent.laptop = myLaptop; 
		
		System.out.println(school.distanceInMiles);
		System.out.println(school.address);
		System.out.println(onlineStudent.laptop.color);
		System.out.println(onlineStudent.laptop.year);
		 
		 
		
	}
	
}
