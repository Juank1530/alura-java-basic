
public class IfExample {

	public static void main(String[] args) {
		System.out.println("Hello word!!");
		
		int age = 17;
		int quantity = 1;
		
		if (age >= 18) {
			System.out.println("You can go inside");
			
		} else {
			if (quantity >= 2) {
				System.out.println("You are too young, but you are allow to go inside");
			} else {
				System.out.println("You can't go inside, you are too young");
			}
		}
	}
}
