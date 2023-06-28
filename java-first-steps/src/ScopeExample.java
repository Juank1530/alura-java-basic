
public class ScopeExample {

	public static void main(String[] args) {
		System.out.println("Hello word!!");
		
		int age = 18;
		int peopleQuantity = 3;
		boolean isNotAlone; // Boolean variable always is false by default  

		
		if (peopleQuantity > 1) {
			//According the context the variable's value can use or not, for example out this if
			// It is no possible to use it
			isNotAlone = true;
		} else {
			isNotAlone = false;
		}
		
		boolean isAllowToEnter = age >= 18 && isNotAlone;
		
		
		
		System.out.println("the value from condition is " + isNotAlone + isAllowToEnter);
				
	}

}
