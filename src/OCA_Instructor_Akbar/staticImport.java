package OCA_Instructor_Akbar;

import java.util.ArrayList;

import static OCA_Instructor_Akbar.House.*; 

public class staticImport {
	
	
	//It is accessing one static variable by importing static 
	//do I need an object to access statsic variable of house
	
	public static void main(String[] args) {
		
			System.out.println(House.neibourhoodName); //we don't have any value, just prints null, but you can access it 
			
			ArrayList <String> lst = new ArrayList<>(); // if you don't import it, it will not work 
			
			
		//static import --> it will enable you to access static members (variables, method) 
					//		of a class without starting with ClassName. 
			
			System.out.println(Holiday.staticNum); 
			
			System.out.println(neibourhoodName);//this will not need the name of the class, because you import static already 
			
			
			
			
	}

}
