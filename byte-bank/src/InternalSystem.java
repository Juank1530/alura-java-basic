
public class InternalSystem {
	
	private String password = "12345";
	
	public boolean loging(Loginable manager) {
		boolean canLogin = manager.login(password);
		if (canLogin) {
			System.out.println("Successful Login");
			return true;
		} else {
			System.out.println("Error Login");
			return false;
		}
	} 	

}
