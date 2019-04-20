package day62_DataStructor_Akbar_02;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Queuepractice {
	
	
	public static void main(String[] args) {
		
		//FIFO --> First In First Out 
		Queue<Integer> que = new LinkedList<>(); 
			que.add(2);
			que.add(5);
			que.add(3);
			que.add(7);
			que.add(9);
		 
			
			System.out.println("Original: " + que);
			
			System.out.println( que.remove() ); 
			System.out.println( que );
		
			
		//LIFO --> Last In First Out 
		System.out.println(">>>>>>Seperate>>>>>>>>>");
		Deque<Integer> dq = new ArrayDeque<>(); 
			dq.add(8);
			dq.add(199);
			dq.add(55);
			dq.add(44);
			dq.add(33);
			
			System.out.println(dq);
			
			Stack<String> stack = new Stack<>(); 
				stack.push("java"); 
				stack.push("OCA"); 
				stack.push("Selenium Cookbook"); 
				stack.push("10X"); 
			
			System.out.println(stack.peek()); //this give us the last element in Stack 
			System.out.println(stack);
		
			
		
	}
	
	

}
