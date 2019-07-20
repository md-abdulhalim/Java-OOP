package com.mdhalim.soft.GettersAndSetters;

public class Dog {

	 int speed =90;
	 
	 public int getSpeed() {
		 speed =speed*2;
		 return speed;
	 }
	 
	 public void setSpeed(int value) {
		 value = value+5;
		 speed =value;
	 }
	
	/*public int getSpeed() {
		return speed;
	}
	*/
	/*public void setSpeed(int value) {
		speed =value; // int value is the local variable .
	}*/
	
	/*public void setSpeed(int speed) {
		this.speed = speed;
	}*/
	
	
	
	int power =100;
	public int getPower() {
		return power;
	}

	/*public void setPower(int value) {
		power = value;
	}
*/
	public void setPower(int power) {
		this.power =power;
	}
	
	void run() {
		System.out.println("RUN....");
	}
	
	void sleep() {
		System.out.println("SLEEP....");
	}
}
