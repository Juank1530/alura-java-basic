
public class Manager extends Employee {
	
	private String password = "Admin123";
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}

	public boolean login(String password) {
		return password == "Admin123";
	}
	
	
	
	
	

}