
public abstract interface Loginable extends Employee {
	
	//private String password = "Admin123";
	
	public void setPassword(String password);
	
	public abstract boolean login(String password);

	
	

}
