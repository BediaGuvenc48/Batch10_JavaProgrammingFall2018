package OCA_Test;

public class Cat extends Animal {

	@Override
	void move() {
	System.out.println("cat is running");
		
	}

	@Override
	void eat() {
		System.out.println("cat is eating");
		
	}

	@Override
	void sleep() {
	System.out.println("cat is sleeping");
		
	}
	public void play() {
		System.out.println("cat is playing");
	}

}




