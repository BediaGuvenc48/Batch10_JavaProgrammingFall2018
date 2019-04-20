package day36_overloading_arrayList;

public class OverloadedMethods {
	
	public static void main(String[] args) {
		
		int result = add(5, 10); 
		System.out.println(result);
		
		double res = add(5.5, 2.5, 9.99); 
		System.out.println(res);
		
		boolean b = playGame(5, "football"); 
		System.out.println(b);
		
		boolean b1 = playGame("soccer",  1); 
		System.out.println(b1);
		
		boolean b2 = work("sdet"); 
		System.out.println(b2);
		
		double num = work(55); 
		System.out.println(num);
		
	}
	
	/*
	 * 2 methods : add 
	 * 1st: add 
	 * 	params : 2 ints 
	 * 	return : int 
	 * 
	 * 2nd: add
	 * 		params: 3 doubles 
	 * 		return: double 
	 */

	public static int add(int num1, int num2) {
		return num1+num2;
	}
	
	public static double add(double d1, double d2, double d3) {
		return d1+d2+d3;  
	}
	/*
	 * Method: playGame 
	 * 1. Name: playGame 
	 * 	  Params : int, string 
	 *	  return : boolean 
	 *
	 *2.  Name: playGame 
	 * 	  Params : string, int  
	 *	  return : boolean 
	 *
	 *gamename, numberOfPlayers
	 *print playing [game] with [that  many] players
	 *if number of players more >= 2 then return true; 
	 */
	
	public static boolean playGame(int players, String game) {
		
		if (players >= 2) {
			System.out.println("Playing <" + game + "> with <" + players + ">players");
			return true;
		} else 
			return false; 
	}
	
	public static boolean playGame(String game, int players) {
		
		if (players >= 2) {
			System.out.println("Playing <" + game + "> with <" + players + ">players");
			return true;
		} else 
			return false; 
	}
	
	/*
	 * Method: work 
	 * 1. params: String. JobType 
	 * 	  returns: boolean 
	 * 	  if job is sdet or devloper, then true, else false 
	 * 	  printing as ,<JobType> and it is fun 
	 * 
	 * 2. params: int -> hours 
	 * 	  return double -> salary, salary = hours * 60; 
	 * 		print: Worked <this many> hours and made <that much> income 
	 */
	
	
		public static boolean work(String jobType) {
			
			if (jobType.equals("sdet") || jobType.equals("developer")) {
				System.out.println(jobType + " and it is fun");
				return true; 
			} else  
				return false;  
		}
	
		public static double work(int hours) {
		 
			double salary = hours * 60; 
			System.out.println("Worked" + hours + "and made " + salary + " income ");
			return salary; 
		}
		
		
}
