package day38_wrapperClasses_Stringbuilders;

import java.util.ArrayList;

public class ConvertStringsToPrimitives {
	
	public static void main(String[] args) {
		
	
		String a = "555"; 
		int a1 = Integer.parseInt(a); 
			System.out.println(a1);
		
		if (a1 > 0) {
			System.out.println("Sounds Good");
		} else {
			System.out.println("Not Good");
		} 
		
		String s = "wooden spoon (13,950 Results)"; 
		
		String name = "ahmad"; // --> char [] name = {'a', 'h', 'm', 'a', 'd'}; 
		
		
		String [] arrStr = s.split(" "); 
		
//		String newS = s.replace(oldChar, newChar) 
		
		for (String result : arrStr) {
			System.out.print(result + " ");
		}

			
		System.out.println("\n===============New Test Ends ===========");
		
		
		String count = "4320"; //convert this String to real number. 
		String count2 = "4553"; 
		
		int countR = Integer.parseInt(count);
		System.out.println(count);
		int countR1 = Integer.parseInt(count);
		
		System.out.println(count);
		
		if (countR > 0) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Faild");
		}
		
		String test1 = "Benze is 5000.99 U.S Dolarrs"; 
		String [] splitTest1 = test1.split(" "); 
		
		
		String Number = ""; 
		for (int idx = 0; idx < splitTest1.length; idx++) {
			
			Number = splitTest1[2]; 
		}
			 System.out.println(Number);
		
		System.out.println("===============Test End ===========");
		
		int iCount = Integer.parseInt(count); //it takes it from String format and put another format parseInt
		int iCount2 = Integer.valueOf(count2); //Now convert String to Array 
		if (iCount > 0) {
			System.out.println("Count is positive");
			
		} else {
			System.out.println("Count is negative");
		}
		
		String str = "Price is 45.77"; 
		String [] sp = str.split(" "); 
		double price = Double.parseDouble(sp[2]); 
		System.out.println(price);
		
		String etsyResult = "wooden spoon (13,950 Results)"; 
		
		String[] etsyArray = etsyResult.split(" ");  
		String strSpoonCount = etsyArray[2].replace("(", "").replace(",", ""); 
		int woodenSpoons = Integer.parseInt(strSpoonCount); 
		
		if (woodenSpoons > 0) {
			
			System.out.println("Pass: ");
		} else {
			System.out.println("Not Pass: ");
		}
		
		//Loop format: 
		
		String etsyResult1 = "wooden spoon (13,950 Results)";
		String number = "";
		for (int i = 0; i < etsyResult1.length(); i++) {
			if (Character.isDigit(etsyResult1.charAt(i))) {
				number += etsyResult1.charAt(i);
			}
		}
			int result = Integer.parseInt(number);	
			System.out.println(result);
			
		String [] sNums = {"234", "345", "23", "12"}; 
		ArrayList<Integer> listNums = new ArrayList<>(); 
		
		for (String num : sNums) {
			
			listNums.add(Integer.parseInt(num));  
			
			
		}
			System.out.println(listNums);
		
	}

}
