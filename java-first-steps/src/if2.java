
public class if2 {

	public static void main(String[] args) {
		System.out.println("Hello word!!");
		
		int age = 18;
		int peopleQuantity = 2;
		boolean isNotAlone = peopleQuantity > 1;
		boolean isAllowToEnter = age >= 18 && isNotAlone;
		
		System.out.println("the value from condition is " + isNotAlone);
		
		if (age >= 18 || peopleQuantity >= 2) {
			System.out.println("You can go inside");
			
		} else {
			System.out.println("You can't go inside, you are too young");
		}
		
		if (isAllowToEnter) {
			System.out.println("You can go inside");
			
		} else {
			System.out.println("You can't go inside, you are too young");
		}
		
	}
}