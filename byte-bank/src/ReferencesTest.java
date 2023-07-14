
public class ReferencesTest {

	public static void main(String[] args) {
		Employee employee1 = new Accountant();
		Manager manager1 = new Manager();
		
		manager1.setName("Diana");
		
		employee1.setSalary(1500000);
		manager1.setSalary(2500000);
		
		
		

	}

}
