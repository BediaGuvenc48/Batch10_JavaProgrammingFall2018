package day37_arrayList02;
import java.util.*;
public class MethodWithListTeacher {
		
		public static void main(String[] args) {
			
			ArrayList <Integer> test1 = new ArrayList<Integer>(); 
				test1.add(1); 
				test1.add(10000000); 
				test1.add(3); 
			
			ArrayList <Integer> test2 = new ArrayList<Integer>(); 
				test2.add(1); 
				test2.add(2); 
				test2.add(3); 
				
			int r =	addAll(test1, test2); 
			System.out.println(r);
			
			int numRes = 8; 
			ArrayList<Integer> xy = random(numRes); 
			
			for (Integer ressult : xy) {
				System.out.print(ressult + " ");
			}
		
			System.out.println("\n============Test End =================");
			
		
			ArrayList<Integer> numsList = new ArrayList<>();
			numsList.add(1000);
			numsList.add(4000);
			numsList.add(10000);
			
			int result=sumList(numsList);
			System.out.println(result);
			System.out.println(sumList(numsList));
			
			List<Integer> myNums1 = new ArrayList<>();
			myNums1.add(100);
			myNums1.add(400);
			myNums1.add(1000);
			
			List<Integer> myNums2 = new ArrayList<>(myNums1);
			myNums2.add(543);
			myNums2.add(10);
			
			int sumResult = sum2Lists(myNums1 , myNums2);
			System.out.println(sumResult);
			
			System.out.println( buildIntList(9) );
			
			ArrayList<Integer> randomList=buildIntList(4);
			
			System.out.println(randomList);
			
			System.out.println(sumList(  buildIntList(5) ) );
			
			
			ArrayList <Integer> numsAll = new ArrayList<>(); 
			numsAll.add(155); 
			numsAll.add(255); 
			numsAll.add(3000); 
			
			int res = sumOfArray(numsAll);
			System.out.println(res);
			
			ArrayList <Integer> num = new ArrayList<>(); 
			num.add(111); 
			num.add(222); 
			num.add(333); 
			
			ArrayList<Integer>num2 = new ArrayList<>(); 
			num2.add(555); 
			num2.add(444); 
			
			int sumAll = lamber(num, num2); 
			System.out.println(sumAll);
				
		}
		
		//how to write method that accepts an Arraylist
		//calculate sum of values and return
		
		public static int sum(ArrayList<Integer> number) {
			
			
			int sum = 0; 
			
			for (int idx = 0; idx < number.size(); idx++) {
				
				sum += number.get(idx); 
			}
				return sum;
		}
		
		public static int addAll (ArrayList<Integer> num1, ArrayList<Integer> num2) {
		
			
			int sum = 0; 
			
			for (int idx = 0; idx < num1.size(); idx++) {
				
				sum += (num1.get(idx) + num2.get(idx)); 
			}
				return sum;
		}
		
		
		
		
		
		public static int sumList(ArrayList<Integer> nums) {
			int sum=0;
//			for(int n : nums) {
//				sum+=n;
//			}
			for(int i=0; i<nums.size(); i++) {
				sum+=nums.get(i);
			}

			return sum;
		}
		
		
		public static int sumOfArray(ArrayList <Integer> number) {
			
			int sumAll = 0; 
			
			for (int idx = 0; idx<number.size(); idx++) {
				
				sumAll += number.get(idx); 
			}
				return sumAll; 
		}
		
		
		/*
		 * method : sum2Lists
		 * Args: 2 Integer arraylists
		 * Return type: int
		 * Sum of both arraylists
		 */
		
		public static int lamber (ArrayList <Integer> num1, ArrayList <Integer> num2) {
			
			int sum = 0; 
			
			for (int idx = 0; idx <num1.size(); idx++) {
				
				sum+= num1.get(idx); 
			}
				
			for (int j = 0; j<num2.size(); j++) {
				
				sum += num2.get(j); 
			}
				return sum; 
		
	     } 
		
//		public static int lamber (ArrayList<Integer>num, ArrayList<Integer>num2) {
//			
//			int sum = 0; 
//			
//			for (int number: num) {
//				
//				sum += number; 
//			}
//			
//			for (int number2 : num2) {
//				
//				sum += number2; 
//			}
//				
//			return sum; 
//		}

		
		public static int sum2Lists(List<Integer> nums1, List<Integer> nums2) {
			int sum = 0;
			for (Integer num : nums1) {
				sum+=num;
			}
			
			for (Integer num : nums2) {
				sum+=num;
			}
			
			return sum;	
		}
		
		/*
		 * How to write a method that returns an ArrayList of integers
		 * 
		 * Method name: buildIntList
		 * Return type: ArrayList of integer
		 * Args: int
		 * 
		 * This method gets an int and creates an arraylist with that many random
		 * numbers between 0 - 100 and returns it
		 * 
		 */
			public static ArrayList<Integer> buildIntList(int count) {
			Random random = new Random();
			ArrayList<Integer> returnList = new ArrayList<>();
			for(int Z=1; Z <= count; Z++) {
				returnList.add( random.nextInt(101) );
			}
			
			return returnList;
	
    }
			
			
		public static ArrayList<Integer> random (int numbers){
			
			Random ran = new Random(); 
			
			ArrayList <Integer> x = new ArrayList<Integer>(); 
			
			for (int idx = 0; idx <= numbers; idx++) {
				
				x.add(ran.nextInt(1000));
			}
			return x;
		}	
			

}
