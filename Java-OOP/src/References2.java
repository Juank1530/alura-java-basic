
public class References2 {

	public static void main(String[] args) {
		
		Customer client1 = new Customer();
		client1.setName("Juank");
		client1.setId("80921396");
		client1.setPhone("3165006116");
		
		Account account1 = new Account();
		
		account1.setAgency(1);
		account1.setOwner(client1); 
		
		System.out.println(account1.getOwner().getId());
		System.out.println(account1.getOwner());
		System.out.println(account1);
		
	}
}
