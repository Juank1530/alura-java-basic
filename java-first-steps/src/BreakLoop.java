
public class BreakLoop {

	public static void main(String[] args) {
		
		for (int row = 0; row <= 10; row++) {
			for (int column = 0; column <= 10; column++) {
				if (column > row) {
					break;
				}
				System.out.print("*");
				System.out.print("");
			}	
			System.out.println();
		}
		
		for (int row = 0; row <= 10; row++) {
			for (int column = 0; column < row; column++) {
				System.out.print("*");
				System.out.print("");
			}	
			System.out.println();
		}
	}
}
