package day41_classes_02_encapsulation;

public class cellPhone {
	
	/*
	 
	 - 
	 
	 Instance Variables: 
	 	- type; 
	 	- color; 
	 	- size; 
	 	- price 
	 	
	 Behaviours; 
	 	- calls 
	 	- texts 
	 	
	 
	 	
	 Create 3 instance variables encapsulated that are type, color, size, price
	 
	 - encapsulate the information from the public's Access. 
	 
	 - 
	 
	 */
	
	private String type; 
	private String color; 
	private double size; 
	private double price;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	} 
	
	
	public void call() {
		
		System.out.println("My cell phone is calling !!!");
	}
	
	public void test() {
		
		System.out.println("Your cell phone is texting");
	}
	
	
	
//	public String getType() {
//		
//		return type; 
//	}
//	
//	public void setType(String type) {
//		
//		this.type = type; 
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	private String type; 
//	private String color; 
//	private int size; 
//	private double price;
//	
//	
//	cellPhone (){
//				
//	}
//	
//	
//	public String getType() {
//		return type;
//	}
//	public void setType(String type) {
//		this.type = type;
//		
//	}
//	public String getColor() {
//		return color;
//	}
//	public void setColor(String color) {
//		this.color = color;
//	}
//	public int getSize() {
//		return size;
//	}
//	public void setSize(int size) {
//		this.size = size;
//	}
//	public double getPrice() {
//		return price;
//	}
//	public void setPrice(double price) {
//		this.price = price;
//	} 
//	
//	public static void main(String[] args) {
//		
//		cellPhone myPhone = new cellPhone(); 
//			
//			myPhone.type = "iPhone"; 
//			myPhone.color = "red"; 
//			myPhone.size = 10; 
//			myPhone.price = 999.99; 
//		
//			System.out.println(myPhone.getType());
//		
//		
//	}

}
