
public class SavingsAccount extends Account {

	public SavingsAccount(int agency) {
		super(agency);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double value) {
		this.balance += value;
		
	}
	
	

}
