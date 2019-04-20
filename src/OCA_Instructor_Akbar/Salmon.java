package OCA_Instructor_Akbar;

public class Salmon {
	
	
	private int count; 
	
	public int getCount() {
		
		return count; //this.count will exactly look for the specific count 
		
	}
	
	public void setCount(int count) {
		this.count = count;  
	}

	
	public static void main(String[] args) {
		
		Salmon s3 = new Salmon(); 
			s3.setCount(100);
		System.out.println(s3.getCount());
		
		 
		
		String a = ""; 
		a+= 2; 
		a+= 'c'; 
		a+= 12.55; 
		a+= false; 
		
	}
	
}
