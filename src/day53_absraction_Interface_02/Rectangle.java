package day53_absraction_Interface_02;

public class Rectangle extends Shape implements Drawable {
	
																/*
																 	Rectangle: 
																	- instance field ; 
																		width, hieght : in 
																
																	 no Args Constructor : Just print this is Rectangle 
																	 2 arg constructor to set all 3 fields value 
																	 implement calculate area method
																	
																 */

	
	//String name;
	int width; 
	int height;
	
	public Rectangle() {
		super("rec");
	}
	
	public Rectangle(String name,int width,int height) {
		super(name);
		this.height = height;
		this.width = width;
	}
	
	@Override
	public void calculateArea() {
		
		int result = width * height ; 
		System.out.println(result);
		
	}

	@Override
	public void draw() {
		
	}

	@Override
	public void drawLine(String direction) {
		
	} 
	
}