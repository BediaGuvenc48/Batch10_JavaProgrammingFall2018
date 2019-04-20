package OCA_Test;


public class Dog extends Animal {
	public Dog() {
		System.out.println("dog calss has been called");
	}

	@Override
	void move() {
		System.out.println("dog is running");
	}

	@Override
	void eat() {
		System.out.println("dog is eating");
	}

	@Override
	void sleep() {
		System.out.println("dog is sleeping");	
	}
	
	public void bark() {
		System.out.println("dog is barking");
	}
}
