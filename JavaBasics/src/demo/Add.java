package demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		
		try{ //Exception handler. (try and catch). Try to execute the test part
			//and if something goes wrong with try block then control should move to catch
			//block. in catch we define what should be the output and what action
			//needs to be taken when exception occurs.
		Scanner k = new Scanner(System.in);//whenever we have to take inputs from the
		//user, use Scanner tag. System.in is input stream.
		
		System.out.println("Please enter a number : ");
		int num1 = k.nextInt();//after user enters a number, the system will ask him
		//to enter another number
		
		System.out.println("Please enter a second number :");
		int num2 = k.nextInt();
		
		System.out.println("Result of division of " + num1 + " with " + num2 + " = " + (num1/num2));
		}
		
		catch(InputMismatchException e){
			System.out.println("Please do not enter a zero in the denominator");
		}
		catch(ArithmeticException e){
			System.out.println("Please enter an integer value");
		}
		catch(Exception e){
		System.out.println("Please enter a valid input");//if something goes wrong,
		//control should come to catch block.
	}
		}
	}


