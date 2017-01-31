package inheritance;

public class HR extends Management{
		
	private int bonus = 12000;
	
	public static void main(String[] args){
		HR Sham = new HR();
		
		System.out.println("Total Remuneration of Sham = $" + (Sham.Salary+Sham.bonus));
		
		Sham.message();
		
	}
}
