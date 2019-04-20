package OCA_Test;


public abstract class Animal {
	int age;
	String color;
	public Animal() {
		System.out.println("animal class has been called");
	}
	abstract void move();
	abstract void eat();
	abstract void sleep();

}

