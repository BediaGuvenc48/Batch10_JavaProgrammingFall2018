package day38_wrapperClasses_Stringbuilders;

import java.util.ArrayList; 

public class ConvertingStringsToPrimitivesTeacher {

    public static void main(String[] args) {
        String count = "432";
        int iCount = Integer.parseInt(count);//convert string to int
        Integer iCount2 = Integer.valueOf(count);
        System.out.println(iCount2);
        System.out.println(iCount);
        if(iCount > 0) {
            System.out.println("Count is positive");  
        }else {
            System.out.println("Count is negative");
        }
        
        String str = "Price is 45.77";
        String[] sp = str.split(" ");
        double price = Double.parseDouble( sp[2] );
        System.out.println(price);
        
        String etsyResult = "“wooden spoon” (13,950 Results)";
        String[] etsyArray = etsyResult.split(" ");
        String strSpoonsCount = etsyArray[2].replace("(", "").replace(",", "");
        int woodenSpoons = Integer.parseInt(strSpoonsCount);
        
        if(woodenSpoons > 0) {
            System.out.println("PASS. Search results are displayed");
        }else {
            System.out.println("FAIL. Search results are NOT displayed");
        }
        
        String[] sNums = {"234", "345", "23", "12"};
        ArrayList<Integer> listNums = new ArrayList<>();
        
        for (String num : sNums) {
            listNums.add(Integer.valueOf(num));
        }
        
        System.out.println(listNums);
        
     
        System.out.println(">>>>>>>>>>>Test Practice >>>>>>>>>>>>>>");
        
        
        String a = "55599"; 
        
        int an = Integer.parseInt(a); 
        
        if (an > 0) {
        	System.out.println("PASS");
        } else {
        	System.out.println("FAIL");
        }
        
        String b = "99.99"; 
        double bn = Double.parseDouble(b); 
        
        if (bn > 10) {
        	System.out.println("Fizz");
        } else {
        	System.out.println("Buzz");
        }
        
        String amazonSearch = "“wooden spoon” (13,950 Results)";
        
        String [] amazonArray = amazonSearch.split(" "); 
        
        String amz = amazonArray[2].replace("(", "").replace(",", ""); 
        
        int wSpoon = Integer.parseInt(amz); 
        
        System.out.println(amz);
        
        String [] strNum = {"234", "345", "23", "12"};
        
        ArrayList<Integer> Numlist = new ArrayList<>(); 
        
        for (String number : strNum) {
        	
        	 Numlist.add(Integer.valueOf(number)); 
        }
        
        System.out.println(Numlist.toString());
        
	        
	    }
	}
