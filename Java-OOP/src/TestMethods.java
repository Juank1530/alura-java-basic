public class TestMethods {
	
	public static void main(String[] args) {
		
		Account myAccount = new Account();
		myAccount.deposit(200);
		
		Account myAccount2 = new Account();
		myAccount2.deposit(200);
		
		myAccount.deposit(1800);
		System.out.println(myAccount.getBalance());
		
		myAccount.retire(100);
		System.out.println(myAccount.getBalance());
		
		boolean availableToTransfer = myAccount2.trasnfer(800, myAccount);
		
		if (availableToTransfer) {
			System.out.println("Successful Transfer!");
		} else {
			System.out.println("Unsuccessful Transfer, you do not have enough money in your account.");
		}
		
		System.out.println(myAccount.getBalance());
		System.out.println(myAccount2.getBalance());
		
	}

}
