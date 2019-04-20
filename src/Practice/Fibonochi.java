package Practice;

public class Fibonochi {
	
	public static void main(String[] args) {
		int a =0;
		int b=1;
		System.out.print(a+" "+b+" ");
		for (int i=2; i<=8;i++) {
			int c= a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
			
		}
		
		
		int number=12243546;
		int reverse=0;
		int remainder=0;
		
		while(number>0) {
			remainder=number%10;
			reverse=reverse*10+ remainder;
			number=number/10;
		}
		System.out.println(reverse);
		
		System.out.println(reverse("Alhabet"));
	}
	
	
public static String reverse(String str) {
	
	//StringBuilder sb=new StringBuilder(str);
	
	//return sb.reverse().toString();
	
	return" ";
}



}
