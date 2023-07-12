
public class AccountTest {

	public static void main(String[] args) {
		
		CurrentAccount cc = new CurrentAccount(1);
		SavingsAccount sa = new SavingsAccount(1);
		
		cc.deposit(2000);
		cc.trasnfer(1000, sa);
		
		System.out.println(cc.getBalance());
		System.out.println(sa.getBalance());
		

	}

}
