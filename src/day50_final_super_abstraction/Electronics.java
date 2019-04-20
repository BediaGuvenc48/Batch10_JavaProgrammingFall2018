package day50_final_super_abstraction;


	public class Electronics extends Product{
	private double price;
	

	public Electronics(String name, double price) {
		super(name);
		this.price = price;
	}
	
	public Electronics() {
		setName("Unknown Electronics");
		//super("Unknown Electronics"); <== will also work
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override 
	public String toString () {
		
		//return "Name: " + getName() + " | Price: " + price; 
		
		//Call toString method of the parent/super class 
		
		return super.toString() + " | Price: " + price; //it will work same thing 
		
		//return super.toString() + price; 
	}
	
	@Override 
	public void buy () {
		
		super.buy();
		
		System.out.println("Total price is: " + price);
		
//		super.buy();
//		System.out.println("Total price is " + price); 
	}

	//if you are in the same method, you say this.name, but if you want to call the parent class, then you say super.name; 
	
	//super.toString() means that go to the parent's class and call toString class. 
	
	
	
	
	
	
}
