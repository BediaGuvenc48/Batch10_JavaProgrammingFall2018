package day38_wrapperClasses_Stringbuilders;

public class CreatingWrapper {
	
	public static void main(String[] args) {
		
	//Creating Wrappers class objects 
	//similarly we can do with other Wrapper Classes 
	
	System.out.println(">>>>>>>>>>>> Test Practice >>>>>>>>>>");	
	
	Integer n = new Integer (500); 
	System.out.println(n);
	
	String x1 = "5352"; 
	Integer x = Integer.parseInt("5352"); 
	System.out.println(x);
	
	Double z = new Double (13.55); 
	System.out.println(z);
	
	Double z1 = Double.parseDouble("55.55"); 
	System.out.println(z1);
	
	char num = '1'; 
	
	System.out.println(Character.isDigit(num));
	
	char asad = 't'; 
	System.out.println(Character.isDigit(asad));
	
	System.out.println(">>>>>>>>>>>> End Practice >>>>>>>>>>");
		
		Integer m4 = new Integer(200); 
		System.out.println(m4);
		
		Integer m = Integer.parseInt("14151515"); 
		System.out.println(m);
		
		Double m1 = new Double (13.55); 
		Double m2 = Double.parseDouble("1253535.555"); 
		System.out.println(m1);
		System.out.println(m2);
		
		char c = new Character ('A'); 
		char c1 = new Character ('@'); 
		System.out.println(c);
		System.out.println(c1);
		
		char test = 'f'; 
		System.out.println(Character.isDigit(test));
		
		String rasa = "Rasa448"; 
		
		System.out.println(Character.isAlphabetic(rasa.charAt(1)));
	
		System.out.println(Character.isAlphabetic(rasa.charAt(4)));
		
		
//		for (int idx = 0; idx < rasa.length(); idx++) {
//			
//			if (rasa.contains("[^ 0-9]")) {
//				
//				System.out.println(Do);
//			}
//		}
//		
		
	System.out.println("==========Test Ends =================");
		Integer n1 = new Integer(100); 
		System.out.println(n1);
		Integer n2 = new Integer(456);
		System.out.println(n2);
		Integer n3 = Integer.parseInt("2345"); 
		
		Double d1 = new Double (123.56); 
		Double d2 = Double.valueOf(345.55); 
		Double d3 = Double.parseDouble("1000.3"); 
		System.out.println(d3);
		
		Character ch1 = new Character('A'); 
		Character ch2 = new Character('@'); 
		System.out.println(ch1);
		System.out.println(ch2);
		
		char ch3 = 'q'; 
		System.out.println(Character.isDigit(ch3));
		
		String str = "ab5c"; 
		System.out.println(Character.isAlphabetic(str.charAt(0)));
		System.out.println(Character.isUpperCase('m'));
		System.out.println(Character.isLowerCase('m'));
		
		System.out.println(Character.isLetter('1'));
		System.out.println(Character.isLetterOrDigit('i'));
		System.out.println(Character.isLetterOrDigit('@'));
		System.out.println(Character.isLetterOrDigit(' '));
		
		
	}

}
