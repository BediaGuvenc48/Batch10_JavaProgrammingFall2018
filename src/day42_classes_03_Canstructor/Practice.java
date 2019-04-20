package day42_classes_03_Canstructor;

/*Create a class called MathEquation 

Create 4 private  instance variables 
 leftVal as double;
 rightVal as double
 opCode as char;
 result as double;

Create Getter and Setter for first 3 fields 

Create constructors : 
  
  Create one argument constructor to set the value for opCode
      Create 3 arguments constructor to set the value for opCode, leftVal, rightVal
      Create just getter for result. 

Create a method called execute , take no parameter return nothing , logic as below 
      if opCode is 'a' add 2 numbers and set the result field value 
      if opCode is 's' subtract 2 numbers and set the result field value 
      if opCode is 'm' multiply 2 numbers and set the result field value 
      if opCode is 'd' divide 2 numbers and set the result field value 
     if nothing match result field will be 0; 

Create a class called CalculatorEngine with main method 
     Create 4 MathEquation instances with all 3 field value set
     Create an array to store these 4 MathEquation instances 
     Loop through it and print out the result of your operation*/

public class Practice {
	
	private double leftVal;
	private double rightVal;
	private char opCode; 
	private double result;
	
	public double getleftVal() {
		return leftVal; 
	}
	
	public void setleftVal(double leftVal) {
		this.leftVal = leftVal; 
	}
	
	public double getrightVal() {
		return rightVal; 
	}
	
	public void setrightVal(double rightVal) {

		this.rightVal = rightVal; 
	}
	
	public char getopCode() {
		
		return opCode; 
	}
	
	public void setopCode(char opCode) {
		this.opCode = opCode; 
	}
	
	public double getresult() {
		return result; 
	}
	
	public void setresult(double result) {
		this.result = result; 
	}
	
	public Practice(char opCode) {
		
		this.opCode = 'A'; 
		
	}
	
	public Practice(double righVal, double leftVal, char opCode) {
		
		this.opCode = 'A'; 
		this.leftVal = 0.0; 
		this.rightVal = 0.0; 
		
	}
	
	
	public void execute() {
		
		if (opCode == 'a') {
			
		}
	}
	
	
	 	
}

	