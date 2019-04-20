package day46_this_isa;

public class PracticeThisRunner {
	
	public static void main(String[] args) {
		
		PracticeThis p = new PracticeThis(); 
		
			p.plus(10);
			p.plus(100);
			p.minus(50);
			p.minus(10);
			
			System.out.println(p.getnumber());
			
			StringBuilder stb = new StringBuilder(); 
			
			stb.append("A"); 
			stb.append("C").append("D").append("E").delete(0, 1).insert(0, "K"); 
			
			System.out.println(stb);
			
	}

}
