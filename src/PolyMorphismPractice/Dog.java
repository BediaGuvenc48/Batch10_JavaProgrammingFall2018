package PolyMorphismPractice;

public class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("Dog eats meat !!!");
	}
	
	
	public static void main(String[] args) {
		
		
	Dog d = new Dog(); 
	Animal a1 = new Dog(); 
	Mamals m1 = new Dog(); 
	Object o1 = new Dog(); 
	
	a1.eat();
	m1.eat();
	d.eat();
		
		
		
		
		
		
		
	}

	
}
