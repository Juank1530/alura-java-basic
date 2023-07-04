
public class References {

	public static void main(String[] args) {
		
		Account firstAccount = new Account();
		firstAccount.deposit(500);
		System.out.println(firstAccount.getBalance());
		
		Account secondAccount = firstAccount;
		secondAccount.deposit(200);
		
		Account thridAccount = new Account();
		firstAccount.deposit(900);
		System.out.println(thridAccount.getBalance());
		
		
		System.out.println(firstAccount.getBalance());
		
		firstAccount.deposit(600);
		System.out.println(firstAccount.getBalance());
		
		System.out.println(firstAccount);
		System.out.println(secondAccount);
		
		if (firstAccount == secondAccount) {
			System.out.println("They are the same object");
		} else {
			System.out.println("They are not the same object");
		}
		
		if (firstAccount == thridAccount) {
			System.out.println("They are the same object");
		} else {
			System.out.println("They are not the same object");
		}
		
	}
}
