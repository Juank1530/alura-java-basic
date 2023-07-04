
public class Account {

	private double balance;
	private int agency;
	private int number;
	private Customer owner = new Customer(); // This is a default value to a new customer
	private static int total = 0; 

	// Constructors

	public static int getTotal() {
		return total;
	}

	public Account() {

	}

	public Account(int agency) {
		total ++;	
		if (agency <= 0) {
			System.out.println("The number should be older than 0");
			this.agency = 1;
			System.out.println("Value for default to agency is: " + this.agency );
		} else {
			this.agency = agency;
			System.out.println("There are " + total + " accounts in total.");
		}
	}

	public Customer getOwner() {
		return owner;
	}

	public void setOwner(Customer owner) {
		this.owner = owner;
	}

	public void deposit(double value) {
		this.balance += value;
	}

	public boolean retire(double value) {
		if (this.balance >= value) {
			this.balance -= value;
			return true;
		}
		return false;
	}

	public boolean trasnfer(double value, Account account) {
		if (this.balance >= value) {
			this.retire(value);
			account.deposit(value);
			return true;
		}
		return false;
	}

	public int getAgency() {
		return agency;
	}

	public void setAgency(int agency) {
		if (agency > 0) {
			this.agency = agency;
		} else {
			System.out.println("Is not allow negative values");
		}
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

}
