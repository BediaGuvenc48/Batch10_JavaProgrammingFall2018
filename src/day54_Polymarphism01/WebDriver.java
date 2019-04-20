package day54_Polymarphism01;

public interface WebDriver {
	
	void navigate(String url); 
	void open(); 
	void close(); 
	default void quit() { // default and static methods must have body 
		
		System.out.println("default quit method, sub class may override it or use it as is");
	} 

}


	
