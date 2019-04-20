package day36_overloading_arrayList;

public class overloadedMethodTeacher {
	 

	public static void main(String[] args) {
		System.out.println( add(100, 400) );
		System.out.println( add(12.43, 100.2 , 65) );
		System.out.println( add(12.4 , 100));
		
		System.out.println( playGame("ping pong" , 4) );
		System.out.println( playGame(6, "ping pong") );
	}
	
	/*
	 * 2 methods : add
	 * 1st: add
	 * 	   params: 2 ints
	 * 	   return: int
	 * 
	 * 2nd: add
	 * 		params: 3 doubles
	 * 		return: double
	 */
	
	public static int add(int n1, int n2) {
		return n1+n2;
	}
	
	public static double add(double d1, double d2, double d3) {
		return d1 + d2 + d3;
	}
	
	public static double add(double d1, double d2) {
		return d1 + d2;
	}
	
	/*
	 * Method: playGame
	 * 	1. Name: playGame
	 * 	   Params: string, int  
	 * 	   return: boolean
	 * 
	 * 	2. Name: playGame
	 * 	   Params: int , string
	 * 	   return: boolean
	 * 
	 *  gamename, numberOfPlayers
	 *  Print Playing [game] with [that many] players
	 *  if number of players more >= 2 then return true
	 */
	public static boolean playGame (String game, int players) {
		System.out.println("Playing <" + game + "> with <" + players +"> players");
		return players >= 2;
	}
	
	public static boolean playGame (int players, String game ) {
		System.out.println("Playing <" + game + "> with <" + players +"> players");
		return players >= 2;
	}
	
	/*
	 * Method: work
	 * 		1. params: string. JobType
	 * 		   returns boolean. if job is sdet or developer, then true, else false
	 * 		   prints: working as <JobType> and it is fun
	 *      2. params: int.  -> hours
	 * 		   returns double -> salary = hours * 60
	 * 		   prints: Worked <this many> hours and made <that much> income
	 * 
	 */
	
	public static boolean wor(String jotype) {
		
		if (jotype.equals("SDET") || jotype.equals("developer") ) {
			
			return true; 
		}
		
			return false;
	}

	
	public static boolean work(String jobType) {
		System.out.println("Working as <" + jobType + "> and it is fun!");
		return jobType.equalsIgnoreCase("sdet") || jobType.equalsIgnoreCase("developer"); 
	}
	
	public static double work(int hours) {
		double salary = hours * 60;
		System.out.println("Worked <" + hours +"> and made <$" + salary + "> income" );
		return salary;
	}

}
