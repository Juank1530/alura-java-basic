
public class NewAccount {

	public static void main(String[] args) {
		account firstAccount = new account();
		firstAccount.balance = 1000;
		firstAccount.agency = 10;
		firstAccount.number = 9999;
		firstAccount.owner = "Juank";
		
		System.out.println(firstAccount.balance);
		
		account secondAccount = new account();
		secondAccount.balance = 800;
		
		System.out.println(secondAccount.balance);

	}

}
