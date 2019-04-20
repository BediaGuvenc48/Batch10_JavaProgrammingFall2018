package day37_arrayList02;

import java.util.*; 

public class ArrayListManipulation {
	
	public static void main(String[] args) {
		
		
		//1. 
		
		ArrayList general = new ArrayList(); 
		general.add(55.99); 
		general.add("Albert"); 
		general.add(true); 
//		
//		System.out.println(general.toString());
//		System.out.println(general);
//		
//		ArrayList <Integer> nums = new ArrayList<>(); 
//		
//		ArrayList <Integer> nums1 = new ArrayList<Integer>(10); 
//		
//		String [] n1111 = {"ahmad", "Albert"}; 
//		
//		
//		ArrayList <String> nums2 = new ArrayList<>(); 
//		
//		
	
		
		
//Create arraylist fruits using 5 different ways: 
		
//1) fruits1: 
		ArrayList<String> fruits1 = new ArrayList<>();  
		
//2) fruits2: 
		List<String> fruits2 = new ArrayList<>(); 
		
		System.out.println(">>>>>>>>>Test>>>>>>>>>>>>>>>>");
//3) fruits3: 
		List<String> fruits3 = new ArrayList<>(10); 
		
		fruits3.add("Grape"); 
        fruits3.add("Tomato"); 
        fruits3.add("BlueBerries"); 
        fruits3.add("BlackBerries");
		fruits3.add("Grape"); 
        fruits3.add("Tomato"); 
        fruits3.add("BlueBerries"); 
        fruits3.add("BlackBerries");
        fruits3.add("BlueBerries"); 
        fruits3.add("BlackBerries");
		fruits3.add("Grape"); 
        fruits3.add("Tomato"); 
        fruits3.add("BlueBerries"); 
        fruits3.add("BlackBerries");
        
			System.out.println(fruits3);
			System.out.println(fruits3.size());

//4) fruits4: 
		ArrayList<String> fruits4 = new ArrayList<>(fruits1); 	
		
//5) fruits5: it is a fixed Array list that can not be add or remove from the list 
		List<String> fruits5 = Arrays.asList(new String[] {"watermelon", "peach", "PineApple", "Kiwi"});//you can't add or remove any item from 
		//fruits5.add("bananana"); 
		//System.out.println("Fruit 5: " + fruits5.size()); --> 
		
		// java.lang.UnsupportedOperationException --> it happes when you change the size of the ArrayList
//		
//		fruits5.remove(0); 
//		
//		System.out.println(fruits5.size());
		
//6) optional: 
		List<String> fruits6 = new ArrayList<> (fruits5); 
		fruits6.add("banana"); 
		
		System.out.println();
		List<String> fruits7 = new ArrayList<> (Arrays.asList(new String [] {"watermelon", "peach", "PineApple", "Kiwi"})); 
		
			fruits7.remove(0); 
			System.out.println(fruits7.size());

//Example: 
	        fruits1.add("Grape"); 
	        fruits1.add("Tomato"); 
	        fruits1.add("BlueBerries"); 
	        fruits1.add("BlackBerries"); 
	        fruits1.add(0, "Orange"); 
	        fruits1.add(4, "Strawberries"); // this will come between BlueBerries and BlackBerries 
	        
	        System.out.println(fruits1);
	        fruits2.addAll(fruits1); 
	        fruits2.add("Dragon Fruit"); 
	        
	        System.out.println(fruits2);
	        
	        fruits1.remove(0); //orange will be removed from list, because it is the first element 
	        System.out.println(fruits1);
	        
	        fruits1.remove("Strawberries"); 
	        System.out.println(fruits1);
	        
	        //remove all elements of Fruits1 from fruit2 
	        
	        fruits2.removeAll(fruits1); 
	        System.out.println("Fruits2: " + fruits2); // this removed the matched items from the list 
	        
	        fruits1.clear();//it clears the entire ArrayList and empty [] will show up 
	        System.out.println(fruits1);
	        
	        ArrayList <Integer> nums = new ArrayList<>(); 
	        // add some numbers
	        nums.add(2); 
	        nums.add(3);
	        nums.add(4); 
	        nums.add(5); 
	        
	        System.out.println(nums);
	//remove 4 from the list and print out 
	        nums.remove(2); 
	        System.out.println(nums); 
	        
	//how we can we remove the int from an ArrayList, if we see remove 3, it is considered as an index 
   // we need to add new Integer then the number which makes it an object 
	        nums.remove(new Integer(3)); 
	        System.out.println(nums);
	        
	        nums.remove(new Integer(2)); 
	        //nums.remove(Integer.valueOf(2)); it is also possible 
	        System.out.println(nums);
	        
	     
	        
	       System.out.println(">>>>>>>>>>>Practice Array.asList>>>>>>>>>>>");
	       
	      
	   String [] names = new String []{"Ahmad", "Fazel", "Jawad", "Najibullah"}; 
	   
	   ArrayList<String> namesList = new ArrayList <>(Arrays.asList(names)); 
	   
	   namesList.add("khalili"); 
	   System.out.println(namesList.size());
	   System.out.println("Size");
	   System.out.println(namesList);
	   
	   /*This is fixed size and you can't add or remove any element, but you can change the 
	     swap the elements inside the arraylist. But, if you change anything inside the Array
	     or ArrayList, then it will effect on each other equally. It will throws an exception. 
	    */
	  
	   //list.add("Fatah"); 
//	   System.out.println(list);
	   
//	   list.remove(0); 
//	   System.out.println(list);
	   namesList.set(0, "Mohammad"); 
	   System.out.println(namesList);
	   
	 //there is only one way to add to ArrayList and we can use the method called Collection.addAll(); 
	  
	 String [] newNames = new String [] {"Fateh", "Kamal"}; 
	 
	 Collections.addAll(namesList, newNames); 
	 
	 System.out.println(namesList);
	 
	 
	 String [] n = {"a","b"}; 
	 
	 List<String> lis = new ArrayList<>(); 
	 
	 for (String s : n) {
		 
		 lis.add(s); 
	 }
	  
	 System.out.println(lis);
	   
	   
		
		
		
		
	}

}
