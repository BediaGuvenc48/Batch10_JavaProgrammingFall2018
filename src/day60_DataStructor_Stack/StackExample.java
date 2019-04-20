package day60_DataStructor_Stack;

import java.util.Stack;

public class StackExample {
	
	public static void main(String[] args) {
		
		//LAST IN FIRST OUT 
		
		Stack<String> stack = new Stack<>(); 
			stack.push("java"); 
			stack.push("OCA"); 
			stack.push("Selenium Cookbook"); 
			stack.push("10X"); 
		
			System.out.println(stack.peek()); //this give us the last element in Stack 
			System.out.println(stack);
		
			System.out.println(stack.search("java")); //java is the first element, but when other elements are put on the top of it, then 
													 // it will be the last item, because other books are on the top

	}

}
