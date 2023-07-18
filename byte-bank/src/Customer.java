
public class Customer extends Loginable{
	
	private String name;
	private String id;
	private String phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public boolean login(String password) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public double getBonus() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
