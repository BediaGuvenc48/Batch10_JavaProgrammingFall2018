package OCA_Instructor_Akbar;

public class ocaExersize {
	
	public int howMany(boolean b, boolean ... b2) {
		
		return b2.length; 
		
		
			
	}
	
	public static void main(String[] args) {
		
		ocaExersize a = new ocaExersize(); 
		
		a.howMany(true, true); 
		
		int result = a.howMany(true, true, true);  
		System.out.println(result);
		
		
		
		boolean [] bools1 = new boolean [2]; 
		
		boolean [] bools4; 
		
		bools4 = new boolean [] {true, false}; 
		
		
		 for (boolean b : bools4) {
			 System.out.println(b);
		 }
		
		
		
	}

}
