package CollectionPractice;

import java.util.*; 

public class InterviewQuestions {
	
	
public static void main(String[] args) {
        
	String st = "Limit"; 

  	 char [] str = st.toCharArray(); 

  	 String temp = ""; 

  	 for (int idx = str.length-1; idx >= 0; idx--){

  	 	temp += str[idx]; 

  	 }

  	 System.out.println(temp); 
	
	
//      fizzBuzz(9);
        
//      pattern();
        
        
        countVowelConsonant("kilic");
        
        Reverse("Khalil"); 
        
        //System.out.println(getSum(2009));
    }
    
    //1.please write a  static  void method take a string  and  reverse String (How many way can we do?)
    //kilic
    //{'k', 'i', 'l', 'i', 'c' }
    
    public static String reverse(String word) {
        String reverseOfWord = "";//c
        for(int i = word.length()-1;i>=0;i--) {
            reverseOfWord = reverseOfWord + word.charAt(i);
        }
        return reverseOfWord;
    }
    
    public static void reverse2(String word) {
        StringBuilder sb = new StringBuilder(word);
        sb = sb.reverse();
        System.out.println(sb);
    }
    
    public static void reverse3(String word) {
        char[] charAr = word.toCharArray();//{'k', 'i', 'l', 'i', 'c' }
        for(int i = charAr.length-1;i>=0;i--) {
            System.out.print(charAr[i]);
        }
    }
    
    
    
 //2. please  write a  static void  method  to check whether prime number is not?
        
    public static boolean isPrime(int num) {
        boolean prime = true;
        if(num <= 1) {
            prime = false;
        }
        for(int i = 2 ; i < num ; i ++) {
            if(num%i==0) {
                prime = false;
            }
        }
        
        return prime;
    }
        
        
        
        //3.Given a number , find sum its digits..
    
    //sum = 7+8+6
    //
    
        //Input : n = 687  Output : 21
        //write a  static method  called getSum take a integer return integer?
        public static int getSum(int i) {
            int sum = 0;
            while(i > 0) {
                sum = sum + i % 10;
                i = i / 10;
            }
            return sum;
        }
        
        
        
        //4 
        /* For numbers 1 through n,
        if the number is divisible by 3 print Fizz;
        if the number is divisible by 5 print Buzz;
        if the number is divisible by 3 and 5 (15) print FizzBuzz;
        else, print the number itself.
        */
        
        public static void fizzBuzz(int number) {
            if((number%3==0)&&(number%5==0)) {
                System.out.println("FizzBuzz");
            }else if(number%3==0) {
                System.out.println("Fizz");
            }else if(number%5==0) {
                System.out.println("Buzz");
            }
        }
        
        //5.Count number of Vowels & Consonants
        //count o , u // c,n,t
        //a,e,o,u,i
        //b,c,d,f,
        //Write a method that take String , return the count of vowels and Consonants ?
        public static void countVowelConsonant(String word) {
            int countVowel=0; int countConsonant=0;
            
            List<Character> vowels= new ArrayList();
            
            vowels.add('a');
            vowels.add('o');
            vowels.add('u');
            vowels.add('i');
            vowels.add('e');
            
            List<Character> consonants = new ArrayList();//b,c,d,f,h,j
            
            word=word.toLowerCase();
            
            for(char i='a';i<='z';i++) {
                if(!vowels.contains(i)) {
                    consonants.add(i);
                }
            }
            
            //kilic
            
            
            for(int i=0; i<word.length();i++) {
                if(consonants.contains(word.charAt(i))) {
                    countConsonant++;
                }else {
                    countVowel++;
                }
            }
            System.out.println("The count of consonant "+ countConsonant+ " the count of vowels "+ countVowel);
        }
        
        
        
        
        //6.how we can write this code?
    /*
         a
         ab
         aba
         abab 
         */
        
        public static void pattern() {
            
            for (int i = 1; i < 5; i++) {
                for (int j = 1; j <= i; j++) {
                    if(j%2!=0) {
                        System.out.print("a");
                    }else {
                        System.out.print("b");
                        }
                    }
                System.out.println();
                }
                
            }
        
        
        
        public static void Reverse(String n){

    		StringBuilder stb = new StringBuilder(); 

    		stb.append(n); 
    		stb = stb.reverse();
			System.out.println(stb);
    	}

        public static void Revers(String str){

       	 StringBuilder stb = new StringBuilder(); 

       	 	stb.append(str); 
       	 	stb = stb.reverse(); 
       	 	System.out.println(stb); 

       	 }
        
    public static int sum(int num) {
    	int sum = 0; 
    	while (num > 0) {
    		
    		sum += num % 10; 
    		num = num / 10; 
    	}
    	return sum; 
    } 

        
	
	

}
