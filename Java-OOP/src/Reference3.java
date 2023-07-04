
public class Reference3 {

	public static void main(String[] args) {
		
		Account account3 = new Account();
		account3.getOwner().setName("Juank");//Here I can access to the attributes from the object 
		System.out.println(account3.getOwner().getName()); // With the reference the object has been stared 
		

	}

}
