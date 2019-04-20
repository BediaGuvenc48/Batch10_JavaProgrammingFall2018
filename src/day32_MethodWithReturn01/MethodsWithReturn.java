package day32_MethodWithReturn01;

public class MethodsWithReturn {
	
public static void main(String[] args) {
	
	
	int ammount = giveme5$();
	System.out.println(ammount);
	
	String name1 = getPresidentName();
	System.out.println("U.S president name is: " + name1);
	String name2 = whatisYourName();
	System.out.println(name2);
		
	}
	
	public static int giveme5$() {
		int d = 5;
		return d;	
	}

	public static String getPresidentName() {
		return "Donald Trump";
	}

	public static String whatisYourName() {
	 	String name = "Khalili";
		return name;
	}


}
