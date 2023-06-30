
public class References {

	public static void main(String[] args) {
		
		account firstAccount = new account();
		firstAccount.balance = 500;
		System.out.println(firstAccount.balance);
		
		account secondAccount = firstAccount;
		secondAccount.balance = 200;
		
		account thridAccount = new account();
		firstAccount.balance = 900;
		System.out.println(thridAccount.balance);
		
		
		System.out.println(firstAccount.balance);
		
		firstAccount.balance += 600;
		System.out.println(firstAccount.balance);
		
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
