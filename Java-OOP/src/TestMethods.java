public class TestMethods {
	
	public static void main(String[] args) {
		
		account myAccount = new account();
		myAccount.deposit(200);
		
		account myAccount2 = new account();
		myAccount2.deposit(200);
		
		myAccount.deposit(1800);
		System.out.println(myAccount.balance);
		
		myAccount.retire(100);
		System.out.println(myAccount.balance);
		
		boolean availableToTransfer = myAccount2.trasnfer(800, myAccount);
		
		if (availableToTransfer) {
			System.out.println("Successful Transfer!");
		} else {
			System.out.println("Unsuccessful Transfer, you do not have enough money in your account.");
		}
		
		System.out.println(myAccount.balance);
		System.out.println(myAccount2.balance);
		
	}

}
