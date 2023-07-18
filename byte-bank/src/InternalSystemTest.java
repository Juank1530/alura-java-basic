
public class InternalSystemTest {

	public static void main(String[] args) {
		InternalSystem system = new InternalSystem();
		Manager manager1 = new Manager();
		Administrator admin1 =  new Administrator();
		
		system.loging(manager1);
		system.loging(admin1);

	}

}
