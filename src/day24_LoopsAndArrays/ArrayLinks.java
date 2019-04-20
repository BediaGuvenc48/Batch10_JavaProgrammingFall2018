package day24_LoopsAndArrays;
import java.util.Scanner;
public class ArrayLinks {
	
	public static void main(String[] args) {
		
		/*
		 * declare array names that can store 5 names 
		 */
			
//		String [] names = new String [5]; 
//		names[0] = "Serik"; 
//		names[1] = "Khalili"; 
//		names[2] = "Z"; 
//		names[3] = "Ekan"; 
//		names[4] = "Zarina"; 
//		
//		System.out.println(names.length);
//		
//		//String name and assign Khalili to it by reading from array 
//		
//		String name = names[1]; 
//		
//		System.out.println(name.length() );
//		System.out.println("Ekan".length());		

/*
			Scanner input =new Scanner(System.in);
			int num[] =new int[5];
			int total =0;
			for(int i=0; i<5; i++) {
				System.out.println("Enter a number "+(i+1)+":");
				num [i] = input.nextInt();
				
			}
			
			for(int i=0; i<5; i++) {
				total +=num[1];
			}
			System.out.println("Total: "+total);*/
//		
//		
//		Scanner input = new Scanner(System.in); 
//		System.out.println("Enter your Array size: ");
//		int number = input.nextInt(); 
//		
//		int sum = 0; 
//		
//		int [] arr = new int [number]; 
//		
//		for (int idx = 0; idx < arr.length; idx++) {
//			
//			System.out.println("Enter number " + (idx+1));
//			arr[idx] = input.nextInt(); 
//			 
//		}
//		
//			for (int j = 0; j < number; j++) {
//				
//				sum += arr[j];
//			}
//			
//			System.out.println(sum);
//		
//		
		
		
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter your Array size");
		int number = scan.nextInt(); 
		
		int sum = 0; 
		
		int [] arr = new int [number];   
		
		for (int idx = 0; idx < arr.length; idx++) {
			
			System.out.println("Ener number: " + (idx + 1)); 
			
			arr[idx] = scan.nextInt(); 
		}
		
		for (int j = 0; j < arr.length; j++) {
			
			sum += arr[j]; 
		}
		
		System.out.println(sum);
		
//		Scanner scan = new Scanner(System.in); 
//		System.out.println("Enter the size of your Array: ");
//		int num = scan.nextInt(); 
//		
//		int [] number = new int [num]; 
//		
//		int sum = 0; 
//		
//		for (int idx = 0; idx < number.length; idx++) {
//			
//			System.out.println("Enter a number: " + (idx+1));
//			number[idx] = scan.nextInt(); 
//			
//		}
//			for (int j = 0; j <=num; j++) {
//				
//				sum = sum + number[1];
//			}
//			
//			System.out.println(sum);		
//	
    }
//
     }
//


	/*
	 * Create an Array by using scanner the size is 10; 
	 */










































