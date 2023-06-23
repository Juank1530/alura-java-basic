public class MariaStore {

	public static void main(String[] args) {
		
		double buyValue = 50.0;
        double discount = 0.0;
		boolean firstRange = buyValue >= 100.0 && buyValue < 200.0;
		boolean secodRange = buyValue >= 200.0 && buyValue < 300.0;
		boolean thirdRange = buyValue >= 300.0;

        if (firstRange) {
        	discount = 10.0;
        } else if (secodRange) {
        	discount = 15.0;
        } else if (thirdRange) {
        	discount = 20.0;
        } else {
        	discount = 0;
        }

        double finalValue = buyValue - (buyValue * (discount / 100));

        System.out.println("Your buy is: $" + buyValue);
        System.out.println("Your discount is: " + discount + "%");
        System.out.println("You saved: $" + buyValue * (discount / 100));
        System.out.println("Your final pay is: $" + finalValue);
	}
}
