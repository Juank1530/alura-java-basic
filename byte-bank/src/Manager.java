
public class Manager extends Loginable {
	
	
	//Method Override  
	public double getBonus() {
		System.out.println("Ruing from Manager");
		return 2000;
	}

	@Override
	public boolean login(String password) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	

}
