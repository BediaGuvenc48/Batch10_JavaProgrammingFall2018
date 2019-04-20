package day52_absraction_interface01;

public abstract class Student {
	
	int age;
	
	
	public Student (int age) {
		this.age = age; 
		
	}
	
	public void attenClass() {
		
		System.out.println("abc  ");
	}
	
   }


class LocalStudent extends Student {
	
	int seatID; 
	
	public LocalStudent() {
		super(10); 
	
	}
	public void study() {
	} 
	
   }

// Student <-- LocalStudent <-- UENSttudent 

class UENStudent extends LocalStudent{
	
	
  }









