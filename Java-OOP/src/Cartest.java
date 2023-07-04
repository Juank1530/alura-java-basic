
public class Cartest {

	public static void main(String[] args) {
		Car car1 = new Car(1958,"Mustang", 500000);
		Car car2 = new Car("Mustang", 500000);
		
		Car car4 = new Car(1602,null, 0);
		Car car5 = new Car("Mustang", 500000);
		
		System.out.println(car4.getYear());
		System.out.println(car4.getPrice());
		System.out.println(car4.getModel());
		
		System.out.println(car5.getYear());
		System.out.println(car5.getPrice());
		System.out.println(car5.getModel());
		
	}
}
