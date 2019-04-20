package PolyMorphismPractice;

public class Clothing {
	
	String name; 
	double price; 
	
	public Clothing (String name, double price) {
		this.name = name; 
		this.price = price; 
	}

	@Override
	public String toString() {
		return "Clothing [name=" + name + ", price=" + price + "]";
	}

}
