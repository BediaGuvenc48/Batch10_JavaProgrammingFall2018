package OCA_Instructor_Akbar;

public class Salmom {
	
	int count; 
	
	public Salmom() {
		
		System.out.println("a message from my constructor");
		
		this.count = 25; 
	}

	public Salmom(int count) {
		
		System.out.println("a message from my constructor");
		this.count = count; 
	}

	public static void main(String[] args) {
		
		Salmom s = new Salmom();
			System.out.println(s.count);
		
		Salmom s2 = new Salmom(100); 
		System.out.println(s2.count);
		
		
		
	}
}
