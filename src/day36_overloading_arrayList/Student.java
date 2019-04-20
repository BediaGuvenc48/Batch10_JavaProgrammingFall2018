package day36_overloading_arrayList;

public class Student {

	
	String name; 
	String school; 
	int age; 
	
	//overloading constructors 
	
	public Student() {
		
		
	} 
	
	public Student(String name, int age) {
		
		this.name = name; 
		this.age = age; 
	}
	
	public Student (String name, int age, String school) {
		
		this.name = name; 
		this.age = age; 
		this.school = school; 
		
	}
	
	//overloadin methods 
	
	public void study() {
		
		System.out.println("I study by myself");
	}
	
	public void study (String topic) {
		
		System.out.println("I Study Selenium & Java");
		
	}
		
	public void study (String topic, int hour, String School) {
		
		System.out.println("I like also Jira and it is helpful");
		
	}
	
	public void study (Integer hour) {
		
		System.out.println("I study 5 hours per day");
	}
	
	public void study (boolean isEffective) {
		
		System.out.println("It is effective ");
	}
	
	 
	public void study (Object sth) {
		
		System.out.println("Super Class >>>>>>>>>>>>>.");
	}

	
public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.name = "Ahmad"; 
		s1.age = 28; 
		s1.school = "CyberTek"; 
		
		System.out.println(s1.name);
		
		Student s2 = new Student("Jamal", 25); 
		
		Student s3 = new Student ("Fazel", 30, "AfghanTurk"); 
		
		System.out.println(s3.name);
		System.out.println();
		
		Student s4 = new Student(); 
			s4.name = "Z"; 
			s4.age = 33; 
			s4.school = "Mason"; 
		
		System.out.println(s4.name);
		
		Student s5 = new Student("Zabi", 33, "UMV"); 
		
		System.out.println(s5.name);
		System.out.println(s5.age);
		
		Student s6 = new Student(); 
		s6.study();
		s6.study("Java");
		s6.study("java", 5, "CyberTek");
		s6.study(5);
		s6.study(new Boolean ("true"));
		
		s6.study("Java");
		s6.study(new Integer ("150"));
		
		
		
	}
	
}
