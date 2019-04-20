package day57_ExceptionHandling01;

public class Example2 {
	
	public static void main(String[] args) {
		
		/*Task # 1: 
		 
		 Try to write a code to throw a IndexOutOfBoundException  
		 
		 try to stimulate this proces by creating object and trhowing it back to the porgram using throw keyword 
		
		*/
		
		int [] nums = {5, 20, 30, 60}; 
		
		//System.out.println(nums[6]); 
		
		//there are 2 things that we can do in this point when gives us --> java.lang.ArrayIndexOutOfBoundsException 
		
			//figure 1.1: 
		throw new ArrayIndexOutOfBoundsException();  //--> you can directly do it which is the first way of doing it 
		
			//fiqure 1.2: 
		//ArrayIndexOutOfBoundsException aioobe = new ArrayIndexOutOfBoundsException(); 
		
		//throw aioobe; 
		
		//--> It is also possible to be done like the figure 1.2 
		//Exceptions are obejct and it will come from somewhere from java package !!! 
	
		
	}

}
