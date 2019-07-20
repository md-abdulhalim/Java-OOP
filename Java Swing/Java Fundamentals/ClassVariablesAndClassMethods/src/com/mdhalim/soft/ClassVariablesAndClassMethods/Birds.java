package com.mdhalim.soft.ClassVariablesAndClassMethods;

public class Birds {

	//private int speed =200;
	//public static int speed =200; // in order to class variable. (1)
	
	
	/*public int getSpeed() {
		return speed;
	}*/
	 
	public static int speed = 200; //when we used static keyword then it is called class variable.

	public static int getSpeed() { // this is called class method.
		return speed;
	}

	public static void setSpeed(int value) {
		speed = value;
	}

	public static void fly() {
		System.out.println("FLY....");
	}
}
