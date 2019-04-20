package day52_absraction_interface01;

public class Drone implements Flyable, Movable {

	int engineSize;
	int maxHeight;

	@Override
	public void fly() {
		maxHeight = 1200;
		System.out.println("Drone is Flyable at max height of " + maxHeight + " feets");

	}

	@Override
	public void move() {
		System.out.println("Drone is Movable ");

	}

	@Override
	public void moveIt() {
		System.out.println("MoveIt Drone ");

	}
	
		public static void main(String[] args) {
			
			Drone d = new Drone();
			d.move();
			d.moveIt();
			d.fly();
			
			
			Movable m = new Drone();
			m.move();
			
			System.out.println( MAX );
			System.out.println(Flyable.MAX); //you can create 
			
			Flyable f = new Drone();
			f.fly();
		}

	}





