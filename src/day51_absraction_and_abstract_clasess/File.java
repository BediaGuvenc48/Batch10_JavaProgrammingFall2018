package day51_absraction_and_abstract_clasess;

public abstract class File {
	
	private String name; // We are creating an instance variable 
	public static int count; // We can create a static variable as well which has 1 copy, it is shared by all objects and we can access it by the class name  
	
	public File() {
		
		System.out.println("File Class Constructor is Called");
		name = "unknown"; 
		count++; 
		
	    }
	
	public File (String name) {
		System.out.println("File class 1-Arg Constructor");
		this.name = name; 
		count++; //we should increment the count, because maybe this constructor is called in some point to make sure that the count is incremented by 1 
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public abstract void open(); //it opens and we don't know how it is openning, we know this behaviour and it is very common, but don't know the details of openning 
	
	public void close() { //if we add the word abstract in our method, then it will not work, so if we have the abstract method, then we can't have the body of method. 
		
		System.out.println("Closing the file.");
	}


}
