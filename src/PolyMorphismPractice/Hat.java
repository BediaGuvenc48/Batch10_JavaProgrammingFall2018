package PolyMorphismPractice;

public class Hat extends Clothing {

	String type; 
	
	public Hat(String name, double price, String type) {
	
		super(name, price); 
		this.type = type; 
	}

	@Override
	public String toString() {
		return "Hat [type=" + type + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
