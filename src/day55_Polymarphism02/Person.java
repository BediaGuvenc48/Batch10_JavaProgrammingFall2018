package day55_Polymarphism02;

public class Person {
	
	
	//Domain object is plain old java object --> POJO which has the following: 
		//INSTANCE FIELDS : GETTER SETTERS, CONSTRUCTOR, toString 
	


	// POJO -- PLAIN OLD JAVA OBJECT	
	// INSTANCE FIELDS : GETTER SETTERS , CONTRUCTOR , toString 
	
	private String name ; 
	private int age ; 

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
}

