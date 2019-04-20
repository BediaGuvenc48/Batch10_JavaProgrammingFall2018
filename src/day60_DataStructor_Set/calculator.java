package day60_DataStructor_Set;

public class calculator {
	

    public static void main(String[] args) {

       int num = calcultor(100, 50, '/');
       System.out.println(num);

    }


    public static int calcultor(int x, int y, char operator){

        int result = 0;

        switch (operator){
            case '+':
                result = x + y;
                return result; 

            case '-':
                result = x - y;
                return result;
            case '*':
                result =  x * y;
                return result;
            case '/':
                result = x / y;
                return result;
        }
        return result;
    }

}
