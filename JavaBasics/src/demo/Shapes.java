package demo;

public class Shapes {

	int length;
	int breadth;
	
	public Shapes(){
		length = 3;
		breadth = 2;
	}
	public Shapes(int a, int b){
		length = a;
		breadth = b;
	}
	public void area(){
		System.out.println("Area of Rectangle = " + (length*breadth)+ "cm.sq");
	}
	public static void main(String[] args){
		Shapes rectangle1 = new Shapes();
		rectangle1.area();
		
		Shapes rectangle2 = new Shapes (8,4);
		rectangle2.area(); 
		
		
	}
}
	
	
	
