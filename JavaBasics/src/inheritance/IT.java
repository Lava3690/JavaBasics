package inheritance;

public class IT extends Management{
	// use extends for inheritance 
	
	private int bonus = 10000; // declare variable 
	
	//public void greetings(){
		//System.out.println("Hello All IT folks!");
	//} - Method Overriding - Over riding greeting() message from Management class 
	
	public static void main(String[] args) {
		IT Ram = new IT(); // object 
		
		System.out.println("Salary of Ram = $" + Ram.bonus); // calling of the object
		System.out.println("Bonus of Ram = $" + Ram.Salary);
		
		Ram.greetings();
		Ram.message();
		
				
	}

}
