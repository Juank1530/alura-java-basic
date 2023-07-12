
public class ControlBonusTest {

	public static void main(String[] args) {
		Employee juank = new Employee();
		juank.setSalary(2000);
		
		Manager Diana = new Manager();
		Diana.setSalary(10000);
		
		Accountant Cristian = new Accountant();
		Cristian.setSalary(5000);
		
		BonusControl bonus1 = new BonusControl();
		
		bonus1.setSalary(juank);
		bonus1.setSalary(Diana);
		bonus1.setSalary(Cristian);
	}

}
