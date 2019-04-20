package day42_classes_03_Canstructor;

public class MathEquation {
	
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
	
	
	private double leftVal; 
	private double rightVal; 
	private char opCode; 
	private double result;
	
	public double getLeftVal() {
		return leftVal;
	}
	public void setLeftVal(double leftVal) {
		this.leftVal = leftVal;
	}
	public double getRightVal() {
		return rightVal;
	}
	public void setRightVal(double rightVal) {
		this.rightVal = rightVal;
	}
	public char getOpCode() {
		return opCode;
	}
	public void setOpCode(char opCode) {
		this.opCode = opCode;
	}
	
	public void MathEquation(char opCode) {
		
		this.opCode = opCode; 
	
	}
	
	public void MathEquation(char opCode, double leftVal, double rightVal) {
		
		this.opCode = opCode; 
		this.leftVal = leftVal; 
		this.rightVal = rightVal; 
	
	}
	
	public double getResult() {
		
		return result; 
	}
	
	
	/*Create a method called execute , take no parameter return nothing , logic as below 
		      if opCode is 'a' add 2 numbers and set the result field value 
		      if opCode is 's' subtract 2 numbers and set the result field value 
		      if opCode is 'm' multiply 2 numbers and set the result field value 
		      if opCode is 'd' divide 2 numbers and set the result field value 
		     if nothing match result field will be 0; */ 
	
	
	public void execute() {
		
		switch (opCode) {
		
		case 'a': 
			System.out.println(leftVal + rightVal);
			break; 
		case 's': 
			System.out.println(leftVal - rightVal);
			break; 
		case 'm': 
			System.out.println(leftVal * rightVal);
			break; 
		case 'd': 
			System.out.println(leftVal / rightVal);
			break; 
		default: 
			System.out.println("0"); 
		
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	
//	private double leftVal; 
//	private double rightVal; 
//	private char opCode; 
//	private double result;
//	
//		
//		public MathEquation() {
//			
//			leftVal = 15.55; 
//			rightVal = 17.99; 
//			opCode = 'A'; 
//		 
//		}
//	
//		
//		public MathEquation(char opCode, double leftVal, double rightVal, double result) {
//		
//		
//		this.leftVal = leftVal; 
//		this.rightVal = rightVal; 
//		this.opCode = opCode; 
//		this.result = result; 
//		
//		}
//	
////		public void execut() {
////			
////			if (opCode == 'A') {
////				System.out.println(leftVal+rightVal);
////				
////			}
////			
////			if ()
////		}
////	
//	
//
//
//
//	public double getLeftVal() {
//		return leftVal;
//	}
//	public void setLeftVal(double leftVal) {
//		this.leftVal = leftVal;
//	}
//	public double getRightVal() {
//		return rightVal;
//	}
//	public void setRightVal(double rightVal) {
//		this.rightVal = rightVal;
//	}
//	public char getOpCode() {
//		return opCode;
//	}
//	public void setOpCode(char opCode) {
//		this.opCode = opCode;
//	}
//	public double getResult() {
//		return result;
//	}
//	public void setResult(double result) {
//		this.result = result;
//	} 
//	
//	
//	
//
}
