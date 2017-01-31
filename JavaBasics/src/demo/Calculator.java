package demo;


public class Calculator { // Add method/module. Step 4 of the program.
  public void add (int a, int b){
	 System.out.println(a+b);
  } 
  public void subtract (int a, int b){
	 System.out.println(a-b);
  }
  public void multiply (int a, int b){
	  System.out.println(a*b);
  }
  public void divide (int a, int b){
	  System.out.println(a/b);
  }
  
  //entry point of the program. Step 1:
	public static void main(String[] args){ // main method/power source 
	  
  //second step of program. step 2:
		Calculator basicCal = new Calculator(); // object or connection or battery. class object = new class
		
		//Step 3:
		basicCal.add(10, 20); // add is the method
		basicCal.add(30, 40);
		basicCal.subtract(40,10);
		basicCal.multiply(20,2);
		basicCal.divide(20,5);
  }
	
}
