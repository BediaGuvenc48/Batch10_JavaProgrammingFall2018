package day53_absraction_Interface_02;

public abstract class Shape {
	
																		/*
																		 
																	WarmUPTask: 
																		- Create an Abstract class Called Shape 
																		- It has a field called name : String 
																		- Create a constructor to set the name 
																		
																		-> create an abstract method called calculate area 
																		
																		-> Create 2 sub classes of Shape : Recangel and Circle  
																		 
																		 */
	
		String name; 
		
		public Shape(String name) {
			this.name = name ; 
		}
		
		public abstract void calculateArea() ; 
		
		// public String printShapeInfo(){} 

	   }
