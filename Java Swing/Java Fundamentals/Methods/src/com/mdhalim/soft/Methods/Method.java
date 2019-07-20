package com.mdhalim.soft.Methods;

public class Method {

	public static void main(String[] args) {
		
		// Methods
		//doSomething();
		
		//multiplyTwoNumber();
		
		//System.out.println(addTwoNumbersTogether());
		//int result =addTwoNumbersTogether();
		//System.out.println(result);
		
		//substractTwoNumbers(20, 5);
		
		//System.out.println(divideTwoNumbers(20, 2));
		//float result = divideTwoNumbers(40, 2);
		//System.out.println(result);
		
		
		//System.out.println(substractTwoNumbers(2.0f, 0.5f));
		substractTwoNumbers(5.0f,2.5f);
		

	}

	static void doSomething() {
		System.out.println("This text come from the doSomething method.");
	}
	
	static void multiplyTwoNumber() {
		int a =10;
		int b =10;
		int result = a*b;
		System.out.println(result);
	}
	
	static int addTwoNumbersTogether() {
		
		int a =5;
		int b =5;
		int result = a + b;
		return result;
	}
	
	static void substractTwoNumbers(int num1 , int num2) {
		
		int result = num1-num2;
		System.out.println(result);
	
	}
	
	static float divideTwoNumbers(float num1 , float num2) {
		float result = num1 / num2;
		return result;
	}
	
	static float substractTwoNumbers(float numA , float numB){
		
		float reult =numA - numB;
		
		 System.out.println( reult);
		 return reult;
	}
	
	
		
}
