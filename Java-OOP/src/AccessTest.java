
public class AccessTest {

	public static void main(String[] args) {
		Account account4 = new Account();
		account4.setAgency(-45);
		account4.deposit(400);
		account4.retire(300);
		System.out.println(account4.getAgency());
		System.out.println(account4.getBalance());
	}
}
