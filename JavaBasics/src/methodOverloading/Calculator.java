package methodOverloading;

public class Calculator {
	
	public void add(int a, int b){
		System.out.println(a + b);
	}
	public void add(int a, int b, int c){
		System.out.println(a + b + c);
	}

	public static void main(String[] args){
		Calculator basicCal = new Calculator();
		
		basicCal.add(30, 50);
		
		basicCal.add(40, 40, 50);
		
	

}
}