package day39_StringBuilders;

public class AppendAlphabet {
	
	public static void main(String[] args) {
		
		
		
		/*
		 * Task 1: 
		 * 
		 * StringBuilder stb = new StringBuilder(); 
		 * 
		 * Please add 5 different elements into it. 
		 * 
		 * please replace the 2nd element to x. 
		 * 
		 * please remove the 5th element 
		 * 
		 * please insert an element in the 3rd index 
		 * 
		 * finally find out the size of your stb. 
		 * 
		 * 
		 */
	
		StringBuilder s = new StringBuilder(); 
		s.append("A").append(2).append(true).append("B").append("C"); 
		
		System.out.println(s);
		s.replace(1, 2, "X"); 
		System.out.println(s);
		s.delete(4, 5); 
		System.out.println(s);
		System.out.println(s.length());

		StringBuilder stb = new StringBuilder(); 
		
		stb.append("A"); 
		stb.append("B"); 
		stb.append("C"); 
		stb.append("D"); 
		stb.append("E"); 
		
		System.out.println(stb);
		System.out.println(stb.toString());
		//2. 
		
		stb.replace(1, 2, "x"); 
		System.out.println("Replacing: " + stb);
		
		stb.delete(3, 4); 
		
		System.out.println("Deleting: " + stb);
		
		System.out.println("size: " +stb.length());
		
		stb.insert(3, "Y"); 
		System.out.println("Inserting: " + stb);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		char cha = 'C'; 
//		cha++;
//		System.out.println(cha);
//		
//		StringBuilder test = new StringBuilder(); 
//		
//		for (char idx = 'a'; idx <= 'z'; idx++) {
//			
//			test.append(idx); 
//		}
//		
//		
//		
//		System.out.println(test);
//		
//		System.out.println("\n=============Test End ===================");
//		char ch = 'A'; 
//		ch++; 
//		System.out.println(ch);
//		
//		StringBuilder alphabet = new StringBuilder(); 
// 
//		
//		for (char chars = 'A'; chars <= 'z'; chars++) {
//				
//				alphabet.append(chars); 
//		   }
//			
//		System.out.println(alphabet);
  }
//	

		
		
	

}

