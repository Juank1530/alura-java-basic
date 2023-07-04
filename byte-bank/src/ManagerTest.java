
public class ManagerTest {

	public static void main(String[] args) {
		Manager manager1 = new Manager();
		
		manager1.setId("MyId");
		manager1.setName("Jairo");
		manager1.setSalary(150000);
		manager1.setPassword("Admin123");
		
		System.out.println(manager1.login(manager1.getPassword()));

	}
}
