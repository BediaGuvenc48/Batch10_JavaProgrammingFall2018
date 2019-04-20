package PolyMorphismPractice;

public class Shirt extends Clothing{
	
	int size; 
	
	public Shirt(String name, double price, int size) {
	
		super(name, price); 
		this.size = size; 
		
	}

	@Override
	public String toString() {
		return "Shirt [size=" + size + ", name=" + name + ", price=" + price + "]";
	}

	public void printShirtInfo() {
		System.out.println("This is a nice lose shirt!!!");
	}
	
	
	public static void main(String[] args) {
		
		Shirt sh = new Shirt("jaket", 5.99, 10); 
		
		Clothing c1 = new Clothing("pant", 2.99);
		
		
		
	}
 } 
