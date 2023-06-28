
public class ThreeMultiplays {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			if (i% 3 == 0) {
				System.out.println(i);
			}
		}
		
		for (int i = 3; i <= 100; i += 3) {
			System.out.println(i);
		}
		
		int count = 3;
		while (count <= 100) {
			if (count% 3 == 0) {
				System.out.println(count);
				count += 3;
			}
		}
	}
}
