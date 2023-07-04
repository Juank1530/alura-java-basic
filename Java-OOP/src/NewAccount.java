
public class NewAccount {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer();
		customer1.setName("Julio");;
		
		Account firstAccount = new Account();
		firstAccount.deposit(1000);
		firstAccount.setAgency(1);
		firstAccount.setNumber(9999);
		firstAccount.setOwner(customer1);
		
		System.out.println(firstAccount.getBalance());
		
		Account secondAccount = new Account();
		secondAccount.deposit(800);
		
		System.out.println(secondAccount.getBalance());

	}

}
