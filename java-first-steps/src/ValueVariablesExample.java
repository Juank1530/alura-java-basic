
public class ValueVariablesExample {
	public static void main(String[] args) {
		
		int number1 = 5;
		int number2 = 9;
		
		System.out.println(number2);
		
		number2 = number1; // Here the new value is 5
		System.out.println(number2);
		
		number1 = 88;
		//number2 = ??  -> 5
		System.out.println(number2);
		
	}

}
