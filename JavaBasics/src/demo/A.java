package demo;

public class A { 
	
	public void day(){ // method is being accessed by b and c. 
		//if this is made private, it can only be accessed by A and not 
		//B and C.
		//if this is made protected, property can be accessed within the package.
		//outside the package it is visible only through inheritance. (use extends in class c)
		//Default - property is visible inside class only. if nothing is written, then it becomes default.
		System.out.println("Today is Sunday!");
	}

	public static void main(String[] args) {
		A obj = new A();
		obj.day();
	}
}
