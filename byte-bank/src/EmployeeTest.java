
public class EmployeeTest {

	public static void main(String[] args) {
		Employee juank = new Accountant();
		juank.setName("Juank");
		juank.setId("99999");
		juank.setSalary(850000);
		
		System.out.println(juank.getSalary());
		System.out.println(juank.getBonus()); 

	}

}
