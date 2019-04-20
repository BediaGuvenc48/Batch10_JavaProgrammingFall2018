package day39_StringBuilders;

public class StringBuilderExample {
	
	public static void main(String[] args) {
		
		StringBuilder stb1 = new StringBuilder("Holloween"); 
		System.out.println(stb1);
		
		StringBuilder stb2 = new StringBuilder(); 
		//stb2 + stb2 + "Java"; + operators will not work with StringBuilders
		
		stb2.append("java"); //this just work like concatenating adds it to you StringBuider 
		
		System.out.println(stb2);
		stb2.append(",SQL").append(", HTML"); 
		System.out.println(stb2);
		stb2.append(",SQL "+"HTML"); 
		System.out.println(stb2);
		
		//append will add to the value 
		
		StringBuilder listBuilder = new StringBuilder("Wooden Spoon"); 
		
		listBuilder.append(", Iron Spoon"); 
		listBuilder.append('|');
		System.out.println(listBuilder);
		listBuilder.append(100); 
		System.out.println(listBuilder);
		//StringBuilder will work with char, integers, Strings, doubles anything and it is 
		//overloading method. 
		
		String s = "aaa"; 
		s = s+100; 
		s = s + true; 
		
		System.out.println(s);
		
		StringBuilder letters = new StringBuilder("ABCDEFGHKLMNOPQRST"); 
		
		letters.append(", KKK WW"); 
		System.out.println(letters);
		
		letters.delete(0, 4); 
		System.out.println(letters);
		
		letters.delete(5, 10); 
		System.out.println(letters);
		
		StringBuilder sentence = new StringBuilder ("Java is fun!"); 
		System.out.println(sentence.reverse());
		
		sentence.deleteCharAt(0); 
		System.out.println(sentence);
		
		sentence.deleteCharAt(sentence.length()-1); 
		System.out.println(sentence);
		
		StringBuilder stbInsert = new StringBuilder("SeleniumAutomation"); 
		//SeleniumAutomation => Selenium Test Automation... it this Test is inserted. // you can insert anything using StringBuilder 
		
		stbInsert.insert(8, " Test "); 
		System.out.println(stbInsert);
		
		stbInsert.insert(9, 1);
		System.out.println(stbInsert);
		
		//Appuim test Automation
		
		//stbInsert.replace(0, 9, "Appium ");
		stbInsert.replace(0, stbInsert.indexOf(" "), "Appium"); // this is another method which finds the first space and insert it in there 
		System.out.println(stbInsert);
		
		String str2 = "aabbaajj"; 
		str2 = str2.replace("aa", "ww"); 
		System.out.println(str2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
