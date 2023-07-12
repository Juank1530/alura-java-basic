
public class Accountant extends Employee{
	
	@Override
	public double getBonus() {
		System.out.println("Ruing from Accountant");
		return 200;
	}

}
