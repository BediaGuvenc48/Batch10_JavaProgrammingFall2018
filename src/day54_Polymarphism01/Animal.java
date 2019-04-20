package day54_Polymarphism01;

interface Pet{  }


public class Animal implements Pet{

	public void makeNoise() {
		System.out.println("Let sub class object make noise");
	}
}

 class Cat extends Animal{
	@Override
	public void makeNoise() {
		System.out.println("cat says miao");
	}
 }
 
 class Dog extends Animal{
	@Override
	public void makeNoise() {
		System.out.println("Dog says woof");
	}
}
 
 class Horse extends Animal{
	@Override
	public void makeNoise() {
		System.out.println("Horse says Nay");
	}
}



// Create Super class Animal  -- with makeNoise method
//	sub class Dog , Cat , Horse

// in each sub classes create one method called makeNoise to override super class's method 
// let each animal make specific noise 

// Create 3 sub class objects with Animal reference 
// call makeNoise Method 