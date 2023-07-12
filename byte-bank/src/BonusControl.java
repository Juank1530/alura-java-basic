
public class BonusControl {
	
	private double sum;
	
	public double setSalary(Employee employee) {
		this.sum = employee.getBonus() + this.sum;
		System.out.println("Current value " + this.sum);
		return this.sum;
	}
	
	
	/* We don't need to use this methods due the polymorphism help us with this because all instance 
	 * are from the same object    
	public double setSalary(Manager manager) {
		this.sum = manager.getBonus() + this.sum;
		System.out.println("Current value " + this.sum);
		return this.sum;
	}
	
	public double setSalary(Accountant accountant) {
		this.sum = accountant.getBonus() + this.sum;
		System.out.println("Current value " + this.sum);
		return this.sum;
	}
	*/

}




















