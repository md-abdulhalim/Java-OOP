package com.mdhalim.soft.ConstructorsInJava;

public class Tiger {

	//constructor name must be same as its class name.
	//private int speed =40;
	public Tiger() {
		System.out.println("This is a defualt constructor ");
	}
	
	public Tiger(int num1 ,int num2) {
			
		int resutl=num1 +num2;
		System.out.println(resutl);
	}
	
	private int speed =10;
	public Tiger(int sum) {
		int increment =speed+sum;
		System.out.println(increment);
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed =speed;
	}
	
	public void fight() {
		System.out.println("FIGHT....");
	}
}
