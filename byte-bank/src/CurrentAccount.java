
public class CurrentAccount extends Account {

	public CurrentAccount(int agency) {
		super(agency);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean retire(double value) {
		double commission = 0.2;  
		return super.retire(value + commission);
	}

	@Override
	public void deposit(double value) {
		this.balance += value;
		
	}
	
	

}
