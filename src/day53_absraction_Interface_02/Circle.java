package day53_absraction_Interface_02;

public class Circle extends Shape {

										/*
										 
										Circale: 
									 
									 	instance field : 
										radius  : int 
											no arg constructor : just print this is Circle
											3 args constructor to set all 2 field value 
											implement calculate area method
										 
										 */
	
	//String name; 
	int radius ; 
	
	public Circle(String name , int radius ) {
		super(name) ; 
		this.radius = radius;
	}
	
	@Override
	public void calculateArea() {
		
		int result = (int) 3.14 * radius * radius ; 
		System.out.println(result);
	}

	
//	@Override
//	public void draw() {
//		 
//	}
//
//	@Override
//	public void drawLine(String direction) {
//		
//	}
}



