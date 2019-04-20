package day41_classes_02_encapsulation;

public class CatOwner {
	
	public static void main(String[] args) {
		
		
		Cat myCat = new Cat("Male ", "American Cat"); 
		 
		
		System.out.println(myCat.gender);
			myCat.gender = "female"; 
		
		System.out.println(myCat.gender);
		
		System.out.println(myCat.age);
		System.out.println(myCat.color);
				 
		
		Cat yourCat = new Cat("Female", "Iranian", -5); 
		
			System.out.println(yourCat.age);
			System.out.println(yourCat.breed);
		
	}
	
		
		
}
