package inheritance;

public class Security extends Management{
	
    
	
	private int bonus = 5000;
	
	public void main(){
		System.out.println("All employess will have 3 WFHs form next month onwards");
		
	}

	public static void main(String[] args) {
		Security Murali = new Security();
		
		Murali.message();
	}
}
