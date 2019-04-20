package day47_AccessModifiers02;

import day47_AccessModifiers01.Student;

public class OtherPackage {
	
	public static void main(String[] args) {
		
		Student student = new Student(); // we need to import Student method, because we use different package 
		//student.name = "Mike"; //vissible to everyone, public modifier 
		//student.age = 44; -> It is not accessible, because it is different package
		//student.ssn = 2335235; private and not vissible 
	}

}
