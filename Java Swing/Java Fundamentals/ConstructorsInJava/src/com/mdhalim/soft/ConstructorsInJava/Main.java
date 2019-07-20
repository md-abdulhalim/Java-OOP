package com.mdhalim.soft.ConstructorsInJava;

public class Main {

	public static void main(String[] args) {
		
		// constructor is block of code which run when you use new keywords in order to instantiate of an object.
		//constructor look like a method. however but it is not a method , because method has return type.
		//Tiger myTriger =new Tiger();
		
	/*	System.out.println(myTriger.getSpeed());
		 
		myTriger.fight();*/
		
		Tiger mySecondTiger = new Tiger(); // without any constructor.
		Tiger myThirdTiger = new Tiger(2,4); // with two parameter 
		Tiger myFourthTiger = new Tiger(10); // with single parameter. 
		
		System.out.println(myFourthTiger.getSpeed());

	}

}
