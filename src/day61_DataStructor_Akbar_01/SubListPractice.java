package day61_DataStructor_Akbar_01;


import java.util.*; 

public class SubListPractice {
	
	public static void main(String[] args) {
		
//		
//		List<Integer> list = new ArrayList<>(); 
//			list.add(11);
//			list.add(33);
//			list.add(22);
//			list.add(55);
//			list.add(66);
//			list.add(77);
//			list.add(188);
//			list.add(119);
//			list.add(1122);
//			list.add(1133);
//			list.add(1144);
//			list.add(1551);
//			list.add(1661);
//			
//			System.out.println(list);
//			System.out.println("\n >>>>>>>>>>>>>>>>>>>>>>");
//			
//			List<Integer> sub = list.subList(1, 4); 
//			System.out.println(sub);
//		
			
			
			/*
			 * Create list of String that have 7 elements 
			 * 
			 * Change the items from index 2-5  -->> I love Colleciton 
			 * You are required to use Sublist  
			 * 
			 * then print it out 
			 * try to delete one item from sub list and see whether it affect 
			 *  orgiginal list 
			 * 
			 * */
			
		
		List<String> li = new LinkedList<>(); 
		li.add("a"); 
		li.add("b");
		li.add("d");
		li.add("e");
		li.add("at");
		li.add("ay");
		li.add("au");
		
		List<String> suli = li.subList(0, 4); 
		
		for (int idx = 0 ;idx < suli.size(); idx++) {
			suli.set(idx, "My Little Babe"); 
		}
		
		System.out.println(suli);
		
		int num = Collections.frequency(suli, "My Little Babe"); 
		System.out.println(num);
		
		
		List<String> myList = new LinkedList<>(); 
		
			myList.add("java"); 
			myList.add("selenium"); 
			myList.add("Jira"); 
			myList.add("SDLC"); 
			myList.add("Cucumber"); 
			myList.add("STLC");
			
			System.out.println(myList);
			
			List<String> sub1 = myList.subList(2,5); 
			
			for (int idx = 0; idx < sub1.size(); idx++) {
				
				sub1.set(idx, "I Love Java"); 
			}
			
			System.out.println(sub1);
			
//				sub1.set(0, "I Lovce Collection");
//				sub1.set(1, "I Lovce Collection");
//				sub1.set(2, "I Lovce Collection");
//				
//				System.out.println(sub1);
		
		
	}

}
