package day25_Arrays;
import java.util.Scanner; 
import java.util.Random;
public class LargeArray {
	
	public static void main(String[] args) {
		
		/*Scanner input = new Scanner(System.in);
		Random random = new Random(); 
		
		System.out.println("How many items are in array");
		int count = input.nextInt(); 
		
		int [] nums = new int [count]; 
		
		for (int i = 0; i < count; i++) {
			nums[i] = random.nextInt(1000);
		}
		
		for (int n : nums) {
			System.out.print(n + " ");
		}*/ 	
		
//		
//		Scanner sc = new Scanner(System.in); 
//		System.out.println("How many elements you in Array?");
//		int n = sc.nextInt(); 
//		
//		Random rn = new Random(); 
//		
//		int [] ns = new int [n]; 
//		
//		for (int idx = 0; idx < n; idx++) {
//			
//			ns [idx] = rn.nextInt(100);  
//		}
//		
//			for (int n1 : ns) {
//				System.out.print(n1 + " ^ ");
//			
//		
		
//		Scanner scan = new Scanner(System.in); 
//		Random ran = new Random(); 
//		
//		System.out.println("How many items are in this array?");
//		int count = scan.nextInt(); 
//		
//		int [] number = new int [count]; 
//		
//		for (int idx = 0; idx < count; idx++) {
//			
//			number [idx] = ran.nextInt(1000); 
//			
//		}
//		
//		for (int num: number) {
//			System.out.print(num + ", ");
//		}
//		
//		
//		scan.close();	
		
		
		
		Scanner scan = new Scanner(System.in); 
		Random ran = new Random();
		
		System.out.println("What is the size of your Array: ");
		int number = scan.nextInt(); 
		
		int [] arrNum = new int [number]; 
		
		for (int idx = 0; idx < arrNum.length; idx++) {
			
			arrNum[idx] = ran.nextInt(1000); 
		}
		
		
		for (int num : arrNum) {
				
			System.out.print(num + " ");
		}
		
		
		
					
	}
	

}
